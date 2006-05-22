package org.eclipse.gmf.codegen.templates.lite.parts;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.gmf.common.codegen.*;

public class CompartmentEditPartGenerator
{
  protected static String nl;
  public static synchronized CompartmentEditPartGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    CompartmentEditPartGenerator result = new CompartmentEditPartGenerator();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "/*" + NL + " * ";
  protected final String TEXT_3 = NL + " */";
  protected final String TEXT_4 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_5 = " extends ";
  protected final String TEXT_6 = " implements IUpdatableEditPart {";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final int VISUAL_ID = ";
  protected final String TEXT_9 = ";";
  protected final String TEXT_10 = NL + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_11 = "(View view) {" + NL + "\t\tsetModel(view);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_12 = " getModelChildren() {" + NL + "\t\treturn ((View) getModel()).getChildren();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void createEditPolicies() {" + NL + "\t\t//XXX: install correct edit policies!";
  protected final String TEXT_13 = NL + "\t\tinstallEditPolicy(";
  protected final String TEXT_14 = ".LAYOUT_ROLE, new ";
  protected final String TEXT_15 = "() {" + NL + "\t\t\tprotected Command createChangeConstraintCommand(final ";
  protected final String TEXT_16 = " request, EditPart child, Object constraint) {" + NL + "\t\t\t\tfinal Node node = (Node) child.getModel();" + NL + "\t\t\t\t";
  protected final String TEXT_17 = " emfCommand = new ";
  protected final String TEXT_18 = "(\"Change node position/size\") {" + NL + "\t\t\t\t\tprivate ";
  protected final String TEXT_19 = " moveDelta = request.getMoveDelta();" + NL + "\t\t\t\t\tprivate ";
  protected final String TEXT_20 = " resizeDelta = request.getSizeDelta();" + NL + "" + NL + "\t\t\t\t\tpublic boolean canUndo() {" + NL + "\t\t\t\t\t\treturn canExecute();" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tpublic boolean canExecute() {" + NL + "\t\t\t\t\t\treturn node.getLayoutConstraint() instanceof Bounds;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tpublic void undo() {" + NL + "\t\t\t\t\t\texecute(moveDelta.getNegated(), resizeDelta.getNegated());" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tpublic void execute() {" + NL + "\t\t\t\t\t\texecute(moveDelta, resizeDelta);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tpublic void redo() {" + NL + "\t\t\t\t\t\texecute();" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tprivate void execute(";
  protected final String TEXT_21 = " move, ";
  protected final String TEXT_22 = " resize) {" + NL + "\t\t\t\t\t\tBounds bounds = (Bounds) node.getLayoutConstraint();" + NL + "\t\t\t\t\t\tbounds.setX(bounds.getX() + move.x);" + NL + "\t\t\t\t\t\tbounds.setY(bounds.getY() + move.y);" + NL + "\t\t\t\t\t\tbounds.setWidth(bounds.getWidth() + resize.width);" + NL + "\t\t\t\t\t\tbounds.setHeight(bounds.getHeight() + resize.height);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t};" + NL + "\t\t\t\treturn new WrappingCommand(";
  protected final String TEXT_23 = ".getEditingDomain(node.getDiagram().getElement()), emfCommand);" + NL + "\t\t\t}" + NL + "\t\t\tprotected Command createChangeConstraintCommand(EditPart child, Object constraint) {" + NL + "\t\t\t\tassert false;" + NL + "\t\t\t\treturn ";
  protected final String TEXT_24 = ".INSTANCE;" + NL + "\t\t\t}";
  protected final String TEXT_25 = NL + "\t\tinstallEditPolicy(";
  protected final String TEXT_26 = ".LAYOUT_ROLE, new ";
  protected final String TEXT_27 = "() {" + NL + "\t\t\tprotected Object getConstraintFor(";
  protected final String TEXT_28 = " rect) {" + NL + "\t\t\t\treturn null;" + NL + "\t\t\t}" + NL + "\t\t\tprotected Object getConstraintFor(";
  protected final String TEXT_29 = " point) {" + NL + "\t\t\t\treturn null;" + NL + "\t\t\t}" + NL + "\t\t\tprotected Command createChangeConstraintCommand(EditPart child, Object constraint) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_30 = ".INSTANCE;" + NL + "\t\t\t}";
  protected final String TEXT_31 = NL + "\t\t\tprotected Command getCreateCommand(CreateRequest request) {";
  protected final String TEXT_32 = NL + "\t\t\t\tif (request instanceof ";
  protected final String TEXT_33 = ".CreateRequestEx) {" + NL + "\t\t\t\t\t";
  protected final String TEXT_34 = ".CreateRequestEx requestEx = (";
  protected final String TEXT_35 = ".CreateRequestEx) request;" + NL + "\t\t\t\t\tint[] visualIds = requestEx.getVisualIds();" + NL + "\t\t\t\t\t";
  protected final String TEXT_36 = " result = new ";
  protected final String TEXT_37 = "();" + NL + "\t\t\t\t\tfor(int i = 0; i < visualIds.length; i++) {" + NL + "\t\t\t\t\t\tint nextVisualId = visualIds[i];" + NL + "\t\t\t\t\t\tswitch (nextVisualId) {";
  protected final String TEXT_38 = NL + "\t\t\t\t\t\tcase ";
  protected final String TEXT_39 = ".VISUAL_ID:" + NL + "\t\t\t\t\t\t\tresult.append(new Create";
  protected final String TEXT_40 = "Command((View) getModel(), requestEx";
  protected final String TEXT_41 = ", " + NL + "\t\t\t\t\t\t\t\t(";
  protected final String TEXT_42 = ")getConstraintFor(request)";
  protected final String TEXT_43 = "));" + NL + "\t\t\t\t\t\t\tbreak;";
  protected final String TEXT_44 = NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\treturn new WrappingCommand(";
  protected final String TEXT_45 = ".getEditingDomain(((View) getModel()).getDiagram().getElement()), result);" + NL + "\t\t\t\t}";
  protected final String TEXT_46 = NL + "\t\t\t\treturn null;" + NL + "\t\t\t}" + NL + "\t\t});" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected String getTitleName() {" + NL + "\t\treturn \"";
  protected final String TEXT_47 = "\";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_48 = " createFigure() {" + NL + "\t\t";
  protected final String TEXT_49 = " result = new ";
  protected final String TEXT_50 = "();" + NL + "\t\tresult.setLabel(getTitleName());" + NL + "\t\tresult.setOpaque(false);" + NL + "\t\tresult.setLayoutManager(new ";
  protected final String TEXT_51 = "());" + NL + "\t\t";
  protected final String TEXT_52 = " scrollPane = new ";
  protected final String TEXT_53 = "();" + NL + "\t\tresult.add(scrollPane);";
  protected final String TEXT_54 = NL + "\t\t";
  protected final String TEXT_55 = " viewport = new ";
  protected final String TEXT_56 = "();" + NL + "\t\tcontentPane = new ";
  protected final String TEXT_57 = "();" + NL + "\t\tcontentPane.setLayoutManager(new ";
  protected final String TEXT_58 = "());";
  protected final String TEXT_59 = NL + "\t\t";
  protected final String TEXT_60 = " viewport = new ";
  protected final String TEXT_61 = "();" + NL + "\t\tcontentPane = new ";
  protected final String TEXT_62 = "();" + NL + "\t\tcontentPane.setLayoutManager(new ";
  protected final String TEXT_63 = "());";
  protected final String TEXT_64 = NL + "\t\tviewport.setContents(contentPane);" + NL + "\t\tscrollPane.setViewport(viewport);" + NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic IFigure getContentPane() {" + NL + "\t\treturn contentPane;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate IFigure contentPane;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_65 = " resolveSemanticElement() {" + NL + "\t\tfor(EditPart editPart = this; editPart != null; editPart = editPart.getParent()) {" + NL + "\t\t\tView view = (View)editPart.getModel();" + NL + "\t\t\tif (view != null && view.getElement() != null) {" + NL + "\t\t\t\treturn (";
  protected final String TEXT_66 = ") view.getElement();" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_67 = NL;
  protected final String TEXT_68 = "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_69 = " structuralFeatures2Refresher;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Refresher getRefresher(";
  protected final String TEXT_70 = " feature, ";
  protected final String TEXT_71 = " msg) {" + NL + "\t\tif (structuralFeatures2Refresher == null) {" + NL + "\t\t\tcreateRefreshers();" + NL + "\t\t}" + NL + "\t\treturn (Refresher) structuralFeatures2Refresher.get(feature);" + NL + "\t}" + NL + "" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate void createRefreshers() {" + NL + "\t\tstructuralFeatures2Refresher = new HashMap();";
  protected final String TEXT_72 = NL;
  protected final String TEXT_73 = "\t\tRefresher childrenRefresher = new Refresher() {" + NL + "\t\t\tpublic void refresh() {" + NL + "\t\t\t\trefreshChildren();" + NL + "\t\t\t}" + NL + "\t\t};" + NL + "\t\tstructuralFeatures2Refresher.put(";
  protected final String TEXT_74 = ".eINSTANCE.getView_PersistedChildren(), childrenRefresher);" + NL + "\t\tstructuralFeatures2Refresher.put(";
  protected final String TEXT_75 = ".eINSTANCE.getView_TransientChildren(), childrenRefresher);";
  protected final String TEXT_76 = NL;
  protected final String TEXT_77 = "\t\tRefresher visibilityRefresher = new Refresher() {" + NL + "\t\t\tpublic void refresh() {" + NL + "\t\t\t\trefreshVisibility();" + NL + "\t\t\t}" + NL + "\t\t};" + NL + "\t\tstructuralFeatures2Refresher.put(";
  protected final String TEXT_78 = ".eINSTANCE.getView_Visible(), visibilityRefresher);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void refreshVisuals() {" + NL + "\t\tsuper.refreshVisuals();" + NL + "//XXX:\t\trefreshBackgroundColor();" + NL + "//XXX:\t\trefreshForegroundColor();" + NL + "//XXX:\t\trefreshFont();" + NL + "\t\trefreshVisibility();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void refreshVisibility() {" + NL + "\t\tboolean isVisible = ((View)getModel()).isVisible();" + NL + "\t\tboolean wasVisible = getFigure().isVisible();" + NL + "\t\tif (isVisible == wasVisible) {" + NL + "\t\t\treturn;" + NL + "\t\t}" + NL + "\t\tif (!isVisible && (getSelected() != SELECTED_NONE)) {" + NL + "\t\t\tgetViewer().deselect(this);" + NL + "\t\t}" + NL + "" + NL + "\t\tgetFigure().setVisible(isVisible);" + NL + "\t\tgetFigure().revalidate();" + NL + "\t}" + NL;
  protected final String TEXT_79 = NL;
  protected final String TEXT_80 = "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_81 = "static ";
  protected final String TEXT_82 = "class Create";
  protected final String TEXT_83 = "Command extends ";
  protected final String TEXT_84 = " {" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprivate final ";
  protected final String TEXT_85 = " parent;" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprivate ";
  protected final String TEXT_86 = " createdNode;" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic Create";
  protected final String TEXT_87 = "Command(";
  protected final String TEXT_88 = " parent, ";
  protected final String TEXT_89 = ".CreateRequestEx request";
  protected final String TEXT_90 = ", ";
  protected final String TEXT_91 = " constraint";
  protected final String TEXT_92 = ") {" + NL + "\t\t\tthis.parent = parent;" + NL + "\t\t\tcreatedNode = ";
  protected final String TEXT_93 = ".eINSTANCE.createNode();";
  protected final String TEXT_94 = NL + "\t\t\t";
  protected final String TEXT_95 = " createdDomainElement = ";
  protected final String TEXT_96 = ".eINSTANCE.create(" + NL + "\t\t\t\t";
  protected final String TEXT_97 = ".eINSTANCE.get";
  protected final String TEXT_98 = "());";
  protected final String TEXT_99 = NL + "\t\t\t";
  protected final String TEXT_100 = " createdDomainElement = ";
  protected final String TEXT_101 = ".eINSTANCE.create";
  protected final String TEXT_102 = "();";
  protected final String TEXT_103 = "\t\t\tcreatedNode.setElement(createdDomainElement);" + NL + "\t\t\t";
  protected final String TEXT_104 = NL + "\t\t\t";
  protected final String TEXT_105 = ".";
  protected final String TEXT_106 = ".initializeElement(createdDomainElement);" + NL + "\t\t\t";
  protected final String TEXT_107 = ".decorateView(createdNode);";
  protected final String TEXT_108 = NL + "\t\t\t";
  protected final String TEXT_109 = " bounds = ";
  protected final String TEXT_110 = ".eINSTANCE.createBounds();" + NL + "\t\t\tcreatedNode.setLayoutConstraint(bounds);" + NL + "\t\t\tbounds.setX(constraint.x);" + NL + "\t\t\tbounds.setY(constraint.y);";
  protected final String TEXT_111 = NL + "\t\t\tbounds.setWidth(Math.max(constraint.width, ";
  protected final String TEXT_112 = "));" + NL + "\t\t\tbounds.setHeight(Math.max(constraint.height, ";
  protected final String TEXT_113 = "));";
  protected final String TEXT_114 = NL + "\t\t\t";
  protected final String TEXT_115 = " domainModelEditDomain = ";
  protected final String TEXT_116 = ".getEditingDomain(parent.getDiagram().getElement());";
  protected final String TEXT_117 = NL + "\t\t\t";
  protected final String TEXT_118 = " compoundCommand = new ";
  protected final String TEXT_119 = "();" + NL + "\t\t\tcompoundCommand.append(";
  protected final String TEXT_120 = ".create(domainModelEditDomain, ";
  protected final String TEXT_121 = ", " + NL + "\t\t\t\t";
  protected final String TEXT_122 = ".eINSTANCE.get";
  protected final String TEXT_123 = "(), createdNode.getElement()));" + NL + "\t\t\tcompoundCommand.append(";
  protected final String TEXT_124 = ".create(domainModelEditDomain, ";
  protected final String TEXT_125 = ", " + NL + "\t\t\t\t";
  protected final String TEXT_126 = ".eINSTANCE.get";
  protected final String TEXT_127 = "(), createdNode.getElement()));" + NL + "\t\t\tthis.domainModelAddCommand = compoundCommand;";
  protected final String TEXT_128 = NL + "\t\t\tthis.domainModelAddCommand = ";
  protected final String TEXT_129 = ".create(domainModelEditDomain, ";
  protected final String TEXT_130 = ", " + NL + "\t\t\t\t";
  protected final String TEXT_131 = ".eINSTANCE.get";
  protected final String TEXT_132 = "(), createdNode.getElement());";
  protected final String TEXT_133 = NL + "\t\t\trequest.setCreatedObject(createdNode);" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprivate final org.eclipse.emf.common.command.Command domainModelAddCommand;" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic boolean canExecute() {" + NL + "\t\t\treturn domainModelAddCommand != null && domainModelAddCommand.canExecute();" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic boolean canUndo() {" + NL + "\t\t\treturn domainModelAddCommand != null && domainModelAddCommand.canUndo();" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void execute() {" + NL + "\t\t\tparent.insertChild(createdNode);" + NL + "\t\t\tdomainModelAddCommand.execute();" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void undo() {" + NL + "\t\t\tparent.getPersistedChildren().remove(createdNode);" + NL + "\t\t\tdomainModelAddCommand.undo();" + NL + "\t\t}" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void redo() {" + NL + "\t\t\texecute();" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_134 = NL + "}" + NL;
  protected final String TEXT_135 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
GenCompartment genCompartment = (GenCompartment) ((Object[]) argument)[0];
GenNode genHost = genCompartment.getNode();
GenDiagram genDiagram = genCompartment.getDiagram();
final ImportAssistant importManager = (ImportAssistant) ((Object[]) argument)[1];

    stringBuffer.append(TEXT_1);
    
String copyrightText = genDiagram.getEditorGen().getCopyrightText();
if (copyrightText != null && copyrightText.trim().length() > 0) {

    stringBuffer.append(TEXT_2);
    stringBuffer.append(copyrightText.replaceAll("\n", "\n * "));
    stringBuffer.append(TEXT_3);
    }
    importManager.emitPackageStatement(stringBuffer);
importManager.addImport("org.eclipse.gmf.runtime.notation.View");
importManager.addImport("org.eclipse.gef.commands.Command");
importManager.addImport("org.eclipse.gef.commands.CompoundCommand");
importManager.addImport("org.eclipse.gef.EditPart");
importManager.addImport("org.eclipse.gef.requests.CreateRequest");

importManager.markImportLocation(stringBuffer);

    stringBuffer.append(TEXT_4);
    stringBuffer.append(genCompartment.getEditPartClassName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.editparts.AbstractGraphicalEditPart"));
    stringBuffer.append(TEXT_6);
    {
GenCommonBase genCommonBase = genCompartment;
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genCommonBase.getVisualID());
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genCompartment.getEditPartClassName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(importManager.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_12);
    if (!genCompartment.isListLayout()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.EditPolicy"));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.editpolicies.XYLayoutEditPolicy"));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.requests.ChangeBoundsRequest"));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.AbstractCommand"));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Point"));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Dimension"));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Point"));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Dimension"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.util.TransactionUtil"));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.commands.UnexecutableCommand"));
    stringBuffer.append(TEXT_24);
    } else {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.EditPolicy"));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy"));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Rectangle"));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Point"));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.commands.UnexecutableCommand"));
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_31);
    if (null != genDiagram.getPalette()) {
final Palette palette = genDiagram.getPalette();
    stringBuffer.append(TEXT_32);
    stringBuffer.append(importManager.getImportedName(palette.getFactoryQualifiedClassName()));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(importManager.getImportedName(palette.getFactoryQualifiedClassName()));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(importManager.getImportedName(palette.getFactoryQualifiedClassName()));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_37);
    
for(Iterator it = genCompartment.getChildNodes().iterator(); it.hasNext(); ) {
	GenChildNode next = (GenChildNode)it.next();

    stringBuffer.append(TEXT_38);
    stringBuffer.append(importManager.getImportedName(next.getEditPartQualifiedClassName()));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(next.getDomainMetaClass().getName());
    stringBuffer.append(next.getVisualID());
    stringBuffer.append(TEXT_40);
    if (!genCompartment.isListLayout()) {
    stringBuffer.append(TEXT_41);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Rectangle"));
    stringBuffer.append(TEXT_42);
    }
    stringBuffer.append(TEXT_43);
    
}

    stringBuffer.append(TEXT_44);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.util.TransactionUtil"));
    stringBuffer.append(TEXT_45);
    }/*when there's palette*/
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genCompartment.getTitle());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.IFigure"));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.LabeledContainer"));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.LabeledContainer"));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.StackLayout"));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.ScrollPane"));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.ScrollPane"));
    stringBuffer.append(TEXT_53);
    if (genCompartment.isListLayout()) {
    stringBuffer.append(TEXT_54);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.Viewport"));
    stringBuffer.append(TEXT_55);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.Viewport"));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.Figure"));
    stringBuffer.append(TEXT_57);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.ToolbarLayout"));
    stringBuffer.append(TEXT_58);
    } else {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.Viewport"));
    stringBuffer.append(TEXT_60);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.FreeformViewport"));
    stringBuffer.append(TEXT_61);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.FreeformLayer"));
    stringBuffer.append(TEXT_62);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.FreeformLayout"));
    stringBuffer.append(TEXT_63);
    }
    stringBuffer.append(TEXT_64);
    stringBuffer.append(importManager.getImportedName(genHost.getDomainMetaClass().getQualifiedInterfaceName()));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(importManager.getImportedName(genHost.getDomainMetaClass().getQualifiedInterfaceName()));
    stringBuffer.append(TEXT_66);
    stringBuffer.append(TEXT_67);
    stringBuffer.append(TEXT_68);
    stringBuffer.append(importManager.getImportedName("java.util.HashMap"));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(TEXT_72);
    stringBuffer.append(TEXT_73);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(TEXT_76);
    stringBuffer.append(TEXT_77);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_78);
    
for(Iterator it = genCompartment.getChildNodes().iterator(); genDiagram.getPalette() != null && it.hasNext(); ) {
	GenChildNode next = (GenChildNode)it.next();
	boolean isStatic = false;
	boolean isListLayout = genCompartment.isListLayout();
	String resolvedSemanticElement = "resolveSemanticElement()";

    stringBuffer.append(TEXT_79);
    stringBuffer.append(TEXT_80);
    if (isStatic) {
    stringBuffer.append(TEXT_81);
    }
    stringBuffer.append(TEXT_82);
    stringBuffer.append(next.getDomainMetaClass().getName());
    stringBuffer.append(next.getVisualID());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.AbstractCommand"));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_85);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.Node"));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(next.getDomainMetaClass().getName());
    stringBuffer.append(next.getVisualID());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_88);
    stringBuffer.append(importManager.getImportedName(genDiagram.getPalette().getFactoryQualifiedClassName()));
    stringBuffer.append(TEXT_89);
    if (!isListLayout) {
    stringBuffer.append(TEXT_90);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Rectangle"));
    stringBuffer.append(TEXT_91);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationFactory"));
    stringBuffer.append(TEXT_93);
    
if (next.getDomainMetaClass().isMapEntry()) {
/*Workaround for Ecore example: map entries cannot be created using factory, only using reflective EFactory.create() method*/

    stringBuffer.append(TEXT_94);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(importManager.getImportedName(next.getDomainMetaClass().getGenPackage().getQualifiedFactoryInterfaceName()));
    stringBuffer.append(TEXT_96);
    stringBuffer.append(importManager.getImportedName(next.getDomainMetaClass().getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(next.getDomainMetaClass().getClassifierAccessorName());
    stringBuffer.append(TEXT_98);
    
} else {

    stringBuffer.append(TEXT_99);
    stringBuffer.append(importManager.getImportedName(next.getDomainMetaClass().getQualifiedInterfaceName()));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(importManager.getImportedName(next.getDomainMetaClass().getGenPackage().getQualifiedFactoryInterfaceName()));
    stringBuffer.append(TEXT_101);
    stringBuffer.append(next.getDomainMetaClass().getClassifierAccessorName());
    stringBuffer.append(TEXT_102);
    
}

    stringBuffer.append(TEXT_103);
    /*XXX: Class name DomainElementInitializer should be user-customizable*/
    stringBuffer.append(TEXT_104);
    stringBuffer.append(importManager.getImportedName(genDiagram.getNotationViewFactoriesPackageName() + ".DomainElementInitializer"));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(next.getUniqueIdentifier());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(importManager.getImportedName(next.getNotationViewFactoryQualifiedClassName()));
    stringBuffer.append(TEXT_107);
    
	if (!isListLayout) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.Bounds"));
    stringBuffer.append(TEXT_109);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationFactory"));
    stringBuffer.append(TEXT_110);
    
		int defaultWidth = 40;
		int defaultHeight = 40;
		DefaultSizeAttributes defSizeAttrs = (DefaultSizeAttributes) next.getViewmap().find(DefaultSizeAttributes.class);
		if (defSizeAttrs != null) {
			defaultWidth = defSizeAttrs.getWidth();
			defaultHeight = defSizeAttrs.getHeight();
		}

    stringBuffer.append(TEXT_111);
    stringBuffer.append(defaultWidth);
    stringBuffer.append(TEXT_112);
    stringBuffer.append(defaultHeight);
    stringBuffer.append(TEXT_113);
    
	}

    stringBuffer.append(TEXT_114);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.TransactionalEditingDomain"));
    stringBuffer.append(TEXT_115);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.util.TransactionUtil"));
    stringBuffer.append(TEXT_116);
    
	TypeModelFacet facet = next.getModelFacet();
	GenFeature childFeature = facet.getChildMetaFeature();
	GenFeature containmentFeature = facet.getContainmentMetaFeature();
	if (childFeature != null && childFeature != containmentFeature && !childFeature.isDerived()) {

    stringBuffer.append(TEXT_117);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_118);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_119);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getEcoreFeature().isMany() ? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(resolvedSemanticElement);
    stringBuffer.append(TEXT_121);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_122);
    stringBuffer.append(containmentFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(importManager.getImportedName(childFeature.getEcoreFeature().isMany() ? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(resolvedSemanticElement);
    stringBuffer.append(TEXT_125);
    stringBuffer.append(importManager.getImportedName(childFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(childFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_127);
    
	} else {

    stringBuffer.append(TEXT_128);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getEcoreFeature().isMany() ? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(resolvedSemanticElement);
    stringBuffer.append(TEXT_130);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_131);
    stringBuffer.append(containmentFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_132);
    
	}

    stringBuffer.append(TEXT_133);
    
}

    stringBuffer.append(TEXT_134);
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_135);
    return stringBuffer.toString();
  }
}
