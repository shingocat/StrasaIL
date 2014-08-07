package org.strasa.web.analysis.view.model;

public class SSSLAnalysisModel {
	private int design;
	private int envType;
	private String dataFileName;

	public int getDesign() {
		return design;
	}

	public void setDesign(int design) {
		this.design = design;
	} 
	
	public int getEnvType()
	{
		return envType;
	}
	
	public void setEnvType(int envType)
	{
		this.envType = envType;
	}

	public String getDataFileName() {
		return dataFileName;
	}

	public void setDataFileName(String dataFileName) {
		this.dataFileName = dataFileName;
	}
	
	
}
