package org.strasa.web.analysis.sssl.view.model;

import java.util.List;

import org.strasa.middleware.model.Study;
import org.strasa.middleware.model.StudyDataSet;
import org.zkoss.bind.annotation.Command;

public class Specifications {
	
	private Study selectedStudy;
	private List<Study> lstStudy;
	private StudyDataSet selectedStudyDataSet;
	private List<StudyDataSet> lstStudyDataSet;
	private String dataFileName;
	private boolean isVariableDataVisible;
	
	
	@Command
	public void updateDataSetList()
	{
		
	}
	
	@Command
	public void displaySelectedDataSet()
	{
		
	}
	
	@Command
	public void selectFromDatabase()
	{
		
	}
	
	@Command
	public void uploadCSV()
	{
		
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
	
}
