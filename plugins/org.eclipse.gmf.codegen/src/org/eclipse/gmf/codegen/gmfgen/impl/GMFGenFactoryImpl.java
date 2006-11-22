/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gmf.codegen.gmfgen.*;

import org.eclipse.gmf.codegen.gmfgen.ColorAttributes;
import org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes;
import org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenAuditContainer;
import org.eclipse.gmf.codegen.gmfgen.GenAuditRule;
import org.eclipse.gmf.codegen.gmfgen.GenAuditedMetricTarget;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenConstraint;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenDiagramElementTarget;
import org.eclipse.gmf.codegen.gmfgen.GenDomainElementTarget;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenEditorView;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer;
import org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer;
import org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec;
import org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkConstraints;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenMetricContainer;
import org.eclipse.gmf.codegen.gmfgen.GenMetricRule;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNotationElementTarget;
import org.eclipse.gmf.codegen.gmfgen.GenPlugin;
import org.eclipse.gmf.codegen.gmfgen.GenSeverity;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap;
import org.eclipse.gmf.codegen.gmfgen.LinkLabelAlignment;
import org.eclipse.gmf.codegen.gmfgen.MetamodelType;
import org.eclipse.gmf.codegen.gmfgen.NotationType;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ProviderPriority;
import org.eclipse.gmf.codegen.gmfgen.ResizeConstraints;
import org.eclipse.gmf.codegen.gmfgen.Separator;
import org.eclipse.gmf.codegen.gmfgen.SnippetViewmap;
import org.eclipse.gmf.codegen.gmfgen.SpecializationType;
import org.eclipse.gmf.codegen.gmfgen.ToolEntry;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;
import org.eclipse.gmf.codegen.gmfgen.ValueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFGenFactoryImpl extends EFactoryImpl implements GMFGenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GMFGenFactory init() {
		try {
			GMFGenFactory theGMFGenFactory = (GMFGenFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/gmf/2005/GenModel/2.0"); 
			if (theGMFGenFactory != null) {
				return theGMFGenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GMFGenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GMFGenPackage.GEN_EDITOR_GENERATOR: return createGenEditorGenerator();
			case GMFGenPackage.GEN_DIAGRAM: return createGenDiagram();
			case GMFGenPackage.GEN_EDITOR_VIEW: return createGenEditorView();
			case GMFGenPackage.GEN_PLUGIN: return createGenPlugin();
			case GMFGenPackage.CUSTOM_BEHAVIOUR: return createCustomBehaviour();
			case GMFGenPackage.SHARED_BEHAVIOUR: return createSharedBehaviour();
			case GMFGenPackage.OPEN_DIAGRAM_BEHAVIOUR: return createOpenDiagramBehaviour();
			case GMFGenPackage.GEN_TOP_LEVEL_NODE: return createGenTopLevelNode();
			case GMFGenPackage.GEN_CHILD_NODE: return createGenChildNode();
			case GMFGenPackage.GEN_CHILD_SIDE_AFFIXED_NODE: return createGenChildSideAffixedNode();
			case GMFGenPackage.GEN_CHILD_LABEL_NODE: return createGenChildLabelNode();
			case GMFGenPackage.GEN_COMPARTMENT: return createGenCompartment();
			case GMFGenPackage.GEN_LINK: return createGenLink();
			case GMFGenPackage.GEN_NODE_LABEL: return createGenNodeLabel();
			case GMFGenPackage.GEN_EXTERNAL_NODE_LABEL: return createGenExternalNodeLabel();
			case GMFGenPackage.GEN_LINK_LABEL: return createGenLinkLabel();
			case GMFGenPackage.METAMODEL_TYPE: return createMetamodelType();
			case GMFGenPackage.SPECIALIZATION_TYPE: return createSpecializationType();
			case GMFGenPackage.NOTATION_TYPE: return createNotationType();
			case GMFGenPackage.TYPE_MODEL_FACET: return createTypeModelFacet();
			case GMFGenPackage.TYPE_LINK_MODEL_FACET: return createTypeLinkModelFacet();
			case GMFGenPackage.FEATURE_LINK_MODEL_FACET: return createFeatureLinkModelFacet();
			case GMFGenPackage.FEATURE_LABEL_MODEL_FACET: return createFeatureLabelModelFacet();
			case GMFGenPackage.DESIGN_LABEL_MODEL_FACET: return createDesignLabelModelFacet();
			case GMFGenPackage.COLOR_ATTRIBUTES: return createColorAttributes();
			case GMFGenPackage.STYLE_ATTRIBUTES: return createStyleAttributes();
			case GMFGenPackage.RESIZE_CONSTRAINTS: return createResizeConstraints();
			case GMFGenPackage.DEFAULT_SIZE_ATTRIBUTES: return createDefaultSizeAttributes();
			case GMFGenPackage.LABEL_OFFSET_ATTRIBUTES: return createLabelOffsetAttributes();
			case GMFGenPackage.FIGURE_VIEWMAP: return createFigureViewmap();
			case GMFGenPackage.SNIPPET_VIEWMAP: return createSnippetViewmap();
			case GMFGenPackage.INNER_CLASS_VIEWMAP: return createInnerClassViewmap();
			case GMFGenPackage.PARENT_ASSIGNED_VIEWMAP: return createParentAssignedViewmap();
			case GMFGenPackage.VALUE_EXPRESSION: return createValueExpression();
			case GMFGenPackage.GEN_CONSTRAINT: return createGenConstraint();
			case GMFGenPackage.PALETTE: return createPalette();
			case GMFGenPackage.TOOL_ENTRY: return createToolEntry();
			case GMFGenPackage.STANDARD_ENTRY: return createStandardEntry();
			case GMFGenPackage.SEPARATOR: return createSeparator();
			case GMFGenPackage.TOOL_GROUP: return createToolGroup();
			case GMFGenPackage.GEN_FEATURE_SEQ_INITIALIZER: return createGenFeatureSeqInitializer();
			case GMFGenPackage.GEN_FEATURE_VALUE_SPEC: return createGenFeatureValueSpec();
			case GMFGenPackage.GEN_REFERENCE_NEW_ELEMENT_SPEC: return createGenReferenceNewElementSpec();
			case GMFGenPackage.GEN_LINK_CONSTRAINTS: return createGenLinkConstraints();
			case GMFGenPackage.GEN_AUDIT_CONTAINER: return createGenAuditContainer();
			case GMFGenPackage.GEN_AUDIT_RULE: return createGenAuditRule();
			case GMFGenPackage.GEN_DOMAIN_ELEMENT_TARGET: return createGenDomainElementTarget();
			case GMFGenPackage.GEN_DIAGRAM_ELEMENT_TARGET: return createGenDiagramElementTarget();
			case GMFGenPackage.GEN_DOMAIN_ATTRIBUTE_TARGET: return createGenDomainAttributeTarget();
			case GMFGenPackage.GEN_NOTATION_ELEMENT_TARGET: return createGenNotationElementTarget();
			case GMFGenPackage.GEN_METRIC_CONTAINER: return createGenMetricContainer();
			case GMFGenPackage.GEN_METRIC_RULE: return createGenMetricRule();
			case GMFGenPackage.GEN_AUDITED_METRIC_TARGET: return createGenAuditedMetricTarget();
			case GMFGenPackage.GEN_EXPRESSION_PROVIDER_CONTAINER: return createGenExpressionProviderContainer();
			case GMFGenPackage.GEN_JAVA_EXPRESSION_PROVIDER: return createGenJavaExpressionProvider();
			case GMFGenPackage.GEN_EXPRESSION_INTERPRETER: return createGenExpressionInterpreter();
			case GMFGenPackage.GEN_NAVIGATOR: return createGenNavigator();
			case GMFGenPackage.GEN_NAVIGATOR_CHILD_REFERENCE: return createGenNavigatorChildReference();
			case GMFGenPackage.GEN_PROPERTY_SHEET: return createGenPropertySheet();
			case GMFGenPackage.GEN_STANDARD_PROPERTY_TAB: return createGenStandardPropertyTab();
			case GMFGenPackage.GEN_CUSTOM_PROPERTY_TAB: return createGenCustomPropertyTab();
			case GMFGenPackage.TYPE_TAB_FILTER: return createTypeTabFilter();
			case GMFGenPackage.CUSTOM_TAB_FILTER: return createCustomTabFilter();
			case GMFGenPackage.GEN_APPLICATION: return createGenApplication();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GMFGenPackage.PROVIDER_PRIORITY:
				return createProviderPriorityFromString(eDataType, initialValue);
			case GMFGenPackage.LINK_LABEL_ALIGNMENT:
				return createLinkLabelAlignmentFromString(eDataType, initialValue);
			case GMFGenPackage.VIEWMAP_LAYOUT_TYPE:
				return createViewmapLayoutTypeFromString(eDataType, initialValue);
			case GMFGenPackage.STANDARD_ENTRY_KIND:
				return createStandardEntryKindFromString(eDataType, initialValue);
			case GMFGenPackage.GEN_SEVERITY:
				return createGenSeverityFromString(eDataType, initialValue);
			case GMFGenPackage.GEN_LANGUAGE:
				return createGenLanguageFromString(eDataType, initialValue);
			case GMFGenPackage.GEN_NAVIGATOR_REFERENCE_TYPE:
				return createGenNavigatorReferenceTypeFromString(eDataType, initialValue);
			case GMFGenPackage.GENERATED_TYPE:
				return createGeneratedTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GMFGenPackage.PROVIDER_PRIORITY:
				return convertProviderPriorityToString(eDataType, instanceValue);
			case GMFGenPackage.LINK_LABEL_ALIGNMENT:
				return convertLinkLabelAlignmentToString(eDataType, instanceValue);
			case GMFGenPackage.VIEWMAP_LAYOUT_TYPE:
				return convertViewmapLayoutTypeToString(eDataType, instanceValue);
			case GMFGenPackage.STANDARD_ENTRY_KIND:
				return convertStandardEntryKindToString(eDataType, instanceValue);
			case GMFGenPackage.GEN_SEVERITY:
				return convertGenSeverityToString(eDataType, instanceValue);
			case GMFGenPackage.GEN_LANGUAGE:
				return convertGenLanguageToString(eDataType, instanceValue);
			case GMFGenPackage.GEN_NAVIGATOR_REFERENCE_TYPE:
				return convertGenNavigatorReferenceTypeToString(eDataType, instanceValue);
			case GMFGenPackage.GENERATED_TYPE:
				return convertGeneratedTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditorGenerator createGenEditorGenerator() {
		GenEditorGeneratorImpl genEditorGenerator = new GenEditorGeneratorImpl();
		return genEditorGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDiagram createGenDiagram() {
		GenDiagramImpl genDiagram = new GenDiagramImpl();
		return genDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditorView createGenEditorView() {
		GenEditorViewImpl genEditorView = new GenEditorViewImpl();
		return genEditorView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPlugin createGenPlugin() {
		GenPluginImpl genPlugin = new GenPluginImpl();
		return genPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomBehaviour createCustomBehaviour() {
		CustomBehaviourImpl customBehaviour = new CustomBehaviourImpl();
		return customBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedBehaviour createSharedBehaviour() {
		SharedBehaviourImpl sharedBehaviour = new SharedBehaviourImpl();
		return sharedBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDiagramBehaviour createOpenDiagramBehaviour() {
		OpenDiagramBehaviourImpl openDiagramBehaviour = new OpenDiagramBehaviourImpl();
		return openDiagramBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenTopLevelNode createGenTopLevelNode() {
		GenTopLevelNodeImpl genTopLevelNode = new GenTopLevelNodeImpl();
		return genTopLevelNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenChildNode createGenChildNode() {
		GenChildNodeImpl genChildNode = new GenChildNodeImpl();
		return genChildNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenChildSideAffixedNode createGenChildSideAffixedNode() {
		GenChildSideAffixedNodeImpl genChildSideAffixedNode = new GenChildSideAffixedNodeImpl();
		return genChildSideAffixedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenChildLabelNode createGenChildLabelNode() {
		GenChildLabelNodeImpl genChildLabelNode = new GenChildLabelNodeImpl();
		return genChildLabelNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCompartment createGenCompartment() {
		GenCompartmentImpl genCompartment = new GenCompartmentImpl();
		return genCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLink createGenLink() {
		GenLinkImpl genLink = new GenLinkImpl();
		return genLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNodeLabel createGenNodeLabel() {
		GenNodeLabelImpl genNodeLabel = new GenNodeLabelImpl();
		return genNodeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenExternalNodeLabel createGenExternalNodeLabel() {
		GenExternalNodeLabelImpl genExternalNodeLabel = new GenExternalNodeLabelImpl();
		return genExternalNodeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLinkLabel createGenLinkLabel() {
		GenLinkLabelImpl genLinkLabel = new GenLinkLabelImpl();
		return genLinkLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelType createMetamodelType() {
		MetamodelTypeImpl metamodelType = new MetamodelTypeImpl();
		return metamodelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializationType createSpecializationType() {
		SpecializationTypeImpl specializationType = new SpecializationTypeImpl();
		return specializationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationType createNotationType() {
		NotationTypeImpl notationType = new NotationTypeImpl();
		return notationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModelFacet createTypeModelFacet() {
		TypeModelFacetImpl typeModelFacet = new TypeModelFacetImpl();
		return typeModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureLabelModelFacet createFeatureLabelModelFacet() {
		FeatureLabelModelFacetImpl featureLabelModelFacet = new FeatureLabelModelFacetImpl();
		return featureLabelModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLabelModelFacet createDesignLabelModelFacet() {
		DesignLabelModelFacetImpl designLabelModelFacet = new DesignLabelModelFacetImpl();
		return designLabelModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLinkModelFacet createTypeLinkModelFacet() {
		TypeLinkModelFacetImpl typeLinkModelFacet = new TypeLinkModelFacetImpl();
		return typeLinkModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureLinkModelFacet createFeatureLinkModelFacet() {
		FeatureLinkModelFacetImpl featureLinkModelFacet = new FeatureLinkModelFacetImpl();
		return featureLinkModelFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorAttributes createColorAttributes() {
		ColorAttributesImpl colorAttributes = new ColorAttributesImpl();
		return colorAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleAttributes createStyleAttributes() {
		StyleAttributesImpl styleAttributes = new StyleAttributesImpl();
		return styleAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResizeConstraints createResizeConstraints() {
		ResizeConstraintsImpl resizeConstraints = new ResizeConstraintsImpl();
		return resizeConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultSizeAttributes createDefaultSizeAttributes() {
		DefaultSizeAttributesImpl defaultSizeAttributes = new DefaultSizeAttributesImpl();
		return defaultSizeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelOffsetAttributes createLabelOffsetAttributes() {
		LabelOffsetAttributesImpl labelOffsetAttributes = new LabelOffsetAttributesImpl();
		return labelOffsetAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureViewmap createFigureViewmap() {
		FigureViewmapImpl figureViewmap = new FigureViewmapImpl();
		return figureViewmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnippetViewmap createSnippetViewmap() {
		SnippetViewmapImpl snippetViewmap = new SnippetViewmapImpl();
		return snippetViewmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerClassViewmap createInnerClassViewmap() {
		InnerClassViewmapImpl innerClassViewmap = new InnerClassViewmapImpl();
		return innerClassViewmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentAssignedViewmap createParentAssignedViewmap() {
		ParentAssignedViewmapImpl parentAssignedViewmap = new ParentAssignedViewmapImpl();
		return parentAssignedViewmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExpression createValueExpression() {
		ValueExpressionImpl valueExpression = new ValueExpressionImpl();
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenConstraint createGenConstraint() {
		GenConstraintImpl genConstraint = new GenConstraintImpl();
		return genConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette createPalette() {
		PaletteImpl palette = new PaletteImpl();
		return palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolEntry createToolEntry() {
		ToolEntryImpl toolEntry = new ToolEntryImpl();
		return toolEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardEntry createStandardEntry() {
		StandardEntryImpl standardEntry = new StandardEntryImpl();
		return standardEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Separator createSeparator() {
		SeparatorImpl separator = new SeparatorImpl();
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolGroup createToolGroup() {
		ToolGroupImpl toolGroup = new ToolGroupImpl();
		return toolGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeatureSeqInitializer createGenFeatureSeqInitializer() {
		GenFeatureSeqInitializerImpl genFeatureSeqInitializer = new GenFeatureSeqInitializerImpl();
		return genFeatureSeqInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeatureValueSpec createGenFeatureValueSpec() {
		GenFeatureValueSpecImpl genFeatureValueSpec = new GenFeatureValueSpecImpl();
		return genFeatureValueSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenReferenceNewElementSpec createGenReferenceNewElementSpec() {
		GenReferenceNewElementSpecImpl genReferenceNewElementSpec = new GenReferenceNewElementSpecImpl();
		return genReferenceNewElementSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLinkConstraints createGenLinkConstraints() {
		GenLinkConstraintsImpl genLinkConstraints = new GenLinkConstraintsImpl();
		return genLinkConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditContainer createGenAuditContainer() {
		GenAuditContainerImpl genAuditContainer = new GenAuditContainerImpl();
		return genAuditContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditRule createGenAuditRule() {
		GenAuditRuleImpl genAuditRule = new GenAuditRuleImpl();
		return genAuditRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDomainElementTarget createGenDomainElementTarget() {
		GenDomainElementTargetImpl genDomainElementTarget = new GenDomainElementTargetImpl();
		return genDomainElementTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDiagramElementTarget createGenDiagramElementTarget() {
		GenDiagramElementTargetImpl genDiagramElementTarget = new GenDiagramElementTargetImpl();
		return genDiagramElementTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDomainAttributeTarget createGenDomainAttributeTarget() {
		GenDomainAttributeTargetImpl genDomainAttributeTarget = new GenDomainAttributeTargetImpl();
		return genDomainAttributeTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNotationElementTarget createGenNotationElementTarget() {
		GenNotationElementTargetImpl genNotationElementTarget = new GenNotationElementTargetImpl();
		return genNotationElementTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenMetricContainer createGenMetricContainer() {
		GenMetricContainerImpl genMetricContainer = new GenMetricContainerImpl();
		return genMetricContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenMetricRule createGenMetricRule() {
		GenMetricRuleImpl genMetricRule = new GenMetricRuleImpl();
		return genMetricRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuditedMetricTarget createGenAuditedMetricTarget() {
		GenAuditedMetricTargetImpl genAuditedMetricTarget = new GenAuditedMetricTargetImpl();
		return genAuditedMetricTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenExpressionProviderContainer createGenExpressionProviderContainer() {
		GenExpressionProviderContainerImpl genExpressionProviderContainer = new GenExpressionProviderContainerImpl();
		return genExpressionProviderContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenJavaExpressionProvider createGenJavaExpressionProvider() {
		GenJavaExpressionProviderImpl genJavaExpressionProvider = new GenJavaExpressionProviderImpl();
		return genJavaExpressionProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenExpressionInterpreter createGenExpressionInterpreter() {
		GenExpressionInterpreterImpl genExpressionInterpreter = new GenExpressionInterpreterImpl();
		return genExpressionInterpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNavigator createGenNavigator() {
		GenNavigatorImpl genNavigator = new GenNavigatorImpl();
		return genNavigator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNavigatorChildReference createGenNavigatorChildReference() {
		GenNavigatorChildReferenceImpl genNavigatorChildReference = new GenNavigatorChildReferenceImpl();
		return genNavigatorChildReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPropertySheet createGenPropertySheet() {
		GenPropertySheetImpl genPropertySheet = new GenPropertySheetImpl();
		return genPropertySheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenStandardPropertyTab createGenStandardPropertyTab() {
		GenStandardPropertyTabImpl genStandardPropertyTab = new GenStandardPropertyTabImpl();
		return genStandardPropertyTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCustomPropertyTab createGenCustomPropertyTab() {
		GenCustomPropertyTabImpl genCustomPropertyTab = new GenCustomPropertyTabImpl();
		return genCustomPropertyTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTabFilter createTypeTabFilter() {
		TypeTabFilterImpl typeTabFilter = new TypeTabFilterImpl();
		return typeTabFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTabFilter createCustomTabFilter() {
		CustomTabFilterImpl customTabFilter = new CustomTabFilterImpl();
		return customTabFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenApplication createGenApplication() {
		GenApplicationImpl genApplication = new GenApplicationImpl();
		return genApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderPriority createProviderPriorityFromString(EDataType eDataType, String initialValue) {
		ProviderPriority result = ProviderPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkLabelAlignment createLinkLabelAlignmentFromString(EDataType eDataType, String initialValue) {
		LinkLabelAlignment result = LinkLabelAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkLabelAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewmapLayoutType createViewmapLayoutTypeFromString(EDataType eDataType, String initialValue) {
		ViewmapLayoutType result = ViewmapLayoutType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewmapLayoutTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardEntryKind createStandardEntryKindFromString(EDataType eDataType, String initialValue) {
		StandardEntryKind result = StandardEntryKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandardEntryKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSeverity createGenSeverityFromString(EDataType eDataType, String initialValue) {
		GenSeverity result = GenSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLanguage createGenLanguageFromString(EDataType eDataType, String initialValue) {
		GenLanguage result = GenLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNavigatorReferenceType createGenNavigatorReferenceTypeFromString(EDataType eDataType, String initialValue) {
		GenNavigatorReferenceType result = GenNavigatorReferenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenNavigatorReferenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedType createGeneratedTypeFromString(EDataType eDataType, String initialValue) {
		GeneratedType result = GeneratedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenPackage getGMFGenPackage() {
		return (GMFGenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static GMFGenPackage getPackage() {
		return GMFGenPackage.eINSTANCE;
	}

} //GMFGenFactoryImpl