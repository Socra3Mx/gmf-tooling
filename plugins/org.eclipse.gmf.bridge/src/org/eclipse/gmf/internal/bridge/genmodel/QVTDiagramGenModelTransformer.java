package org.eclipse.gmf.internal.bridge.genmodel;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.m2m.internal.qvt.oml.InternalTransformationExecutor;
import org.eclipse.m2m.internal.qvt.oml.trace.Trace;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;

/**
 * @since 2.0
 */
@SuppressWarnings("restriction")
public class QVTDiagramGenModelTransformer {
	
	private Trace myTrace;
	private final URI transfURI = URI.createURI("platform:/plugin/org.eclipse.gmf.bridge/transforms/Map2Gen.qvto");
	private final ResourceSet resourceSet;
	private Registry registry;
	
	public QVTDiagramGenModelTransformer(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
	
	public ExecutionDiagnostic transform(final Mapping m, final GenModel genModel, final ModelExtent output, final ExecutionContext context) {
		final Resource trace = m.eResource() == null ? resourceSet.createResource(URI.createURI("trace.qvtotrace")) : resourceSet.createResource(
				m.eResource().getURI().trimFileExtension().appendFileExtension("qvtotrace"));
		
		final InternalTransformationExecutor executor = new InternalTransformationExecutor(transfURI) {
			@Override
			protected void handleExecutionTraces(Trace traces) {
				super.handleExecutionTraces(traces);
				trace.getContents().add(traces);
			}
		};
		RuntimeGenModelAccess runtimeAccess = new RuntimeGenModelAccess();
		runtimeAccess.ensure();
		
		final ExecutionDiagnostic result = executor.execute(context, 
				getModelExtent(m), 
				getModelExtent(genModel), 
				getModelExtent(runtimeAccess.genPackage().getGenModel()), 
				output);
		
		this.myTrace = trace.getContents().isEmpty() ? null : (Trace) trace.getContents().get(0);
		
		return result;
	}
	
	public void setRegistry(EPackage.Registry registry) {
		this.registry = registry;
	}
	
	public ExecutionDiagnostic transform(final Mapping m, final GenModel genModel, ModelExtent output, final ExecutionContext context, final URI... extensions) {
		ExecutionDiagnostic result = transform(m, genModel, output, context);
		if (Diagnostic.OK != result.getSeverity()) {
			return result;
		}
		
		GenEditorGenerator outputGenModel = null;
		if (output.getContents().size() == 1 && output.getContents().get(0) instanceof GenEditorGenerator) {
			outputGenModel = (GenEditorGenerator) output.getContents().get(0);
		}
		if (outputGenModel == null) {
			return result;
		}
//		final QvtBridgeExtensionContentAdapter adapter = new QvtBridgeExtensionContentAdapter();
//		outputGenModel.eAdapters().add(adapter);
		output = getModelExtent(outputGenModel);
		for (URI extension: extensions) {
			final InternalTransformationExecutor exec = registry == null ? 
					new InternalTransformationExecutor(extension) : new InternalTransformationExecutor(extension, registry);
			exec.loadTransformation();
			
//			adapter.errors().clear();
			if (1 == exec.getTransformation().getModelParameter().size()) {
				result = exec.execute(context, output);
			} else {
				result = exec.execute(context, getModelExtent(m), getModelExtent(myTrace), output);
			}
			
//			if (!adapter.errors().isEmpty()) {
//				result = new ExecutionDiagnosticImpl(
//					Diagnostic.ERROR,
//					0,
//					"Extension transformation should not modify already set values",
//					adapter.errors().toArray()
//				);
//				return result;
//			}
		}
		
		return result;
	}
	
	public Trace getTrace() {
		return myTrace;
	}
	
	private BasicModelExtent getModelExtent(EObject rootObject) {
		final EList<EObject> mapObjects = new BasicEList<EObject>();
		mapObjects.add(rootObject);
		return new BasicModelExtent(mapObjects);
	}
}
