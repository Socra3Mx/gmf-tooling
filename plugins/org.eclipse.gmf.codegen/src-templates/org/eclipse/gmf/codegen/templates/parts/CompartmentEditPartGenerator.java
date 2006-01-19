package org.eclipse.gmf.codegen.templates.parts;

import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.gmf.codegen.util.*;

public class CompartmentEditPartGenerator {
 
  protected static String nl;
  public static synchronized CompartmentEditPartGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    CompartmentEditPartGenerator result = new CompartmentEditPartGenerator();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL;
  protected final String TEXT_3 = NL + "import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;" + NL + "import org.eclipse.gmf.runtime.notation.View;";
  protected final String TEXT_4 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_5 = " extends ";
  protected final String TEXT_6 = " {" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_7 = "(View view) {" + NL + "\t\tsuper(view);" + NL + "\t}";
  protected final String TEXT_8 = NL + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected boolean hasModelChildrenChanged(";
  protected final String TEXT_9 = " evt) {" + NL + "\t\treturn false;" + NL + "\t}";
  protected final String TEXT_10 = NL + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected String getTitleName() {" + NL + "\t\treturn \"";
  protected final String TEXT_11 = "\";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void createDefaultEditPolicies() {" + NL + "\t\tsuper.createDefaultEditPolicies();" + NL + "\t\tinstallEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ";
  protected final String TEXT_12 = "());";
  protected final String TEXT_13 = NL + "\t\tinstallEditPolicy(EditPolicyRoles.CREATION_ROLE, new ";
  protected final String TEXT_14 = "());" + NL + "\t\tinstallEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new ";
  protected final String TEXT_15 = "());" + NL + "\t\tinstallEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ";
  protected final String TEXT_16 = "());";
  protected final String TEXT_17 = NL + "\t\tinstallEditPolicy(EditPolicyRoles.POPUPBAR_ROLE, new ";
  protected final String TEXT_18 = "());";
  protected final String TEXT_19 = NL + "\t}";
  protected final String TEXT_20 = NL + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_21 = " createFigure() {" + NL + "\t\t";
  protected final String TEXT_22 = " result = super.createFigure();" + NL + "\t\tresult.setBorder(new ";
  protected final String TEXT_23 = "());" + NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void refreshRatio() {" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void refreshVisuals() {" + NL + "\t\tsuper.refreshVisuals();" + NL + "\t\trefreshBounds();" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void handleNotificationEvent(";
  protected final String TEXT_24 = " notification) {" + NL + "\t\tsuper.handleNotificationEvent(notification);" + NL + "\t\tObject feature = notification.getFeature();" + NL + "\t\tif (";
  protected final String TEXT_25 = ".eINSTANCE.getSize_Width().equals(feature)" + NL + "\t\t\t|| ";
  protected final String TEXT_26 = ".eINSTANCE.getSize_Height().equals(feature)" + NL + "\t\t\t|| ";
  protected final String TEXT_27 = ".eINSTANCE.getLocation_X().equals(feature)" + NL + "\t\t\t|| ";
  protected final String TEXT_28 = ".eINSTANCE.getLocation_Y().equals(feature)) {" + NL + "\t\t\trefreshBounds();" + NL + "\t\t} " + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void refreshBounds() {" + NL + "\t\tint width = ((Integer) getStructuralFeatureValue(";
  protected final String TEXT_29 = ".eINSTANCE.getSize_Width())).intValue();" + NL + "\t\tint height = ((Integer) getStructuralFeatureValue(";
  protected final String TEXT_30 = ".eINSTANCE.getSize_Height())).intValue();" + NL + "\t\t";
  protected final String TEXT_31 = " size = new ";
  protected final String TEXT_32 = "(width, height);" + NL + "\t\tint x = ((Integer) getStructuralFeatureValue(";
  protected final String TEXT_33 = ".eINSTANCE.getLocation_X())).intValue();" + NL + "\t\tint y = ((Integer) getStructuralFeatureValue(";
  protected final String TEXT_34 = ".eINSTANCE.getLocation_Y())).intValue();" + NL + "\t\t";
  protected final String TEXT_35 = " loc = new ";
  protected final String TEXT_36 = "(x, y);" + NL + "\t\t((";
  protected final String TEXT_37 = ") getParent()).setLayoutConstraint(this, getFigure(), new ";
  protected final String TEXT_38 = "(loc, size));" + NL + "\t}";
  protected final String TEXT_39 = NL + "}";
  protected final String TEXT_40 = NL;

	protected final String getFeatureValueGetter(String containerName, GenFeature feature, boolean isContainerEObject, ImportUtil importManager) {
		StringBuffer result = new StringBuffer();
		if (feature.getGenClass().isExternalInterface()) {
// Using EMF reflective method to access feature value
			result.append("((");
			if (feature.isListType()) {
				result.append(importManager.getImportedName("java.util.Collection"));
			} else {
				result.append(importManager.getImportedName(feature.getTypeGenClass().getQualifiedInterfaceName()));
			}
			result.append(")");
			if (!isContainerEObject) {
// Casting container to EObject - ExternalIntarfce could be not an instance of EObject
				result.append("((");
				result.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
				result.append(")");
			}
			result.append(containerName);
			if (!isContainerEObject) {
				result.append(")");
			}
			result.append(".eGet(");
			result.append(importManager.getImportedName(feature.getGenPackage().getQualifiedPackageInterfaceName()));
			result.append(".eINSTANCE.get");
			result.append(feature.getFeatureAccessorName());
			result.append("()))");
		} else {
			if (isContainerEObject) {
// Casting container to the typed interface
				result.append("((");
				result.append(importManager.getImportedName(feature.getGenClass().getQualifiedInterfaceName()));
				result.append(")");
			}
			result.append(containerName);
			if (isContainerEObject) {
				result.append(")");
			}
			result.append(".");
			result.append(feature.getGetAccessor());
			result.append("()");
		}
		return result.toString();
	}
	
	protected final String getFeatureValueSetterPrefix(String containerName, GenFeature feature, boolean isContainerEObject, ImportUtil importManager) {
		StringBuffer result = new StringBuffer();
		if (feature.getGenClass().isExternalInterface()) {
// Using EMF reflective method to access feature value
			if (!isContainerEObject) {
// Casting container to EObject - ExternalIntarfce could be not an instance of EObject
				result.append("((");
				result.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
				result.append(")");
			}
			result.append(containerName);
			if (!isContainerEObject) {
				result.append(")");
			}
			result.append(".eSet(");
			result.append(importManager.getImportedName(feature.getGenPackage().getQualifiedPackageInterfaceName()));
			result.append(".eINSTANCE.get");
			result.append(feature.getFeatureAccessorName());
			result.append("(), ");
		} else {
			if (isContainerEObject) {
// Casting container to the typed interface
				result.append("((");
				result.append(importManager.getImportedName(feature.getGenClass().getQualifiedInterfaceName()));
				result.append(")");
			}
			result.append(containerName);
			if (isContainerEObject) {
				result.append(")");
			}
			result.append(".set");
			result.append(feature.getAccessorName());
			result.append("(");
		}
		return result.toString();
	}
 
	protected final String getMetaClassAccessor(GenClass genClass, ImportUtil importManager) {
		StringBuffer buf = new StringBuffer();
		buf.append(importManager.getImportedName(genClass.getGenPackage().getQualifiedPackageInterfaceName()))
			.append(".eINSTANCE.get") //$NON-NLS-1$
			.append(genClass.getName())
			.append("()"); //$NON-NLS-1$
		return buf.toString();
	} 
 
	public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
GenCompartment genCompartment = (GenCompartment) argument;
GenDiagram genDiagram = genCompartment.getDiagram();
boolean isParentFlowLayout = !genCompartment.getNode().isListLayout();

    stringBuffer.append(TEXT_1);
    stringBuffer.append(genDiagram.getEditPartsPackageName());
    stringBuffer.append(TEXT_2);
    ImportUtil importManager = new ImportUtil(genDiagram.getEditPartsPackageName());
    stringBuffer.append(TEXT_3);
    
importManager.markImportLocation(stringBuffer);

    stringBuffer.append(TEXT_4);
    stringBuffer.append(genCompartment.getEditPartClassName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genCompartment.isListLayout() ? importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart") : importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart"));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genCompartment.getEditPartClassName());
    stringBuffer.append(TEXT_7);
    if (genCompartment.isListLayout()) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genCompartment.getTitle());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(importManager.getImportedName(genCompartment.getItemSemanticEditPolicyQualifiedClassName()));
    stringBuffer.append(TEXT_12);
    if (!genCompartment.getChildNodes().isEmpty()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy"));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy"));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(importManager.getImportedName(genCompartment.getCanonicalEditPolicyQualifiedClassName()));
    stringBuffer.append(TEXT_16);
    
}
if (genCompartment.isListLayout()) {

    stringBuffer.append(TEXT_17);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.editpolicies.PopupBarEditPolicy"));
    stringBuffer.append(TEXT_18);
    }
    stringBuffer.append(TEXT_19);
    
if (isParentFlowLayout) {

    stringBuffer.append(TEXT_20);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.IFigure"));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.IFigure"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.LineBorder"));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Dimension"));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Dimension"));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Point"));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Point"));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.GraphicalEditPart"));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Rectangle"));
    stringBuffer.append(TEXT_38);
    
}

    stringBuffer.append(TEXT_39);
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_40);
    return stringBuffer.toString();
  }
}