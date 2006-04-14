package org.eclipse.gmf.codegen.templates.parts;

import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.gmf.common.codegen.*;

public class LinkLabelEditPartGenerator
{
  protected static String nl;
  public static synchronized LinkLabelEditPartGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    LinkLabelEditPartGenerator result = new LinkLabelEditPartGenerator();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "/*" + NL + " * ";
  protected final String TEXT_3 = NL + " */";
  protected final String TEXT_4 = NL + NL + "import org.eclipse.draw2d.ConnectionLocator;" + NL + "import org.eclipse.draw2d.geometry.Point;" + NL + "import org.eclipse.gef.EditPolicy;" + NL + "import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;" + NL + "import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;" + NL + "import org.eclipse.gmf.runtime.diagram.ui.editpolicies.LabelDirectEditPolicy;" + NL + "import org.eclipse.gmf.runtime.notation.View;";
  protected final String TEXT_5 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_6 = " extends LabelEditPart implements ITextAwareEditPart {";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static String VISUAL_ID = \"";
  protected final String TEXT_9 = "\";";
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_12 = " manager;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_13 = " parser;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_14 = " parserElements;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate String defaultText;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tstatic {" + NL + "\t\tregisterSnapBackPosition(";
  protected final String TEXT_15 = ".VISUAL_ID, new Point(0, 0));" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_16 = "(View view) {" + NL + "\t\tsuper(view);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void createDefaultEditPolicies() {" + NL + "\t\tsuper.createDefaultEditPolicies();" + NL + "\t\tinstallEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new LabelDirectEditPolicy());" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getKeyPoint() {" + NL + "\t\treturn ConnectionLocator.";
  protected final String TEXT_17 = ";" + NL + "\t}" + NL;
  protected final String TEXT_18 = NL;
  protected final String TEXT_19 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_20 = " getLabel() {" + NL + "\t\treturn (";
  protected final String TEXT_21 = ") getFigure();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setLabel(";
  protected final String TEXT_22 = " figure) {" + NL + "\t\tunregisterVisuals();" + NL + "\t\tsetFigure(figure);" + NL + "\t\tdefaultText = figure.getText();" + NL + "\t\tregisterVisuals();" + NL + "\t\trefreshVisuals();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setLabelText(String text) {" + NL + "\t\tgetLabel().setText(text);" + NL + "\t\tObject pdEditPolicy = getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);" + NL + "\t\tif (pdEditPolicy instanceof ";
  protected final String TEXT_23 = ") {" + NL + "\t\t\t((";
  protected final String TEXT_24 = ") pdEditPolicy).refreshFeedback();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void refreshUnderline() {" + NL + "\t\t";
  protected final String TEXT_25 = " style =" + NL + "\t\t\t(";
  protected final String TEXT_26 = ") getPrimaryView().getStyle(" + NL + "\t\t\t\t";
  protected final String TEXT_27 = ".eINSTANCE.getFontStyle());" + NL + "\t\tif (style != null) {" + NL + "\t\t\t//getLabel().setTextUnderline(style.isUnderline());" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void refreshStrikeThrough() {" + NL + "\t\t";
  protected final String TEXT_28 = " style =" + NL + "\t\t\t(";
  protected final String TEXT_29 = ") getPrimaryView().getStyle(" + NL + "\t\t\t\t";
  protected final String TEXT_30 = ".eINSTANCE.getFontStyle());" + NL + "\t\tif (style != null) {" + NL + "\t\t\t//getLabel().setTextStrikeThrough(style.isStrikeThrough());" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_31 = NL;
  protected final String TEXT_32 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_33 = " getLabelIcon() {" + NL + "\t\treturn null;" + NL + "\t}";
  protected final String TEXT_34 = NL;
  protected final String TEXT_35 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_36 = " getModelChildren() {" + NL + "\t\treturn ";
  protected final String TEXT_37 = ".EMPTY_LIST;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_38 = " getChildBySemanticHint(String semanticHint) {" + NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected String getLabelText() {" + NL + "\t\t";
  protected final String TEXT_39 = " element = resolveSemanticElement();" + NL + "\t\tString text = null;" + NL + "\t\tif (element != null && getParser() != null) {" + NL + "\t\t\ttext = getParser().getPrintString(new ";
  protected final String TEXT_40 = "(element)," + NL + "\t\t\t\tgetParserOptions().intValue());" + NL + "\t\t}" + NL + "\t\tif (text == null || text.length() == 0) {" + NL + "\t\t\ttext = defaultText;" + NL + "\t\t}" + NL + "\t\treturn text;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String getEditText() {" + NL + "\t\t";
  protected final String TEXT_41 = " element = resolveSemanticElement();" + NL + "\t\tif (element == null || getParser() == null) {" + NL + "\t\t\treturn \"\";" + NL + "\t\t}" + NL + "\t\treturn getParser().getEditString(new ";
  protected final String TEXT_42 = "(element)," + NL + "\t\t\tgetParserOptions().intValue());" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected boolean isEditable() {";
  protected final String TEXT_43 = NL + "\t\t";
  protected final String TEXT_44 = " element = resolveSemanticElement();" + NL + "\t\tif (element != null && getEditText() != null) {" + NL + "\t\t\treturn true;" + NL + "\t\t}";
  protected final String TEXT_45 = NL + "\t\treturn false;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_46 = " getEditTextValidator() {" + NL + "\t\treturn new ";
  protected final String TEXT_47 = "() {" + NL + "" + NL + "\t\t\tpublic String isValid(final Object value) {" + NL + "\t\t\t\tif (value instanceof String) {" + NL + "\t\t\t\t\tfinal ";
  protected final String TEXT_48 = " element = resolveSemanticElement();" + NL + "\t\t\t\t\tfinal ";
  protected final String TEXT_49 = " parser = getParser();" + NL + "\t\t\t\t\ttry {" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_50 = " valid =" + NL + "\t\t\t\t\t\t\t(";
  protected final String TEXT_51 = ") getEditingDomain().runExclusive(" + NL + "\t\t\t\t\t\t\t\tnew ";
  protected final String TEXT_52 = ".Impl() {" + NL + "" + NL + "\t\t\t\t\t\t\tpublic void run() {" + NL + "\t\t\t\t\t\t\t\tsetResult(parser.isValidEditString(" + NL + "\t\t\t\t\t\t\t\t\tnew ";
  protected final String TEXT_53 = "(element), (String) value));" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t});" + NL + "\t\t\t\t\t\treturn valid.getCode() == ";
  protected final String TEXT_54 = ".EDITABLE ?" + NL + "\t\t\t\t\t\t\tnull : valid.getMessage();" + NL + "\t\t\t\t\t} catch (InterruptedException ie) {" + NL + "\t\t\t\t\t\tie.printStackTrace();" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "" + NL + "\t\t\t\t// shouldn't get here" + NL + "\t\t\t\treturn null;" + NL + "\t\t\t}" + NL + "\t\t};" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_55 = " getCompletionProcessor() {" + NL + "\t\t";
  protected final String TEXT_56 = " element = resolveSemanticElement();" + NL + "\t\tif (element == null || getParser() == null) {" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t\treturn getParser().getCompletionProcessor(new ";
  protected final String TEXT_57 = "(element));" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_58 = " getParserOptions() {" + NL + "\t\treturn ";
  protected final String TEXT_59 = ".NONE;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_60 = " getParser() {" + NL + "\t\tif (parser == null) {" + NL + "\t\t\tString parserHint = ((";
  protected final String TEXT_61 = ") getModel()).getType();" + NL + "\t\t\t";
  protected final String TEXT_62 = " element = resolveSemanticElement();" + NL + "\t\t\tif (element != null) {" + NL + "\t\t\t\t";
  protected final String TEXT_63 = " hintAdapter =" + NL + "\t\t\t\t\tnew ";
  protected final String TEXT_64 = "(element, parserHint) {" + NL + "" + NL + "\t\t\t\t\tpublic Object getAdapter(Class adapter) {" + NL + "\t\t\t\t\t\tif (";
  protected final String TEXT_65 = ".class.equals(adapter)) {" + NL + "\t\t\t\t\t\t\treturn ";
  protected final String TEXT_66 = ".";
  protected final String TEXT_67 = ";" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\treturn super.getAdapter(adapter);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t};" + NL + "\t\t\t\tparser = ";
  protected final String TEXT_68 = ".getInstance().getParser(hintAdapter);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn parser;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_69 = " getManager() {" + NL + "\t\tif (manager == null) {" + NL + "\t\t\tsetManager(new ";
  protected final String TEXT_70 = "(this));" + NL + "\t\t}" + NL + "\t\treturn manager;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void setManager(";
  protected final String TEXT_71 = " manager) {" + NL + "\t\tthis.manager = manager;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void performDirectEdit() {" + NL + "\t\tgetManager().show();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void performDirectEdit(";
  protected final String TEXT_72 = " eventLocation) {" + NL + "\t\tif (getManager().getClass() == ";
  protected final String TEXT_73 = ".class) {" + NL + "\t\t\t((";
  protected final String TEXT_74 = ") getManager()).show(eventLocation.getSWTPoint());" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate void performDirectEdit(char initialCharacter) {" + NL + "\t\tif (getManager() instanceof ";
  protected final String TEXT_75 = ") {" + NL + "\t\t\t((";
  protected final String TEXT_76 = ") getManager()).show(initialCharacter);" + NL + "\t\t} else {" + NL + "\t\t\tperformDirectEdit();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void performDirectEditRequest(";
  protected final String TEXT_77 = " request) {" + NL + "\t\tfinal ";
  protected final String TEXT_78 = " theRequest = request;" + NL + "\t\ttry {" + NL + "\t\t\tgetEditingDomain().runExclusive(new Runnable() {" + NL + "" + NL + "\t\t\t\tpublic void run() {" + NL + "\t\t\t\t\tif (isActive() && isEditable()) {" + NL + "\t\t\t\t\t\tif (theRequest.getExtendedData().get(";
  protected final String TEXT_79 = ".REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR) instanceof Character) {" + NL + "\t\t\t\t\t\t\tCharacter initialChar = (Character) theRequest.getExtendedData().get(";
  protected final String TEXT_80 = ".REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR);" + NL + "\t\t\t\t\t\t\tperformDirectEdit(initialChar.charValue());" + NL + "\t\t\t\t\t\t} else if ((theRequest instanceof ";
  protected final String TEXT_81 = ") && (getEditText().equals(getLabelText()))) {" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_82 = " editRequest =" + NL + "\t\t\t\t\t\t\t\t(";
  protected final String TEXT_83 = ") theRequest;" + NL + "\t\t\t\t\t\t\tperformDirectEdit(editRequest.getLocation());" + NL + "\t\t\t\t\t\t} else {" + NL + "\t\t\t\t\t\t\tperformDirectEdit();" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t});" + NL + "\t\t} catch (InterruptedException e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void refreshVisuals() {" + NL + "\t\tsuper.refreshVisuals();" + NL + "\t\trefreshLabel();" + NL + "\t\trefreshFont();" + NL + "\t\trefreshFontColor();" + NL + "\t\trefreshUnderline();" + NL + "\t\trefreshStrikeThrough();";
  protected final String TEXT_84 = NL + "\t\trefreshBounds();";
  protected final String TEXT_85 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void refreshLabel() {" + NL + "\t\tgetLabel().setText(getLabelText());" + NL + "\t\tgetLabel().setIcon(getLabelIcon());" + NL + "\t\tObject pdEditPolicy = getEditPolicy(";
  protected final String TEXT_86 = ".PRIMARY_DRAG_ROLE);" + NL + "\t\tif (pdEditPolicy instanceof ";
  protected final String TEXT_87 = ") {" + NL + "\t\t\t((";
  protected final String TEXT_88 = ") pdEditPolicy).refreshFeedback();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void refreshFont() {" + NL + "\t\t";
  protected final String TEXT_89 = " style =" + NL + "\t\t\t(";
  protected final String TEXT_90 = ") getPrimaryView().getStyle(" + NL + "\t\t\t\t";
  protected final String TEXT_91 = ".eINSTANCE.getFontStyle());" + NL + "\t\t";
  protected final String TEXT_92 = " fontData;" + NL + "\t\tif (style != null) {" + NL + "\t\t\tfontData = new ";
  protected final String TEXT_93 = "(" + NL + "\t\t\t\tstyle.getFontName(), style.getFontHeight()," + NL + "\t\t\t\t(style.isBold() ? ";
  protected final String TEXT_94 = ".BOLD : ";
  protected final String TEXT_95 = ".NORMAL) |" + NL + "\t\t\t\t(style.isItalic() ? ";
  protected final String TEXT_96 = ".ITALIC : ";
  protected final String TEXT_97 = ".NORMAL));" + NL + "\t\t} else {" + NL + "\t\t\t// initialize font to defaults" + NL + "\t\t\tfontData = ";
  protected final String TEXT_98 = ".getFontData(" + NL + "\t\t\t\t(";
  protected final String TEXT_99 = ") getDiagramPreferencesHint().getPreferenceStore()," + NL + "\t\t\t\t";
  protected final String TEXT_100 = ".PREF_DEFAULT_FONT);" + NL + "\t\t}" + NL + "\t\tsetFont(fontData);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void setFontColor(";
  protected final String TEXT_101 = " color) {" + NL + "\t\tgetLabel().setForegroundColor(color);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void addSemanticListeners() {" + NL + "\t\tif (getParser() instanceof ";
  protected final String TEXT_102 = ") {" + NL + "\t\t\t";
  protected final String TEXT_103 = " element = resolveSemanticElement();" + NL + "\t\t\tparserElements = ((";
  protected final String TEXT_104 = ") getParser()).getSemanticElementsBeingParsed(element);" + NL + "\t\t\tfor (int i = 0; i < parserElements.size(); i++) {" + NL + "\t\t\t\taddListenerFilter(\"SemanticModel\" + i, this, (";
  protected final String TEXT_105 = ") parserElements.get(i)); //$NON-NLS-1$" + NL + "\t\t\t}" + NL + "\t\t} else {" + NL + "\t\t\tsuper.addSemanticListeners();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void removeSemanticListeners() {" + NL + "\t\tif (parserElements != null) {" + NL + "\t\t\tfor (int i = 0; i < parserElements.size(); i++) {" + NL + "\t\t\t\tremoveListenerFilter(\"SemanticModel\" + i); //$NON-NLS-1$" + NL + "\t\t\t}" + NL + "\t\t} else {" + NL + "\t\t\tsuper.removeSemanticListeners();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_106 = " getAccessibleEditPart() {" + NL + "\t\tif (accessibleEP == null) {" + NL + "\t\t\taccessibleEP = new AccessibleGraphicalEditPart() {" + NL + "" + NL + "\t\t\t\tpublic void getName(";
  protected final String TEXT_107 = " e) {" + NL + "\t\t\t\t\te.result = getLabel().getText();" + NL + "\t\t\t\t}" + NL + "\t\t\t};" + NL + "\t\t}" + NL + "\t\treturn accessibleEP;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void handleNotificationEvent(";
  protected final String TEXT_108 = " event) {" + NL + "\t\tObject feature = event.getFeature();";
  protected final String TEXT_109 = NL;
  protected final String TEXT_110 = "\t\tif (";
  protected final String TEXT_111 = ".eINSTANCE.getFontStyle_FontColor().equals(feature)) {" + NL + "\t\t\tInteger c = (Integer) event.getNewValue();" + NL + "\t\t\tsetFontColor(";
  protected final String TEXT_112 = ".getInstance().getColor(c));" + NL + "\t\t} else if (";
  protected final String TEXT_113 = ".eINSTANCE.getFontStyle_Underline().equals(feature)) {" + NL + "\t\t\trefreshUnderline();" + NL + "\t\t} else if (";
  protected final String TEXT_114 = ".eINSTANCE.getFontStyle_StrikeThrough().equals(feature)) {" + NL + "\t\t\trefreshStrikeThrough();" + NL + "\t\t} else if (";
  protected final String TEXT_115 = ".eINSTANCE.getFontStyle_FontHeight().equals(feature) ||" + NL + "\t\t\t\t";
  protected final String TEXT_116 = ".eINSTANCE.getFontStyle_FontName().equals(feature) ||" + NL + "\t\t\t\t";
  protected final String TEXT_117 = ".eINSTANCE.getFontStyle_Bold().equals(feature) ||" + NL + "\t\t\t\t";
  protected final String TEXT_118 = ".eINSTANCE.getFontStyle_Italic().equals(feature)) {" + NL + "\t\t\trefreshFont();" + NL + "\t\t} else {" + NL + "\t\t\tif (getParser() != null && getParser().isAffectingEvent(event, getParserOptions().intValue())) {" + NL + "\t\t\t\trefreshLabel();" + NL + "\t\t\t}" + NL + "\t\t\tif (getParser() instanceof ISemanticParser) {" + NL + "\t\t\t\t";
  protected final String TEXT_119 = " modelParser =" + NL + "\t\t\t\t\t(";
  protected final String TEXT_120 = ") getParser();" + NL + "\t\t\t\tif (modelParser.areSemanticElementsAffected(null, event)) {" + NL + "\t\t\t\t\tremoveSemanticListeners();" + NL + "\t\t\t\t\tif (resolveSemanticElement() != null) {" + NL + "\t\t\t\t\t\taddSemanticListeners();" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\trefreshLabel();" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tsuper.handleNotificationEvent(event);" + NL + "\t}";
  protected final String TEXT_121 = NL;
  protected final String TEXT_122 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_123 = " createFigure() {" + NL + "\t\t";
  protected final String TEXT_124 = " label = createFigurePrim();" + NL + "\t\tif (label instanceof ";
  protected final String TEXT_125 = ") {" + NL + "\t\t\tdefaultText = ((";
  protected final String TEXT_126 = ") label).getText();" + NL + "\t\t} else if (label instanceof ";
  protected final String TEXT_127 = ") {" + NL + "\t\t\tdefaultText = ((";
  protected final String TEXT_128 = ") label).getText();" + NL + "\t\t}" + NL + "\t\treturn label;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_129 = " createFigurePrim() {";
  protected final String TEXT_130 = NL + "\t\treturn new ";
  protected final String TEXT_131 = "();";
  protected final String TEXT_132 = NL + "\t\treturn ";
  protected final String TEXT_133 = ";";
  protected final String TEXT_134 = NL + "\t\treturn new ";
  protected final String TEXT_135 = "();";
  protected final String TEXT_136 = NL + "\t}" + NL;
  protected final String TEXT_137 = NL;
  protected final String TEXT_138 = NL + "}";
  protected final String TEXT_139 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
GenLinkLabel genLabel = (GenLinkLabel) ((Object[]) argument)[0];
ImportAssistant importManager = (ImportAssistant) ((Object[]) argument)[1];
GenCommonBase genHost = genLabel.getLink();
GenDiagram genDiagram = genLabel.getDiagram();

    stringBuffer.append(TEXT_1);
    
String copyrightText = genDiagram.getEditorGen().getCopyrightText();
if (copyrightText != null && copyrightText.trim().length() > 0) {

    stringBuffer.append(TEXT_2);
    stringBuffer.append(copyrightText.replaceAll("\n", "\n * "));
    stringBuffer.append(TEXT_3);
    }
    importManager.emitPackageStatement(stringBuffer);
    stringBuffer.append(TEXT_4);
    importManager.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genLabel.getEditPartClassName());
    stringBuffer.append(TEXT_6);
    {
GenCommonBase genCommonBase = genLabel;
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genCommonBase.getVisualID());
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.tools.DirectEditManager"));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.common.ui.services.parser.IParser"));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(importManager.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(importManager.getImportedName(genLabel.getEditPartQualifiedClassName()));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genLabel.getEditPartClassName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genLabel.getAlignment());
    stringBuffer.append(TEXT_17);
    final boolean needsRefreshBounds = false;
    stringBuffer.append(TEXT_18);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.Label"));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.Label"));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.Label"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(importManager.getImportedName(genDiagram.getTextSelectionEditPolicyQualifiedClassName()));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(importManager.getImportedName(genDiagram.getTextSelectionEditPolicyQualifiedClassName()));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.FontStyle"));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.FontStyle"));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.FontStyle"));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.FontStyle"));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(importManager.getImportedName("org.eclipse.swt.graphics.Image"));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(importManager.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(importManager.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart"));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter"));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter"));
    stringBuffer.append(TEXT_42);
    if (!genLabel.isReadOnly()) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_45);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.viewers.ICellEditorValidator"));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.viewers.ICellEditorValidator"));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.common.ui.services.parser.IParser"));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus"));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus"));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.RunnableWithResult"));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter"));
    stringBuffer.append(TEXT_53);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus"));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.text.contentassist.IContentAssistProcessor"));
    stringBuffer.append(TEXT_55);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter"));
    stringBuffer.append(TEXT_57);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions"));
    stringBuffer.append(TEXT_58);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions"));
    stringBuffer.append(TEXT_59);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.common.ui.services.parser.IParser"));
    stringBuffer.append(TEXT_60);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_61);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_62);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter"));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter"));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.type.core.IElementType"));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(importManager.getImportedName(genDiagram.getElementTypesQualifiedClassName()));
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genHost.getUniqueIdentifier());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.common.ui.services.parser.ParserService"));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.tools.DirectEditManager"));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager"));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.tools.DirectEditManager"));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Point"));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager"));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager"));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager"));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager"));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.Request"));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.Request"));
    stringBuffer.append(TEXT_78);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants"));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants"));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.requests.DirectEditRequest"));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.requests.DirectEditRequest"));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.requests.DirectEditRequest"));
    stringBuffer.append(TEXT_83);
    if (needsRefreshBounds) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_85);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.EditPolicy"));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(importManager.getImportedName(genDiagram.getTextSelectionEditPolicyQualifiedClassName()));
    stringBuffer.append(TEXT_87);
    stringBuffer.append(importManager.getImportedName(genDiagram.getTextSelectionEditPolicyQualifiedClassName()));
    stringBuffer.append(TEXT_88);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.FontStyle"));
    stringBuffer.append(TEXT_89);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.FontStyle"));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_91);
    stringBuffer.append(importManager.getImportedName("org.eclipse.swt.graphics.FontData"));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(importManager.getImportedName("org.eclipse.swt.graphics.FontData"));
    stringBuffer.append(TEXT_93);
    stringBuffer.append(importManager.getImportedName("org.eclipse.swt.SWT"));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(importManager.getImportedName("org.eclipse.swt.SWT"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(importManager.getImportedName("org.eclipse.swt.SWT"));
    stringBuffer.append(TEXT_96);
    stringBuffer.append(importManager.getImportedName("org.eclipse.swt.SWT"));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.preference.PreferenceConverter"));
    stringBuffer.append(TEXT_98);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.preference.IPreferenceStore"));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants"));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(importManager.getImportedName("org.eclipse.swt.graphics.Color"));
    stringBuffer.append(TEXT_101);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser"));
    stringBuffer.append(TEXT_102);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_103);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser"));
    stringBuffer.append(TEXT_104);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.AccessibleEditPart"));
    stringBuffer.append(TEXT_106);
    stringBuffer.append(importManager.getImportedName("org.eclipse.swt.accessibility.AccessibleEvent"));
    stringBuffer.append(TEXT_107);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_108);
    stringBuffer.append(TEXT_109);
    stringBuffer.append(TEXT_110);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry"));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_113);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_114);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_115);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationPackage"));
    stringBuffer.append(TEXT_118);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser"));
    stringBuffer.append(TEXT_119);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser"));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(TEXT_121);
    stringBuffer.append(TEXT_122);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.IFigure"));
    stringBuffer.append(TEXT_123);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.IFigure"));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.Label"));
    stringBuffer.append(TEXT_125);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.Label"));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel"));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel"));
    stringBuffer.append(TEXT_128);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.IFigure"));
    stringBuffer.append(TEXT_129);
    
String figureQualifiedClassName = null;
Viewmap viewmap = genLabel.getViewmap();
if (viewmap instanceof FigureViewmap) {
	figureQualifiedClassName = ((FigureViewmap) viewmap).getFigureQualifiedClassName();
	if (figureQualifiedClassName == null || figureQualifiedClassName.trim().length() == 0) {
		figureQualifiedClassName = "org.eclipse.draw2d.Label";
	}

    stringBuffer.append(TEXT_130);
    stringBuffer.append(importManager.getImportedName(figureQualifiedClassName));
    stringBuffer.append(TEXT_131);
    } // instanceof FigureViewmap
 else if (viewmap instanceof SnippetViewmap) {
    stringBuffer.append(TEXT_132);
    stringBuffer.append(((SnippetViewmap) viewmap).getBody());
    stringBuffer.append(TEXT_133);
    } // instanceof SnippetViewmap; FIXME : obtain figure class name to generate getter
 else if (viewmap instanceof InnerClassViewmap) {
 	figureQualifiedClassName = ((InnerClassViewmap) viewmap).getClassName();

    stringBuffer.append(TEXT_134);
    stringBuffer.append(figureQualifiedClassName);
    stringBuffer.append(TEXT_135);
    }
    stringBuffer.append(TEXT_136);
    if (genLabel.getViewmap() instanceof InnerClassViewmap) {
    stringBuffer.append(TEXT_137);
    stringBuffer.append(((InnerClassViewmap) genLabel.getViewmap()).getClassBody());
    }
    stringBuffer.append(TEXT_138);
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_139);
    return stringBuffer.toString();
  }
}
