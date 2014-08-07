package org.strasa.web.analysis.sssl.view.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.analysis.rserve.manager.RServeManager;
import org.analysis.rserve.manager.SSSLRserveManager;
import org.apache.commons.io.input.ReaderInputStream;
import org.spring.security.model.SecurityUtil;
import org.strasa.middleware.filesystem.manager.UserFileManager;
import org.strasa.middleware.manager.BrowseStudyManagerImpl;
import org.strasa.middleware.manager.StudyDataColumnManagerImpl;
import org.strasa.middleware.manager.StudyDataSetManagerImpl;
import org.strasa.middleware.manager.StudyManagerImpl;
import org.strasa.middleware.model.Study;
import org.strasa.middleware.model.StudyDataColumn;
import org.strasa.middleware.model.StudyDataSet;
import org.strasa.web.analysis.view.model.SSSLAnalysisModel;
import org.strasa.web.utilities.AnalysisUtils;
import org.strasa.web.utilities.FileUtilities;
import org.zkoss.bind.BindContext;
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.event.UploadEvent;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Columns;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Div;
import org.zkoss.zul.Doublespinner;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Groupbox;
import org.zkoss.zul.Image;
import org.zkoss.zul.Include;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabpanel;
import org.zkoss.zul.Tabpanels;
import org.zkoss.zul.Tabs;
import org.zkoss.zul.Textbox;

import au.com.bytecode.opencsv.CSVReader;

public class Specifications {

	private Component component;
	// select data component;
	private Div SSSLSpecificationsWindow;
	private Combobox studiesCombobox;
	private Combobox dataSetCombobox;
	private Label lblMsgUpload;
	private Button selectDataBtn;
	private Button uploadCSVBtn;
	private Button resetBtn;

	// data preview component;
	private Groupbox grpVariableData;
	private Div dataGridDiv;

	// Tab panel components;
	private Tabbox tabBox;
	private Tabs tabs;
	private Tab modelSpecificationsTab;
	private Tab otherOptionsTab;
	private Tab graphOptionsTab;
	private Tabpanels tabpanels;
	private Tabpanel modelSpecificationsTP;
	private Tabpanel otherOptionsTP;
	private Tabpanel graphOptionsTP;

	// modelSpecificationsTabpanel;
	private Combobox lstTypeOfEnvCBB;
	private Combobox lstTypeOfDesignCBB;
	private Include includeVariableLst;
	private Listbox numericLB;
	private Image chooseResponseBtn;
	private Image removeResponseBtn;
	private Listbox responseLB;
	private Image toNumericBtn;
	private Image toFactorBtn;
	private Listbox factorLB;
	private Row genotypeRow;
	private Image addGenotypeBtn;
	private Textbox genotypeTB;
	private Row envRow;
	private Image addEnvBtn;
	private Textbox envTB;
	private Row blockRow;
	private Image addBlockBtn;
	private Textbox blockTB;
	private Row replicateRow;
	private Image addReplicateBtn;
	private Textbox replicateTB;
	private Row rowRow;
	private Image addRowBtn;
	private Textbox rowTB;
	private Row columnRow;
	private Image addColumnBtn;
	private Textbox columnTB;

	// otherOptionTabpanel;
	private Include includeOtherOptions;
	private Checkbox descriptiveStatCB;
	private Checkbox varComponentCB;
	private Checkbox compareWithControlCB;
	private Combobox controlCBB;
	private Div specifiedContrastOnGenotypeDiv;
	private Label fileNameOfContrastOnGenotypeLb;
	private Button contrastFromFileOnGenotypeBtn;
	private Button contrastByManuallyOnGenotypeBtn;
	private Button contrastResetOnGenotypeBtn;
	private Div contrastByManuallyOnGenotypeDiv;
	private Doublespinner numberOfContrastOnGenotypeDS;
	private Div contrastGridOnGenotypeDiv;
	private Div specifiedContrastOnEnvDiv;
	private Label fileNameOfContrastOnEnvLb;
	private Button contrastFromFileOnEnvBtn;
	private Button contrastByManuallyOnEnvBtn;
	private Button contrastResetOnEnvBtn;
	private Div contrastByManuallyOnEnvDiv;
	private Doublespinner numberOfContrastOnEnvDS;
	private Div contrastGridOnEnvDiv;
	private Div genotypeByEnvDiv;
	private Checkbox finlayWilkinsonModelCB;
	private Checkbox shuklaModelCB;
	private Checkbox ammiModelCB;
	private Checkbox ggeModelCB;

	// graphOptionTabpanel;
	private Include includeGraphOptions;
	private Div singleEnvOnGraphDiv;
	private Checkbox boxplotSingleEnvCB;
	private Checkbox histogramSingleEnvCB;
	private Checkbox diagnosticplotSingleEnvCB;
	private Div acrossEnvOnGraphDiv;
	private Checkbox boxplotAcrossEnvCB;
	private Checkbox histogramAcrossEnvCB;
	private Checkbox diagnosticplotAcrossEnvCB;
	private Div multiplicativeModelOnGraphDiv;
	private Checkbox responsePlotCB;
	private Checkbox adaptationMapCB;
	private Checkbox ammiBiplotCB;
	private Checkbox ammiBiplotPC1VsPC2CB;
	private Checkbox ammiBiplotPC1VsPC3CB;
	private Checkbox ammiBiplotPC2VsPC3CB;
	private Checkbox ggeBiplotSymmetricViewCB;
	private Checkbox ggeBiplotEnvironmentViewCB;
	private Checkbox ggeBiplotGenotypeViewCB;

	// run button
	private Button runBtn;

	private RServeManager rServeManager;
	private SSSLRserveManager ssslRServeManager;
	private StudyManagerImpl studyManagerImpl;
	private StudyDataSetManagerImpl studyDataSetManagerImpl;
	private BrowseStudyManagerImpl browseStudyManagerImpl;
	private UserFileManager userFileManager;
	private Study selectedStudy;
	private List<Study> lstStudy;
	private StudyDataSet selectedStudyDataSet;
	private List<StudyDataSet> lstStudyDataSet;
	private String dataFileName;
	private boolean isVariableDataVisible;
	private List<String> lstTypeOfDesign;
	private List<String> lstTypeOfEnv;
	private SSSLAnalysisModel ssslAnalysisModel;
	private List<String> lstVarNames;
	private String resultRServe;
	private List<String> columnList = new ArrayList<String>(); // column list from raw data
	private List<String[]> dataList = new ArrayList<String[]>(); // raw data from selected data
	private List<String> contrastColumnList = new ArrayList<String>();
	private List<String[]> contrastDataList = new ArrayList<String[]>();
	private int pageSize = 10;
	private int activePage = 0;
	private boolean isDataReUploaded = false;
	private boolean isContrastDataReUploaded = false;
	private boolean gridReUploaded = false;
	private boolean contrastGridReUploaded = false;
	private boolean isNewDataSet;
	private boolean isUpdateMode = false;
	private File tempFile;
	private File uploadedFile;
	private String fileName;
	private File tempContrastFile;
	private File uploadedContrastFile;
	private String contrastFileNameOnGenotype;
	private String contrastFileNameOnEnv;
	
	private List<String> lstVarInfo;
	private int fileFormat = 1;
	private String separator="NULL";

	@AfterCompose
	public void afterCompose(
			@ContextParam(ContextType.COMPONENT) Component component,
			@ContextParam(ContextType.VIEW) Component view) {
		Selectors.wireComponents(component, this, false);

		ssslAnalysisModel = new SSSLAnalysisModel();
		studyManagerImpl = new StudyManagerImpl();
		studyDataSetManagerImpl = new StudyDataSetManagerImpl();
		userFileManager = new UserFileManager();

		lstStudy = studyManagerImpl.getStudiesByUserID(SecurityUtil.getDbUser()
				.getId());

		// wire all the component
		this.component = component;
		this.SSSLSpecificationsWindow = (Div) component
				.getFellow("SSSLSpecificationsWindow");
		this.studiesCombobox = (Combobox) component
				.getFellow("studiesCombobox");
		this.dataSetCombobox = (Combobox) component
				.getFellow("dataSetCombobox");
		this.lblMsgUpload = (Label) component.getFellow("lblMsgUpload");
		this.selectDataBtn = (Button) component.getFellow("selectDataBtn");
		this.uploadCSVBtn = (Button) component.getFellow("uploadCSVBtn");
		this.resetBtn = (Button) component.getFellow("resetBtn");
		this.grpVariableData = (Groupbox) component
				.getFellow("grpVariableData");
		this.dataGridDiv = (Div) component.getFellow("dataGridDiv");
		this.tabBox = (Tabbox) component.getFellow("tabBox");
		this.tabs = (Tabs) component.getFellow("tabs");
		this.modelSpecificationsTab = (Tab) component
				.getFellow("modelSpecificationsTab");
		this.otherOptionsTab = (Tab) component.getFellow("otherOptionsTab");
		this.graphOptionsTab = (Tab) component.getFellow("graphOptionsTab");
		this.tabpanels = (Tabpanels) component.getFellow("tabpanels");
		this.modelSpecificationsTP = (Tabpanel) component
				.getFellow("modelSpecificationsTP");
		this.otherOptionsTP = (Tabpanel) component.getFellow("otherOptionsTP");
		this.graphOptionsTP = (Tabpanel) component.getFellow("graphOptionsTP");
		this.lstTypeOfEnvCBB = (Combobox) component
				.getFellow("lstTypeOfEnvCBB");
		this.lstTypeOfDesignCBB = (Combobox) component
				.getFellow("lstTypeOfDesignCBB");
		this.includeVariableLst = (Include) component
				.getFellow("includeVariableLst");
		this.numericLB = (Listbox) this.includeVariableLst
				.getFellow("numericLB");
		this.chooseResponseBtn = (Image) this.includeVariableLst
				.getFellow("chooseResponseBtn");
		this.removeResponseBtn = (Image) this.includeVariableLst
				.getFellow("removeResponseBtn");
		this.responseLB = (Listbox) this.includeVariableLst
				.getFellow("responseLB");
		this.toNumericBtn = (Image) this.includeVariableLst
				.getFellow("toNumericBtn");
		this.toFactorBtn = (Image) this.includeVariableLst
				.getFellow("toFactorBtn");
		this.factorLB = (Listbox) this.includeVariableLst.getFellow("factorLB");
		this.genotypeRow = (Row) this.includeVariableLst
				.getFellow("genotypeRow");
		this.addGenotypeBtn = (Image) this.includeVariableLst
				.getFellow("addGenotypeBtn");
		this.genotypeTB = (Textbox) this.includeVariableLst
				.getFellow("genotypeTB");
		this.envRow = (Row) this.includeVariableLst.getFellow("envRow");
		this.addEnvBtn = (Image) this.includeVariableLst.getFellow("addEnvBtn");
		this.envTB = (Textbox) this.includeVariableLst.getFellow("envTB");
		this.blockRow = (Row) this.includeVariableLst.getFellow("blockRow");
		this.addBlockBtn = (Image) this.includeVariableLst
				.getFellow("addBlockBtn");
		this.blockTB = (Textbox) this.includeVariableLst.getFellow("blockTB");
		this.replicateRow = (Row) this.includeVariableLst
				.getFellow("replicateRow");
		this.addReplicateBtn = (Image) this.includeVariableLst
				.getFellow("addReplicateBtn");
		this.replicateTB = (Textbox) this.includeVariableLst
				.getFellow("replicateTB");
		this.rowRow = (Row) this.includeVariableLst.getFellow("rowRow");
		this.addRowBtn = (Image) this.includeVariableLst.getFellow("addRowBtn");
		this.rowTB = (Textbox) this.includeVariableLst.getFellow("rowTB");
		this.columnRow = (Row) this.includeVariableLst.getFellow("columnRow");
		this.addColumnBtn = (Image) this.includeVariableLst
				.getFellow("addColumnBtn");
		this.columnTB = (Textbox) this.includeVariableLst.getFellow("columnTB");
		this.includeOtherOptions = (Include) component
				.getFellow("includeOtherOptions");
		this.descriptiveStatCB = (Checkbox) this.includeOtherOptions
				.getFellow("descriptiveStatCB");
		this.varComponentCB = (Checkbox) this.includeOtherOptions
				.getFellow("varComponentCB");
		this.compareWithControlCB = (Checkbox) this.includeOtherOptions
				.getFellow("compareWithControlCB");
		this.controlCBB = (Combobox) this.includeOtherOptions
				.getFellow("controlCBB");
		this.specifiedContrastOnGenotypeDiv = (Div) includeOtherOptions
				.getFellow("specifiedContrastOnGenotypeDiv");
		this.fileNameOfContrastOnGenotypeLb = (Label) includeOtherOptions
				.getFellow("fileNameOfContrastOnGenotypeLb");
		this.contrastFromFileOnGenotypeBtn = (Button) includeOtherOptions
				.getFellow("contrastFromFileOnGenotypeBtn");
		this.contrastByManuallyOnGenotypeBtn = (Button) includeOtherOptions
				.getFellow("contrastByManuallyOnGenotypeBtn");
		this.contrastResetOnGenotypeBtn = (Button) includeOtherOptions
				.getFellow("contrastResetOnGenotypeBtn");
		this.contrastByManuallyOnGenotypeDiv = (Div) includeOtherOptions
				.getFellow("contrastByManuallyOnGenotypeDiv");
		this.numberOfContrastOnGenotypeDS = (Doublespinner) includeOtherOptions
				.getFellow("numberOfContrastOnGenotypeDS");
		this.contrastGridOnGenotypeDiv = (Div) includeOtherOptions
				.getFellow("contrastGridOnGenotypeDiv");
		this.specifiedContrastOnEnvDiv = (Div) includeOtherOptions
				.getFellow("specifiedContrastOnEnvDiv");
		this.fileNameOfContrastOnEnvLb = (Label) includeOtherOptions
				.getFellow("fileNameOfContrastOnEnvLb");
		this.contrastFromFileOnEnvBtn = (Button) includeOtherOptions
				.getFellow("contrastFromFileOnEnvBtn");
		this.contrastResetOnEnvBtn = (Button) includeOtherOptions
				.getFellow("contrastResetOnEnvBtn");
		this.contrastByManuallyOnEnvDiv = (Div) includeOtherOptions
				.getFellow("contrastByManuallyOnEnvDiv");
		this.numberOfContrastOnEnvDS = (Doublespinner) includeOtherOptions
				.getFellow("numberOfContrastOnEnvDS");
		this.contrastGridOnEnvDiv = (Div) includeOtherOptions
				.getFellow("contrastGridOnEnvDiv");
		this.genotypeByEnvDiv = (Div) includeOtherOptions
				.getFellow("genotypeByEnvDiv");
		this.finlayWilkinsonModelCB = (Checkbox) includeOtherOptions
				.getFellow("finlayWilkinsonModelCB");
		this.shuklaModelCB = (Checkbox) includeOtherOptions
				.getFellow("shuklaModelCB");
		this.ammiModelCB = (Checkbox) includeOtherOptions
				.getFellow("ammiModelCB");
		this.ggeModelCB = (Checkbox) includeOtherOptions
				.getFellow("ggeModelCB");
		this.includeGraphOptions = (Include) component
				.getFellow("includeGraphOptions");
		this.singleEnvOnGraphDiv = (Div) includeGraphOptions
				.getFellow("singleEnvOnGraphDiv");
		this.boxplotSingleEnvCB = (Checkbox) includeGraphOptions
				.getFellow("boxplotSingleEnvCB");
		this.histogramSingleEnvCB = (Checkbox) includeGraphOptions
				.getFellow("histogramSingleEnvCB");
		this.diagnosticplotSingleEnvCB = (Checkbox) includeGraphOptions
				.getFellow("diagnosticplotSingleEnvCB");
		this.acrossEnvOnGraphDiv = (Div) includeGraphOptions
				.getFellow("acrossEnvOnGraphDiv");
		this.boxplotAcrossEnvCB = (Checkbox) includeGraphOptions
				.getFellow("boxplotAcrossEnvCB");
		this.histogramAcrossEnvCB = (Checkbox) includeGraphOptions
				.getFellow("histogramAcrossEnvCB");
		this.diagnosticplotAcrossEnvCB = (Checkbox) includeGraphOptions
				.getFellow("diagnosticplotAcrossEnvCB");
		this.multiplicativeModelOnGraphDiv = (Div) includeGraphOptions
				.getFellow("multiplicativeModelOnGraphDiv");
		this.ammiBiplotCB = (Checkbox) includeGraphOptions
				.getFellow("ammiBiplotCB");
		this.ammiBiplotPC1VsPC2CB = (Checkbox) includeGraphOptions
				.getFellow("ammiBiplotPC1VsPC2CB");
		this.ammiBiplotPC1VsPC3CB = (Checkbox) includeGraphOptions
				.getFellow("ammiBiplotPC1VsPC3CB");
		this.ammiBiplotPC2VsPC3CB = (Checkbox) includeGraphOptions
				.getFellow("ammiBiplotPC2VsPC3CB");
		this.ggeBiplotSymmetricViewCB = (Checkbox) includeGraphOptions
				.getFellow("ggeBiplotSymmetricViewCB");
		this.ggeBiplotEnvironmentViewCB = (Checkbox) includeGraphOptions
				.getFellow("ggeBiplotEnvironmentViewCB");
		this.ggeBiplotGenotypeViewCB = (Checkbox) includeGraphOptions
				.getFellow("ggeBiplotGenotypeViewCB");
		this.runBtn = (Button) component.getFellow("runBtn");

	}

	@NotifyChange("*")
	@Command("updateDataSetList")
	public void updateDataSetList() {
		dataSetCombobox.setSelectedItem(null);
		dataSetCombobox.setVisible(false);

		if (!columnList.isEmpty()) {
			columnList.clear();
			dataList.clear();
			refreshCsv();
		}

		List<StudyDataSet> dataSet = studyDataSetManagerImpl
				.getDataSetsByStudyId(selectedStudy.getId());

		if (!dataSet.isEmpty()) {
			dataSetCombobox.setVisible(true);
			setLstStudyDataSet(dataSet);
			BindUtils.postNotifyChange(null, null, this, "*");
		} else {
			Messagebox.show("Please choose a different study",
					"Study has no data", Messagebox.OK, Messagebox.ERROR);
		}

	}

	@NotifyChange("*")
	@Command("displaySelectedDataSet")
	public void displaySelectedDataSet(
			@ContextParam(ContextType.BIND_CONTEXT) BindContext bindContext,
			@ContextParam(ContextType.VIEW) Component view) {
		selectDataBtn.setVisible(false);
		studiesCombobox.setVisible(true);
		resetBtn.setVisible(true);
		uploadCSVBtn.setVisible(false);

		browseStudyManagerImpl = new BrowseStudyManagerImpl();

		List<HashMap<String, String>> toreturn = browseStudyManagerImpl
				.getStudyData(selectedStudy.getId(),
						selectedStudyDataSet.getDatatype(),
						selectedStudyDataSet.getId());
		// System.out.println("Size:" + toreturn.size());
		List<StudyDataColumn> columns = new StudyDataColumnManagerImpl()
				.getStudyDataColumnByStudyId(selectedStudy.getId(),
						selectedStudyDataSet.getDatatype(),
						selectedStudyDataSet.getId());

		for (StudyDataColumn d : columns) {
			columnList.add(d.getColumnheader());
			// System.out.print(d.getColumnheader() + "\t");
		}
		// System.out.println("\n ");
		for (HashMap<String, String> rec : toreturn) {
			ArrayList<String> newRow = new ArrayList<String>();
			for (StudyDataColumn d : columns) {
				String value = rec.get(d.getColumnheader());
				newRow.add(value);
				// System.out.print("on " + d.getColumnheader() + " value is " +
				// value + "\t");
			}
			// System.out.println("\n ");
			dataList.add(newRow.toArray(new String[newRow.size()]));
		}

		fileName = selectedStudy.getName() + "_"
				+ selectedStudyDataSet.getTitle().replaceAll(" ", "");
		File BASE_FOLDER = new File(UserFileManager.buildUserPath(
				selectedStudy.getUserid(), selectedStudy.getId()));
		if (!BASE_FOLDER.exists())
			BASE_FOLDER.mkdirs();
		String createPath = BASE_FOLDER.getAbsolutePath() + File.separator
				+ fileName + "(dataset).csv";

		System.out.println("created path " + createPath);
		uploadedFile = FileUtilities.createFileFromDatabase(columnList,
				dataList, createPath);

		if (uploadedFile == null)
			return;

		Map<String, Object> args = new HashMap<String, Object>();
		args.put("filePath", uploadedFile.getAbsolutePath());
		BindUtils.postGlobalCommand(null, null,
				"setSSSLAnalysisModelListvariables", args);

		isVariableDataVisible = true;
		activePage = 0;
		// dataFileName = fileName;
		reloadCsvGrid();
	}

	@NotifyChange("*")
	@Command("selectFromDatabase")
	public void selectFromDatabase(
			@ContextParam(ContextType.BIND_CONTEXT) BindContext bindContext,
			@ContextParam(ContextType.VIEW) Component view) {
		selectDataBtn.setVisible(false);
		studiesCombobox.setVisible(true);
		resetBtn.setVisible(true);
		uploadCSVBtn.setVisible(false);
	}

	@NotifyChange("*")
	@Command("uploadCSV")
	public void uploadCSV(
			@ContextParam(ContextType.BIND_CONTEXT) BindContext bindContext,
			@ContextParam(ContextType.VIEW) Component view) {
		UploadEvent event = (UploadEvent) bindContext.getTriggerEvent();

		fileName = event.getMedia().getName();

		if (!fileName.endsWith(".csv")) {
			Messagebox.show("Error: File must be a text-based csv format",
					"Upload Error", Messagebox.OK, Messagebox.ERROR);
			return;
		}

		if (tempFile == null)
			try {
				tempFile = File.createTempFile(fileName, ".tmp");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		InputStream in = event.getMedia().isBinary() ? event.getMedia()
				.getStreamData() : new ReaderInputStream(event.getMedia()
				.getReaderData());
		FileUtilities.uploadFile(tempFile.getAbsolutePath(), in);
		if (tempFile == null)
			return;
		BindUtils.postNotifyChange(null, null, this, "*");
	
//		uploadedFile = FileUtilities.getFileFromUpload(bindContext, view);
		uploadedFile = tempFile;
		String filePath = userFileManager.uploadFileForAnalysis(fileName,
				uploadedFile);

		isVariableDataVisible = true;
		dataFileName = fileName;

		Map<String, Object> args = new HashMap<String, Object>();
		args.put("filePath", filePath);
		BindUtils.postGlobalCommand(null, null,
				"setSSSLAnalysisModelListvariables", args);

//		isVariableDataVisible = true;
//		dataFileName = fileName;
		refreshCsv();
		if (this.isUpdateMode)
			isNewDataSet = true;

		resetBtn.setVisible(true);
		uploadCSVBtn.setVisible(false);
		selectDataBtn.setVisible(false);
	}

	@Command("uploadContrastFromFile")
	@NotifyChange("*")
	public void uploadContrastFromFile(
			@ContextParam(ContextType.BIND_CONTEXT) BindContext bindContext,
			@ContextParam(ContextType.VIEW) Component view) {

		UploadEvent event = (UploadEvent) bindContext.getTriggerEvent();

		// contrastFileName = event.getMedia().getName();
		// System.out.println("contrast file name " + contrastFileName);
		// if (!contrastFileName.endsWith(".csv")) {
		// Messagebox.show("Error: File must be a text-based csv format",
		// "Upload Error", Messagebox.OK, Messagebox.ERROR);
		// return;
		// }
		//
		// if (tempContrastFile == null) {
		// try {
		// tempContrastFile = File
		// .createTempFile(contrastFileName, ".tmp");
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }

		InputStream in = event.getMedia().isBinary() ? event.getMedia()
				.getStreamData() : new ReaderInputStream(event.getMedia()
				.getReaderData());
		FileUtilities.uploadFile(tempContrastFile.getAbsolutePath(), in); // what
																			// is
																			// the
																			// code
																			// purpose?
		BindUtils.postNotifyChange(null, null, this, "*");

		uploadedContrastFile = FileUtilities.getFileFromUpload(bindContext,
				view);
		// String filePath = userFileManager.uploadFileForAnalysis(
		// contrastFileName, uploadedContrastFile);

		if (tempContrastFile == null)
			return;

		Map<String, Object> args = new HashMap<String, Object>();
		// args.put("contrastFilePath", filePath);
		BindUtils.postGlobalCommand(null, null,
				"setSSSLAnalysisModelListvariables", args);

		refreshContrastCSV();

		// fileNameOfContrastLb.setVisible(true);
		// contrastFromFileBtn.setVisible(false);
		// contrastByManuallyBtn.setVisible(false);
		// contrastResetBtn.setVisible(true);
		// contrastByManuallyDiv.setVisible(false);

	}

	@NotifyChange("*")
	@Command("updateVariableList")
	public void updateVariableList(
			@BindingParam("selectedIndex") Integer selectedIndex) {
		String temp = lstTypeOfDesign.get(selectedIndex);
		if (temp.equals(lstTypeOfDesign.get(0))) {
			blockRow.setVisible(true);
			replicateRow.setVisible(false);
			rowRow.setVisible(false);
			columnRow.setVisible(false);
		} else if (temp.equals(lstTypeOfDesign.get(1))) {
			blockRow.setVisible(true);
			replicateRow.setVisible(false);
			rowRow.setVisible(false);
			columnRow.setVisible(false);
		} else if (temp.equals(lstTypeOfDesign.get(2))) {
			blockRow.setVisible(false);
			replicateRow.setVisible(false);
			rowRow.setVisible(true);
			columnRow.setVisible(true);
		} else if (temp.equals(lstTypeOfDesign.get(3))) {
			blockRow.setVisible(true);
			replicateRow.setVisible(true);
			rowRow.setVisible(false);
			columnRow.setVisible(false);
		} else if (temp.equals(lstTypeOfDesign.get(4))) {
			blockRow.setVisible(true);
			replicateRow.setVisible(false);
			rowRow.setVisible(true);
			columnRow.setVisible(true);
		} else if (temp.equals(lstTypeOfDesign.get(5))) {
			blockRow.setVisible(true);
			replicateRow.setVisible(true);
			rowRow.setVisible(false);
			columnRow.setVisible(false);
		} else if (temp.equals(lstTypeOfDesign.get(6))) {
			blockRow.setVisible(false);
			replicateRow.setVisible(true);
			rowRow.setVisible(true);
			columnRow.setVisible(true);
		}
	}

	@NotifyChange("*")
	@Command("updateEnvVariableList")
	public void updateEnvVariableList(
			@BindingParam("selectedIndex") Integer selectedIndex) {
		String temp = lstTypeOfEnv.get(selectedIndex);
		System.out.println("the selectedIndex is" + selectedIndex + ", name is " + temp);
		switch (selectedIndex) {
		case 0:
			this.specifiedContrastOnEnvDiv.setVisible(true);
			this.genotypeByEnvDiv.setVisible(true);
			this.acrossEnvOnGraphDiv.setVisible(true);
			this.multiplicativeModelOnGraphDiv.setVisible(true);
			break;	
		case 1:
			this.specifiedContrastOnEnvDiv.setVisible(false);
			this.genotypeByEnvDiv.setVisible(false);
			this.acrossEnvOnGraphDiv.setVisible(false);
			this.multiplicativeModelOnGraphDiv.setVisible(false);
			break;
		default:
			this.specifiedContrastOnEnvDiv.setVisible(true);
			this.genotypeByEnvDiv.setVisible(true);
			this.acrossEnvOnGraphDiv.setVisible(true);
			this.multiplicativeModelOnGraphDiv.setVisible(true);
			break;
		}
	}

	@Command
	public void validateSSSLAnalysisInputs() {

	}

	@GlobalCommand
	@NotifyChange("*")
	public void isSpecifiedContrastCBChecked() {
		// if (specifiedContrastCB.isChecked()) {
		// System.out.println(contrastFromFileBtn.getUpload());
		// specifiedContrastDiv.setVisible(false);
		// specifiedContrastDiv.setVisible(true);
		// contrastFromFileBtn.setDisabled(false);
		// contrastByManuallyBtn.setDisabled(false);
		// } else {
		// specifiedContrastDiv.setVisible(false);
		// contrastFromFileBtn.setDisabled(true);
		// contrastByManuallyBtn.setDisabled(true);
		// }
	}

	@GlobalCommand
	@NotifyChange("*")
	public void isCompareWithControlCBChecked() {
		if (compareWithControlCB.isChecked()) {
			controlCBB.setVisible(true);
			controlCBB.setDisabled(false);
		} else {
			controlCBB.setDisabled(true);
		}
	}

	@NotifyChange("*")
	@Command("manuallyInputContrastOnGenotype")
	public void manuallyInputContrastOnGenotype() {
		// fileNameOfContrastLb.setVisible(false);
		// contrastFromFileBtn.setVisible(false);
		// contrastByManuallyBtn.setVisible(false);
		// contrastResetBtn.setVisible(true);
		// contrastByManuallyDiv.setVisible(true);
	}
	
	@NotifyChange("*")
	@Command("manuallyInputContrastOnEnv")
	public void manuallyInputContrastOnEnv()
	{
		
	}

	@NotifyChange("*")
	@Command("resetContrast")
	public void resetContrast() {

		System.out.println("contrastGridReUpload " + contrastGridReUploaded);
		// System.out.println("contrad grid div children is "
		// + contrastGridDiv.getChildren().isEmpty());

		tempContrastFile = null;
		contrastDataList.clear();
		contrastColumnList.clear();
		contrastGridReUploaded = false;

		// if (!contrastGridDiv.getChildren().isEmpty())
		// contrastGridDiv.getFirstChild().detach();
		//
		// fileNameOfContrastLb.setVisible(false);
		// contrastFromFileBtn.setVisible(true);
		// contrastByManuallyBtn.setVisible(true);
		// contrastByManuallyDiv.setVisible(false);
		// contrastResetBtn.setVisible(false);
	}

	@NotifyChange("*")
	@Command("refreshCsv")
	public void refreshCsv() {
		activePage = 0;
		CSVReader reader;
		reloadCsvGrid();

		try {
			reader = new CSVReader(new FileReader(tempFile.getAbsolutePath()));
			List<String[]> rawData = reader.readAll();
			columnList.clear();
			dataList.clear();
			columnList = new ArrayList<String>(Arrays.asList(rawData.get(0)));
			rawData.remove(0);
			dataList = new ArrayList<String[]>(rawData);
			System.out.println(Arrays.toString(dataList.get(0)));
			if (!this.isDataReUploaded)
				System.out.println("gbUploadData.invalidate()");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@NotifyChange("*")
	@Command("refreshContrastCSV")
	public void refreshContrastCSV() {
		CSVReader reader;
		try {
			reader = new CSVReader(new FileReader(
					tempContrastFile.getAbsolutePath()));
			List<String[]> rawData = reader.readAll();
			contrastColumnList.clear();
			contrastDataList.clear();
			contrastColumnList = new ArrayList<String>(Arrays.asList(rawData
					.get(0)));
			rawData.remove(0);
			contrastDataList = new ArrayList<String[]>(rawData);
			System.out.println(Arrays.toString(contrastDataList.get(0)));
			if (!this.isContrastDataReUploaded)
				System.out.println("gbUploadData.invalidate() + on contrast");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		reloadContrastCSVGrid();
	}

	@GlobalCommand("setSSSLAnalysisModelListvariables")
	@NotifyChange("*")
	public void setSSSLAnalysisModelListvariables(
			@BindingParam("filePath") String filepath) {
		// ...
		 ssslAnalysisModel.setDataFileName(filepath.replace("\\", "/"));
		 ssslRServeManager = new SSSLRserveManager();
		 lstVarInfo = ssslRServeManager.getVariableInfo(filepath.replace("//", "/"), fileFormat, separator);
//		 rServeManager = new RServeManager();
		// varInfo = rServeManager.getVariableInfo(filepath.replace("\\", "/"),
		// fileFormat, separator);
		//
		// setVarNames(AnalysisUtils.getVarNames(varInfo));
		//
		// numericModel= AnalysisUtils.getNumericAsListModel(varInfo);
		// factorModel= AnalysisUtils.getFactorsAsListModel(varInfo);
		// responseModel = new ListModelList<String>();
		//
		// numericLb.setModel(numericModel);
		// factorLb.setModel(factorModel);
		// responseLb.setModel(responseModel);
	}

	// @NotifyChange("*")
	// @Command("updateEnvOptions")
	// public void updateEnvOptions(@BindingParam("selected") Boolean isChecked,
	// @BindingParam("label") String label) {
	// System.out.println(label + " " + isChecked);
	// if (label.equals("Fixed")) {
	// if (isChecked) {
	// envFixedCB.setChecked(true);
	// envRandomCB.setChecked(false);
	// } else {
	// envFixedCB.setChecked(false);
	// envRandomCB.setChecked(true);
	// }
	// } else {
	// if (isChecked) {
	// envFixedCB.setChecked(false);
	// envRandomCB.setChecked(true);
	// } else {
	// envFixedCB.setChecked(true);
	// envRandomCB.setChecked(false);
	// }
	// }
	// }

	@NotifyChange("*")
	@Command("updateContrastGridManually")
	public void updataContrastGridManually() {
		if (!contrastColumnList.isEmpty())
			contrastColumnList.clear();
		if (!contrastDataList.isEmpty())
			contrastDataList.clear();

	}

	@NotifyChange("*")
	@Command("addResponse")
	public void addResponse() {

	}

	@NotifyChange("*")
	@Command("removeResponse")
	public void removeResponse() {

	}

	@NotifyChange("*")
	@Command("toNumeric")
	public void toNumeric() {

	}

	@NotifyChange("*")
	@Command("toFactor")
	public void toFactor() {

	}

	@NotifyChange("*")
	@Command("chooseVariable")
	public void chooseVariable(@BindingParam("varTextBox") Textbox varTextBox,
			@BindingParam("imgButton") Image imgButton) {

	}

	public void reloadCsvGrid() {
		if (gridReUploaded) {
			gridReUploaded = false;
			return;
		}
		if (!dataGridDiv.getChildren().isEmpty())
			dataGridDiv.getFirstChild().detach();
		Include incCSVData = new Include();
		incCSVData.setSrc("/user/updatestudy/csvdata.zul");
		incCSVData.setParent(dataGridDiv);
		gridReUploaded = true;
	}

	public void reloadContrastCSVGrid() {
		if (contrastGridReUploaded) {
			contrastGridReUploaded = false;
			return;
		}
		// if (!contrastGridDiv.getChildren().isEmpty())
		// contrastGridDiv.getFirstChild().detach();
		Include incContrastCSVData = new Include();
		incContrastCSVData.setSrc("/user/analysis/sssl/contrast.zul");
		// incContrastCSVData.setParent(contrastGridDiv);
		contrastGridReUploaded = true;
	}

	public ArrayList<ArrayList<String>> getCsvData() {
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		if (dataList.isEmpty())
			return result;
		for (int i = activePage * pageSize; i < activePage * pageSize
				+ pageSize
				&& i < dataList.size(); i++) {
			ArrayList<String> row = new ArrayList<String>();
			row.addAll(Arrays.asList(dataList.get(i)));
			result.add(row);
			row.add(0, "  ");
			System.out.println("on row " + i + " data is "
					+ Arrays.toString(dataList.get(i)) + "ROW: " + row.get(0));
		}
		return result;
	}

	public ArrayList<ArrayList<String>> getContrastCSVData() {
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		if (contrastDataList.isEmpty())
			return result;
		for (int i = 0; i < contrastDataList.size(); i++) {
			ArrayList<String> row = new ArrayList<String>();
			row.addAll(Arrays.asList(contrastDataList.get(i)));
			result.add(row);
			row.add(0, "  "); // what is this purpose?
			System.out.println("On contrast row " + i + " , data is "
					+ Arrays.toString(contrastDataList.get(i)) + " ROW: "
					+ row.get(0));
		}
		return result;
	}

	public int getTotalSize() {
		System.out.println("dataList size is " + dataList.size());
		return dataList.size();
	}

	public Study getSelectedStudy() {
		return selectedStudy;
	}

	public void setSelectedStudy(Study selectedStudy) {
		this.selectedStudy = selectedStudy;
	}

	public List<Study> getLstStudy() {
		return lstStudy;
	}

	public void setLstStudy(List<Study> lstStudy) {
		this.lstStudy = lstStudy;
	}

	public StudyDataSet getSelectedStudyDataSet() {
		return selectedStudyDataSet;
	}

	public void setSelectedStudyDataSet(StudyDataSet selectedStudyDataSet) {
		this.selectedStudyDataSet = selectedStudyDataSet;
	}

	public List<StudyDataSet> getLstStudyDataSet() {
		return lstStudyDataSet;
	}

	public void setLstStudyDataSet(List<StudyDataSet> lstStudyDataSet) {
		this.lstStudyDataSet = lstStudyDataSet;
	}

	public String getDataFileName() {
		return dataFileName;
	}

	public void setDataFileName(String dataFileName) {
		this.dataFileName = dataFileName;
	}

	public boolean isVariableDataVisible() {
		return isVariableDataVisible;
	}

	public void setVariableDataVisible(boolean isVariableDataVisible) {
		this.isVariableDataVisible = isVariableDataVisible;
	}

	// This Type of Design for study should be retrieve from database
	// It should be refactor
	public List<String> getLstTypeOfDesign() {
		if (lstTypeOfDesign == null)
			lstTypeOfDesign = new ArrayList<String>();
		lstTypeOfDesign.clear();
		lstTypeOfDesign.add("Randomized Complete Block(RCB)");
		lstTypeOfDesign.add("Augmented RCB");
		lstTypeOfDesign.add("Augmented Latin Square");
		lstTypeOfDesign.add("Alpha-Lattice");
		lstTypeOfDesign.add("Row-Column");
		lstTypeOfDesign.add("Latinized Alpha-Lattice");
		lstTypeOfDesign.add("Latinized Row-Column");
		return lstTypeOfDesign;
	}

	public List<String> getLstTypeOfEnv() {
		if (lstTypeOfEnv == null)
			lstTypeOfEnv = new ArrayList<String>();
		lstTypeOfEnv.clear();
		lstTypeOfEnv.add("Multi-Environment");
		lstTypeOfEnv.add("Single Environment");
		return lstTypeOfEnv;
	}

	public void setLstTypeOfDesign(List<String> lstTypeOfDesign) {
		this.lstTypeOfDesign = lstTypeOfDesign;
	}

	public SSSLAnalysisModel getSsslAnalysisModel() {
		return ssslAnalysisModel;
	}

	public void setSsslAnalysisModel(SSSLAnalysisModel ssslAnalysisModel) {
		this.ssslAnalysisModel = ssslAnalysisModel;
	}

	public List<String> getLstVarNames() {
		return lstVarNames;
	}

	public void setLstVarNames(List<String> lstVarNames) {
		this.lstVarNames = lstVarNames;
	}

	public String getResultRServe() {
		return resultRServe;
	}

	public void setResultRServe(String resultRServe) {
		this.resultRServe = resultRServe;
	}

	public List<String> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<String> columnList) {
		this.columnList = columnList;
	}

	public List<String> getContrastColumnList() {
		return contrastColumnList;
	}

	public void setContrastColumnList(List<String> contrastColumnList) {
		this.contrastColumnList = contrastColumnList;
	}

	public List<String[]> getDataList() {
		System.out.println("DaALIST GEt");
		reloadCsvGrid();
		if (true)
			return dataList;
		ArrayList<String[]> pageData = new ArrayList<String[]>();
		for (int i = activePage * pageSize; i < activePage * pageSize
				+ pageSize; i++) {
			pageData.add(dataList.get(i));
			System.out.println(Arrays.toString(dataList.get(i)));
		}

		return pageData;
	}

	public void setDataList(List<String[]> dataList) {
		this.dataList = dataList;
	}

	public List<List> getContrastDataList() {
		// public List<String[]> getContrastDataList() {
		System.out.println("Contrast Data Get");
		// reloadContrastCSVGrid();
		// if (true)
		// return contrastDataList;
		/*
		 * ArrayList<String[]> pageData = new ArrayList<String[]>(); for (int i
		 * = activePage * pageSize; i < activePage * pageSize + pageSize; i++) {
		 * pageData.add(dataList.get(i));
		 * System.out.println(Arrays.toString(dataList.get(i))); }
		 * 
		 * return pageData;
		 */
		ArrayList<List> outer = new ArrayList<List>();
		for (int i = 0; i < contrastDataList.size(); i++) {
			String[] temp = contrastDataList.get(i);
			// System.out.println("Row " + i + " on contrast data list : " +
			// temp);
			ArrayList<String> inner = new ArrayList<String>();
			for (int j = 0; j < temp.length; j++) {
				// System.out.println(temp[j]);
				inner.add(temp[j]);
			}
			outer.add(inner);
		}
		// System.out.println("Outer size " + outer.size());
		// return contrastDataList;
		return outer;
	}

	public void setContrastDataList(List<String[]> contrastDataList) {
		this.contrastDataList = contrastDataList;
	}

	public int getPageSize() {
		return pageSize;
	}

	@NotifyChange("*")
	public void setPageSize(int pageSize) {
		System.out.println("pagesize " + pageSize);
		this.pageSize = pageSize;
	}

	@NotifyChange("*")
	public int getActivePage() {

		return activePage;
	}

	@NotifyChange("*")
	public void setActivePage(int activePage) {
		System.out.println("activePage" + activePage);
		reloadCsvGrid();
		this.activePage = activePage;
	}

	public boolean isDataReUploaded() {
		return isDataReUploaded;
	}

	public void setDataReUploaded(boolean isDataReUploaded) {
		this.isDataReUploaded = isDataReUploaded;
	}

	public boolean isGridReUploaded() {
		return gridReUploaded;
	}

	public void setGridReUploaded(boolean gridReUploaded) {
		this.gridReUploaded = gridReUploaded;
	}

	public File getTempFile() {
		return tempFile;
	}

	public void setTempFile(File tempFile) {
		this.tempFile = tempFile;
	}

	public File getUploadedFile() {
		return uploadedFile;
	}

	public void setUploadedFile(File uploadedFile) {
		this.uploadedFile = uploadedFile;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContrastFileNameOnGenotype() {
		return contrastFileNameOnGenotype;
	}

	public void setContrastFileNameOnGenotype(String contrastFileNameOnGenotype) {
		this.contrastFileNameOnGenotype = contrastFileNameOnGenotype;
	}

	public String getContrastFileNameOnEnv() {
		return contrastFileNameOnEnv;
	}

	public void setContrastFileNameOnEnv(String contrastFileNameOnEnv) {
		this.contrastFileNameOnEnv = contrastFileNameOnEnv;
	}

}
