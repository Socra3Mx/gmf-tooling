package org.eclipse.gmf.codegen.templates.lite.editor;

import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.gmf.common.codegen.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class DiagramEditorUtilGenerator
{
  protected static String nl;
  public static synchronized DiagramEditorUtilGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    DiagramEditorUtilGenerator result = new DiagramEditorUtilGenerator();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_3 = " {" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static String openFilePathDialog(Shell shell, String fileExtensionFilter, int style) {" + NL + "\t\tFileDialog fileDialog = new FileDialog(shell, style);" + NL + "\t\tfileDialog.setFilterExtensions(new String[]{fileExtensionFilter});" + NL + "" + NL + "\t\tfileDialog.open();" + NL + "\t\tif (fileDialog.getFileName() != null && fileDialog.getFileName().length() > 0) {" + NL + "\t\t\treturn fileDialog.getFilterPath() + File.separator + fileDialog.getFileName();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_4 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_5 = " openEditor(URI fileURI) {" + NL + "\t\tIWorkbench workbench = PlatformUI.getWorkbench();" + NL + "\t\tIWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();" + NL + "\t\tIWorkbenchPage page = workbenchWindow.getActivePage();" + NL + "" + NL + "\t\tIEditorDescriptor editorDescriptor = workbench.getEditorRegistry().getDefaultEditor(fileURI.lastSegment());" + NL + "\t\tif (editorDescriptor == null) {" + NL + "\t\t\tMessageDialog.openError(" + NL + "\t\t\tworkbenchWindow.getShell()," + NL + "\t\t\t\"Error\"," + NL + "\t\t\t\"There is no editor registered for the file \" + fileURI.toFileString());" + NL + "\t\t\treturn null;" + NL + "\t\t} else {" + NL + "\t\t\ttry {" + NL + "\t\t\t\treturn page.openEditor(new URIEditorInput(fileURI), editorDescriptor.getId());" + NL + "\t\t\t} catch (PartInitException exception) {" + NL + "\t\t\t\tMessageDialog.openError(" + NL + "\t\t\t\tworkbenchWindow.getShell()," + NL + "\t\t\t\t\"Error Opening Editor\"," + NL + "\t\t\t\texception.getMessage());" + NL + "\t\t\t\treturn null;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_6 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_7 = " showView(URI fileURI) {" + NL + "\t\tIWorkbench workbench = PlatformUI.getWorkbench();" + NL + "\t\tIWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();" + NL + "\t\tIWorkbenchPage page = workbenchWindow.getActivePage();" + NL + "" + NL + "" + NL + "\t\ttry {" + NL + "\t\t\t";
  protected final String TEXT_8 = " diagramView = (";
  protected final String TEXT_9 = ") page.showView(";
  protected final String TEXT_10 = ".ID);" + NL + "\t\t\tif (!diagramView.showDiagram(null, fileURI)) {" + NL + "\t\t\t\treturn null;" + NL + "\t\t\t}" + NL + "\t\t\treturn diagramView;" + NL + "\t\t} catch (PartInitException exception) {" + NL + "\t\t\tMessageDialog.openError(" + NL + "\t\t\tworkbenchWindow.getShell()," + NL + "\t\t\t\"Error Opening View\"," + NL + "\t\t\texception.getMessage());" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static URI getDiagramFileURI(URI modelFileURI) {" + NL + "\t\tif (modelFileURI == null || !modelFileURI.isFile()) {" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t\treturn modelFileURI.trimFileExtension().appendFileExtension(\"";
  protected final String TEXT_13 = "\");" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static URI getModelFileURI(URI diagramFileURI) {" + NL + "\t\tif (diagramFileURI == null || !diagramFileURI.isFile()) {" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t\treturn diagramFileURI.trimFileExtension().appendFileExtension(\"";
  protected final String TEXT_14 = "\");" + NL + "\t}";
  protected final String TEXT_15 = NL + "\t/**" + NL + "\t * Looks up a string in the plugin's plugin.properties file." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static String getString(String key) {" + NL + "\t\treturn ";
  protected final String TEXT_16 = ".getInstance().getBundleString(key);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * RCP's application" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class Application implements ";
  protected final String TEXT_17 = " {" + NL + "\t\t/**" + NL + "\t\t * @see org.eclipse.core.runtime.IPlatformRunnable#run(java.lang.Object)" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic Object run(Object args) {" + NL + "\t\t\t";
  protected final String TEXT_18 = " workbenchAdvisor = new Advisor();" + NL + "\t\t\t";
  protected final String TEXT_19 = " display = ";
  protected final String TEXT_20 = ".createDisplay();" + NL + "\t\t\ttry {" + NL + "\t\t\t\tint returnCode = ";
  protected final String TEXT_21 = ".createAndRunWorkbench(display, workbenchAdvisor);" + NL + "\t\t\t\tif (returnCode == ";
  protected final String TEXT_22 = ".RETURN_RESTART) {" + NL + "\t\t\t\t\treturn ";
  protected final String TEXT_23 = ".EXIT_RESTART;" + NL + "\t\t\t\t} else {" + NL + "\t\t\t\t\treturn ";
  protected final String TEXT_24 = ".EXIT_OK;" + NL + "\t\t\t\t}" + NL + "\t\t\t} finally {" + NL + "\t\t\t\tdisplay.dispose();" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + " " + NL + "  \t/**" + NL + "\t * RCP's perspective" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class Advisor extends ";
  protected final String TEXT_25 = " {" + NL + "\t\t/**" + NL + "\t\t * @see org.eclipse.ui.application.WorkbenchAdvisor#getInitialWindowPerspectiveId()" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic String getInitialWindowPerspectiveId() {" + NL + "\t\t\treturn Perspective.ID_PERSPECTIVE;" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @see org.eclipse.ui.application.WorkbenchAdvisor#initialize(org.eclipse.ui.application.IWorkbenchConfigurer)" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void initialize(";
  protected final String TEXT_26 = " configurer) {" + NL + "\t\t\tsuper.initialize(configurer);" + NL + "\t\t\tconfigurer.setSaveAndRestore(true);" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @see org.eclipse.ui.application.WorkbenchAdvisor#createWorkbenchWindowAdvisor(org.eclipse.ui.application.IWorkbenchWindowConfigurer)" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(";
  protected final String TEXT_27 = " configurer) {" + NL + "\t\t\treturn new WindowAdvisor(configurer);" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "  \t/**" + NL + "\t * RCP's perspective" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class Perspective implements ";
  protected final String TEXT_28 = " {" + NL + "\t\t/**" + NL + "\t\t * Perspective ID" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic static final String ID_PERSPECTIVE = \"";
  protected final String TEXT_29 = ".Perspective\";\t//$NON-NLS-1$" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void createInitialLayout(";
  protected final String TEXT_30 = " layout) {" + NL + "\t\t\tlayout.setEditorAreaVisible(true);" + NL + "\t\t\tlayout.addPerspectiveShortcut(ID_PERSPECTIVE);" + NL + "" + NL + "\t\t\t";
  protected final String TEXT_31 = " right = layout.createFolder(\"right\", ";
  protected final String TEXT_32 = ".RIGHT, (float)0.66, layout.getEditorArea());\t//$NON-NLS-1$" + NL + "\t\t\tright.addView(IPageLayout.ID_OUTLINE);" + NL + "" + NL + "\t\t\t";
  protected final String TEXT_33 = " bottomRight = layout.createFolder(\"bottonRight\", ";
  protected final String TEXT_34 = ".BOTTOM, (float)0.60, \"right\");\t//$NON-NLS-1$\t//$NON-NLS-2$" + NL + "\t\t\tbottomRight.addView(";
  protected final String TEXT_35 = ".ID_PROP_SHEET);" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * RCP's window advisor" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class WindowAdvisor extends ";
  protected final String TEXT_36 = " {" + NL + "\t\t/**" + NL + "\t\t * @see WorkbenchWindowAdvisor#WorkbenchWindowAdvisor(org.eclipse.ui.application.IWorkbenchWindowConfigurer)" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic WindowAdvisor(";
  protected final String TEXT_37 = " configurer) {" + NL + "\t\t\tsuper(configurer);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t/**" + NL + "\t\t * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#preWindowOpen()" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void preWindowOpen() {" + NL + "\t\t\t";
  protected final String TEXT_38 = " configurer = getWindowConfigurer();" + NL + "\t\t\tconfigurer.setInitialSize(new ";
  protected final String TEXT_39 = "(600, 450));" + NL + "\t\t\tconfigurer.setShowCoolBar(false);" + NL + "\t\t\tconfigurer.setShowStatusLine(true);" + NL + "\t\t\tconfigurer.setTitle(getString(\"_UI_Application_title\"));\t//$NON-NLS-1$" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t/**" + NL + "\t\t * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#createActionBarAdvisor(org.eclipse.ui.application.IActionBarConfigurer)" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic ";
  protected final String TEXT_40 = " createActionBarAdvisor(";
  protected final String TEXT_41 = " configurer) {" + NL + "\t\t\treturn new WindowActionBarAdvisor(configurer);" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * RCP's action bar advisor" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class WindowActionBarAdvisor extends ";
  protected final String TEXT_42 = " {" + NL + "\t\t/**" + NL + "\t\t * @see ActionBarAdvisor#ActionBarAdvisor(org.eclipse.ui.application.IActionBarConfigurer)" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic WindowActionBarAdvisor(";
  protected final String TEXT_43 = " configurer) {" + NL + "\t\t\tsuper(configurer);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t/**" + NL + "\t\t * @see org.eclipse.ui.application.ActionBarAdvisor#fillMenuBar(org.eclipse.jface.action.IMenuManager)" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected void fillMenuBar(";
  protected final String TEXT_44 = " menuBar) {" + NL + "\t\t\t";
  protected final String TEXT_45 = " window = getActionBarConfigurer().getWindowConfigurer().getWindow();" + NL + "\t\t\tmenuBar.add(createFileMenu(window));" + NL + "\t\t\tmenuBar.add(createEditMenu(window));" + NL + "\t\t\tmenuBar.add(new ";
  protected final String TEXT_46 = "(";
  protected final String TEXT_47 = ".MB_ADDITIONS));" + NL + "\t\t\tmenuBar.add(createWindowMenu(window));" + NL + "\t\t\tmenuBar.add(createHelpMenu(window));\t\t\t\t\t" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * Creates the 'File' menu." + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
  protected final String TEXT_48 = " createFileMenu(";
  protected final String TEXT_49 = " window) {" + NL + "\t\t\t";
  protected final String TEXT_50 = " menu = new ";
  protected final String TEXT_51 = "(getString(\"_UI_Menu_File_label\"),\t//$NON-NLS-1$" + NL + "\t\t\t\t";
  protected final String TEXT_52 = ".M_FILE);" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_53 = "(";
  protected final String TEXT_54 = ".FILE_START));" + NL + "\t" + NL + "\t\t\t";
  protected final String TEXT_55 = " newMenu = new ";
  protected final String TEXT_56 = "(getString(\"_UI_Menu_New_label\"), \"new\");\t//$NON-NLS-1$\t//$NON-NLS-2$" + NL + "\t\t\tnewMenu.add(new ";
  protected final String TEXT_57 = "(";
  protected final String TEXT_58 = ".MB_ADDITIONS));" + NL + "\t" + NL + "\t\t\tmenu.add(newMenu);" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_59 = "());" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_60 = "(";
  protected final String TEXT_61 = ".MB_ADDITIONS));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_62 = "());" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_63 = ".CLOSE.create(window));" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_64 = ".CLOSE_ALL.create(window));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_65 = "());" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_66 = ".SAVE.create(window));" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_67 = ".SAVE_AS.create(window));" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_68 = ".SAVE_ALL.create(window));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_69 = "());" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_70 = ".QUIT.create(window));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_71 = "(";
  protected final String TEXT_72 = ".FILE_END));" + NL + "\t\t\treturn menu;" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * Creates the 'Edit' menu." + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
  protected final String TEXT_73 = " createEditMenu(";
  protected final String TEXT_74 = " window) {" + NL + "\t\t\t";
  protected final String TEXT_75 = " menu = new ";
  protected final String TEXT_76 = "(getString(\"_UI_Menu_Edit_label\"),\t//$NON-NLS-1$" + NL + "\t\t\t\t";
  protected final String TEXT_77 = ".M_EDIT);" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_78 = "(";
  protected final String TEXT_79 = ".EDIT_START));" + NL + "\t" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_80 = ".UNDO.create(window));" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_81 = ".REDO.create(window));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_82 = "(";
  protected final String TEXT_83 = ".UNDO_EXT));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_84 = "());" + NL + "\t" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_85 = ".CUT.create(window));" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_86 = ".COPY.create(window));" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_87 = ".PASTE.create(window));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_88 = "(";
  protected final String TEXT_89 = ".CUT_EXT));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_90 = "());" + NL + "\t" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_91 = ".DELETE.create(window));" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_92 = ".SELECT_ALL.create(window));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_93 = "());" + NL + "\t" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_94 = "(";
  protected final String TEXT_95 = ".ADD_EXT));" + NL + "\t" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_96 = "(";
  protected final String TEXT_97 = ".EDIT_END));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_98 = "(";
  protected final String TEXT_99 = ".MB_ADDITIONS));" + NL + "\t\t\treturn menu;" + NL + "\t\t}" + NL + "\t" + NL + "\t\t/**" + NL + "\t\t * Creates the 'Window' menu." + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
  protected final String TEXT_100 = " createWindowMenu(";
  protected final String TEXT_101 = " window) {" + NL + "\t\t\t";
  protected final String TEXT_102 = " menu = new ";
  protected final String TEXT_103 = "(getString(\"_UI_Menu_Window_label\"),\t//$NON-NLS-1$" + NL + "\t\t\t\t";
  protected final String TEXT_104 = ".M_WINDOW);" + NL + "\t" + NL + "\t\t\taddToMenuAndRegister(menu, ";
  protected final String TEXT_105 = ".OPEN_NEW_WINDOW.create(window));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_106 = "(";
  protected final String TEXT_107 = ".MB_ADDITIONS));" + NL + "\t\t\tmenu.add(";
  protected final String TEXT_108 = ".OPEN_WINDOWS.create(window));" + NL + "\t" + NL + "\t\t\treturn menu;" + NL + "\t\t}" + NL + "\t" + NL + "\t\t/**" + NL + "\t\t * Creates the 'Help' menu." + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
  protected final String TEXT_109 = " createHelpMenu(";
  protected final String TEXT_110 = " window) {" + NL + "\t\t\t";
  protected final String TEXT_111 = " menu = new ";
  protected final String TEXT_112 = "(getString(\"_UI_Menu_Help_label\"), ";
  protected final String TEXT_113 = ".M_HELP);\t//$NON-NLS-1$" + NL + "\t\t\t// Welcome or intro page would go here" + NL + "\t\t\t// Help contents would go here" + NL + "\t\t\t// Tips and tricks page would go here" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_114 = "(";
  protected final String TEXT_115 = ".HELP_START));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_116 = "(";
  protected final String TEXT_117 = ".HELP_END));" + NL + "\t\t\tmenu.add(new ";
  protected final String TEXT_118 = "(";
  protected final String TEXT_119 = ".MB_ADDITIONS));" + NL + "\t\t\treturn menu;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t/**" + NL + "\t\t * Adds the specified action to the given menu and also registers the action with the" + NL + "\t\t * action bar configurer, in order to activate its key binding." + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected void addToMenuAndRegister(";
  protected final String TEXT_120 = " menuManager, ";
  protected final String TEXT_121 = " action) {" + NL + "\t\t\tmenuManager.add(action);" + NL + "\t\t\tgetActionBarConfigurer().registerGlobalAction(action);\t\t\t" + NL + "\t\t}\t\t" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * About action for the RCP application." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class AboutAction extends ";
  protected final String TEXT_122 = " {" + NL + "\t\t/**" + NL + "\t\t * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void run(";
  protected final String TEXT_123 = " action) {" + NL + "\t\t\t";
  protected final String TEXT_124 = ".openInformation(getWindow().getShell(), getString(\"_UI_About_title\"),\t//$NON-NLS-1$" + NL + "\t\t\tgetString(\"_UI_About_text\"));\t//$NON-NLS-1$" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_125 = NL + NL + " \t/**" + NL + "\t * Open action for the ";
  protected final String TEXT_126 = " diagram." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class OpenDiagramAction extends ";
  protected final String TEXT_127 = " {" + NL + "\t\t/**" + NL + "\t\t * Opens the editors for the files selected using the file dialog." + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void run(";
  protected final String TEXT_128 = " action) {" + NL + "\t\t\tString filePath = openFilePathDialog(getWindow().getShell(), \"*.";
  protected final String TEXT_129 = "\", ";
  protected final String TEXT_130 = ".OPEN);\t//$NON-NLS-1$" + NL + "\t\t\tif (filePath != null) {";
  protected final String TEXT_131 = NL + "\t\t\t\topenEditor(URI.createFileURI(filePath));";
  protected final String TEXT_132 = NL + "\t\t\t\tshowView(URI.createFileURI(filePath));";
  protected final String TEXT_133 = NL + "\t\t\t}" + NL + "\t\t}" + NL + " \t}" + NL + "" + NL + "\t/**" + NL + "\t * Open URI action for the ";
  protected final String TEXT_134 = " diagram." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class OpenURIAction extends ";
  protected final String TEXT_135 = " {" + NL + "\t\t/**" + NL + "\t\t * Opens the editors for the files selected using the LoadResourceDialog." + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void run(";
  protected final String TEXT_136 = " action) {" + NL + "\t\t\t";
  protected final String TEXT_137 = ".LoadResourceDialog loadResourceDialog = new ";
  protected final String TEXT_138 = ".LoadResourceDialog(getWindow().getShell());" + NL + "\t\t\tif (";
  protected final String TEXT_139 = ".OK == loadResourceDialog.open()) {" + NL + "\t\t\t\tfor (";
  protected final String TEXT_140 = " it = loadResourceDialog.getURIs().iterator(); it.hasNext(); ) {";
  protected final String TEXT_141 = NL + "\t\t\t\t\topenEditor((URI) it.next());";
  protected final String TEXT_142 = NL + "\t\t\t\t\tshowView((URI) it.next());";
  protected final String TEXT_143 = NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * New diagram action for the ";
  protected final String TEXT_144 = " diagram." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class NewDiagramAction extends ";
  protected final String TEXT_145 = " {" + NL + "\t\t/**" + NL + "\t\t * Opens the wizard to create the diagram." + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void run(";
  protected final String TEXT_146 = " action) {" + NL + "\t\t\t";
  protected final String TEXT_147 = " wizard = new ";
  protected final String TEXT_148 = "();" + NL + "\t\t\twizard.init(getWindow().getWorkbench(), ";
  protected final String TEXT_149 = ".EMPTY);" + NL + "\t\t\t";
  protected final String TEXT_150 = " wizardDialog = new ";
  protected final String TEXT_151 = "(getWindow().getShell(), wizard);" + NL + "\t\t\twizardDialog.open();" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_152 = NL + "}";
  protected final String TEXT_153 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
final GenDiagram genDiagram = (GenDiagram) ((Object[]) argument)[0];
final GenEditorGenerator editorGen = genDiagram.getEditorGen();
final GenPlugin genPlugin = editorGen.getPlugin();
final ImportAssistant importManager = (ImportAssistant) ((Object[]) argument)[1];
final GenModel genModel = genDiagram.getEditorGen().getDomainGenModel();
final boolean isRichClientPlatform = genDiagram.getEditorGen().getDomainGenModel().isRichClientPlatform();

importManager.emitPackageStatement(stringBuffer);
    stringBuffer.append(TEXT_1);
    importManager.markImportLocation(stringBuffer);
importManager.addImport("java.io.File");
importManager.addImport("org.eclipse.ui.IWorkbench");
importManager.addImport("org.eclipse.ui.IWorkbenchPage");
importManager.addImport("org.eclipse.ui.IWorkbenchWindow");
importManager.addImport("org.eclipse.ui.PlatformUI");
importManager.addImport("org.eclipse.ui.PartInitException");
importManager.addImport("org.eclipse.ui.IEditorDescriptor");
importManager.addImport("org.eclipse.swt.widgets.Shell");
importManager.addImport("org.eclipse.swt.widgets.FileDialog"); 
importManager.addImport("org.eclipse.jface.dialogs.MessageDialog");
importManager.addImport("org.eclipse.emf.common.util.URI");
importManager.addImport("org.eclipse.emf.common.ui.URIEditorInput");

    stringBuffer.append(TEXT_2);
    stringBuffer.append(genDiagram.getDiagramEditorUtilClassName());
    stringBuffer.append(TEXT_3);
    
if (editorGen.getEditor().isEclipseEditor()) {

    stringBuffer.append(TEXT_4);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IEditorPart"));
    stringBuffer.append(TEXT_5);
    
} else {

    stringBuffer.append(TEXT_6);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IViewPart"));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.lite.parts.DiagramViewPart"));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.lite.parts.DiagramViewPart"));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(importManager.getImportedName(editorGen.getEditor().getQualifiedClassName()));
    stringBuffer.append(TEXT_10);
    
}

    stringBuffer.append(TEXT_11);
    
if (!genDiagram.getEditorGen().isSameFileForDiagramAndModel()) {

    stringBuffer.append(TEXT_12);
    stringBuffer.append(editorGen.getDiagramFileExtension());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(editorGen.getDomainFileExtension());
    stringBuffer.append(TEXT_14);
    
}

    
if (isRichClientPlatform) {
	boolean shouldGenerateApplication = true;	/*XXX: option in gmfgen*/
	if (shouldGenerateApplication) {

    stringBuffer.append(TEXT_15);
    stringBuffer.append(importManager.getImportedName(genPlugin.getActivatorQualifiedClassName()));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(importManager.getImportedName("org.eclipse.core.runtime.IPlatformRunnable"));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.application.WorkbenchAdvisor"));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(importManager.getImportedName("org.eclipse.swt.widgets.Display"));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.PlatformUI"));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.PlatformUI"));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.PlatformUI"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(importManager.getImportedName("org.eclipse.core.runtime.IPlatformRunnable"));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(importManager.getImportedName("org.eclipse.core.runtime.IPlatformRunnable"));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.application.WorkbenchAdvisor"));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.application.IWorkbenchConfigurer"));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.application.IWorkbenchWindowConfigurer"));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IPerspectiveFactory"));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genPlugin.getID());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IPageLayout"));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IFolderLayout"));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IPageLayout"));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IFolderLayout"));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IPageLayout"));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IPageLayout"));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.application.WorkbenchWindowAdvisor"));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.application.IWorkbenchWindowConfigurer"));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.application.IWorkbenchWindowConfigurer"));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(importManager.getImportedName("org.eclipse.swt.graphics.Point"));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.application.ActionBarAdvisor"));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.application.IActionBarConfigurer"));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.application.ActionBarAdvisor"));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.application.IActionBarConfigurer"));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IMenuManager"));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchWindow"));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IMenuManager"));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchWindow"));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IMenuManager"));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.MenuManager"));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_53);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IMenuManager"));
    stringBuffer.append(TEXT_55);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.MenuManager"));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_57);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_58);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.Separator"));
    stringBuffer.append(TEXT_59);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_60);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_61);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.Separator"));
    stringBuffer.append(TEXT_62);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.Separator"));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_66);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.Separator"));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IMenuManager"));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchWindow"));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IMenuManager"));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.MenuManager"));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_78);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.Separator"));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_85);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_87);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_88);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_89);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.Separator"));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_91);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.Separator"));
    stringBuffer.append(TEXT_93);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_96);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.Separator"));
    stringBuffer.append(TEXT_98);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IMenuManager"));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchWindow"));
    stringBuffer.append(TEXT_101);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IMenuManager"));
    stringBuffer.append(TEXT_102);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.MenuManager"));
    stringBuffer.append(TEXT_103);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_104);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ActionFactory"));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_106);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_107);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.actions.ContributionItemFactory"));
    stringBuffer.append(TEXT_108);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IMenuManager"));
    stringBuffer.append(TEXT_109);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchWindow"));
    stringBuffer.append(TEXT_110);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IMenuManager"));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.MenuManager"));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_113);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_114);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_115);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.GroupMarker"));
    stringBuffer.append(TEXT_118);
    stringBuffer.append(importManager.getImportedName("org.eclipse.ui.IWorkbenchActionConstants"));
    stringBuffer.append(TEXT_119);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IMenuManager"));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IAction"));
    stringBuffer.append(TEXT_121);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate"));
    stringBuffer.append(TEXT_122);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IAction"));
    stringBuffer.append(TEXT_123);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.dialogs.MessageDialog"));
    stringBuffer.append(TEXT_124);
    
 	}
 
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate"));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IAction"));
    stringBuffer.append(TEXT_128);
    stringBuffer.append(editorGen.getDiagramFileExtension());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(importManager.getImportedName("org.eclipse.swt.SWT"));
    stringBuffer.append(TEXT_130);
    
if (genDiagram.getEditorGen().getEditor().isEclipseEditor()) {

    stringBuffer.append(TEXT_131);
    
} else {

    stringBuffer.append(TEXT_132);
    
}

    stringBuffer.append(TEXT_133);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate"));
    stringBuffer.append(TEXT_135);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IAction"));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.ui.action.LoadResourceAction"));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.ui.action.LoadResourceAction"));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.dialogs.Dialog"));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(importManager.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_140);
    
if (genDiagram.getEditorGen().getEditor().isEclipseEditor()) {

    stringBuffer.append(TEXT_141);
    
} else {

    stringBuffer.append(TEXT_142);
    
}

    stringBuffer.append(TEXT_143);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate"));
    stringBuffer.append(TEXT_145);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.action.IAction"));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(importManager.getImportedName(genDiagram.getCreationWizardQualifiedClassName()));
    stringBuffer.append(TEXT_147);
    stringBuffer.append(importManager.getImportedName(genDiagram.getCreationWizardQualifiedClassName()));
    stringBuffer.append(TEXT_148);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.viewers.StructuredSelection"));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.wizard.WizardDialog"));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(importManager.getImportedName("org.eclipse.jface.wizard.WizardDialog"));
    stringBuffer.append(TEXT_151);
    
}

    stringBuffer.append(TEXT_152);
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_153);
    return stringBuffer.toString();
  }
}
