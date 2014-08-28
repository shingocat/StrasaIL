package org.strasa.middleware.manager;

import org.analysis.rserve.manager.SSSLRserveManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.strasa.web.analysis.view.model.SSSLAnalysisModel;

public class TestSSSLRserveManager {
	
public static SSSLRserveManager ssslRserveManager = null;
	
	@BeforeClass
	public static void setup()
	{
		ssslRserveManager = new SSSLRserveManager();
	}
	
	@AfterClass
	public static void teardown()
	{
		ssslRserveManager = null;
	}
	
	
//	@Test
//	public void testGetVariableInfo()
//	{
//		ssslRserveManager.getVariableInfo("", 1, null);
//	}
//	
	@Test
	public void testDoMultiEnvAnalysis()
	{
		int index = 4; // demo data index; 1 for Small01.csv, 2 for Small02.csv; 3 for RCB_ME.csv
		
		SSSLAnalysisModel model = new SSSLAnalysisModel();
		
		if(index == 1)
		{
			model.setDataFileName("e:/Sampledata/Small01.csv");
			model.setResponseVars(new String[]{"DFL", "PH"});
			model.setEnvFactor("Season");
			model.setEnvFactorLevels(new String[]{"WS","DS"});
			model.setGenotypeFactor("Gname");
			model.setBlockFactor("Rep");
			model.setGenotypeContrastFile("e:/Sampledata/Small01Contrast.csv");
			model.setRecurrentParent("Gen1");
		}
		else if (index == 2)
		{
			model.setDataFileName("e:/Sampledata/Small02.csv");
			model.setResponseVars(new String[]{"DFL", "PH"});
			model.setEnvFactor("Season");
			model.setEnvFactorLevels(new String[]{"WS","DS"});
			model.setGenotypeFactor("Gname");
			model.setBlockFactor("Rep");
			model.setGenotypeContrastFile("e:/Sampledata/Small02Contrast.csv");
			model.setRecurrentParent("Gen1");
		}
		else if (index == 3) 
		{
			model.setDataFileName("e:/Sampledata/RCB_ME.csv");
			model.setResponseVars(new String[]{"Yield"});
			model.setEnvFactor("Env");
			model.setEnvFactorLevels(new String[]{"E1","E2","E3","E4","E5","E6","E7","E8","E9","E10","E11"});
			model.setGenotypeFactor("Genotype");
			model.setBlockFactor("Block");
			model.setGenotypeContrastFile("e:/Sampledata/RCB_MEContrast.csv");
			model.setRecurrentParent("GEN1");
		}	else if (index == 4)
		{
			model.setDataFileName("e:/Sampledata/Dule_GxE.csv");
			model.setResponseVars(new String[]{"FLOWER","PlantHt","YLD"});
			model.setEnvFactor("Env");
			model.setEnvFactorLevels(new String[]{ "A01WSCM", "A03WS-0", "A03WS-1", "AWS01-D", "UWS02-2", "UWS02-8"});
			model.setGenotypeFactor("Geno");
			model.setBlockFactor("Block");
			model.setGenotypeContrastFile("e:/Sampledata/Dule_GxEContrast.csv");
			model.setRecurrentParent("AUS196");
		}


		model.setResultFolderPath("e:/Sampledata/Output/");
		model.setOutFileName("Multi-Env-Analysis(" + System.currentTimeMillis() + ").txt");
		model.setDesign(0);
		model.setAnalysisEnvType("Multi-Environment");
//		model.setResponseVars(new String[]{"DFL","PH"});
//		model.setResponseVars(new String[]{"Yield"});
//		model.setEnvFactor("Env");
//		model.setEnvFactor("Season");
//		model.setEnvFactorLevels(new String[]{"WS","DS"});
//		model.setEnvFactorLevels(new String[]{"E1","E2","E3","E4","E5","E6","E7","E8","E9","E10","E11"});
//		model.setGenotypeFactor("Genotype");
//		model.setGenotypeFactor("GName");
//		model.setBlockFactor("Block");
		model.setReplicateFactor("Rep");
		model.setRowFactor("RowBlock");
		model.setColumnFactor("ColumnBlock");
		model.setDescriptiveStat(true);
		model.setVarComponent(true);
//		model.setRecurrentParent("GEN1");
		model.setCompareWithRecurrent(true);
//		model.setGenotypeContrastFile("e:/Sampledata/GenotypeContrast.csv");
//		model.setGenotypeContrastFile("e:/Sampledata/ContrastDemo.csv");
//		model.setGenotypeContrastFile("e:/Sampledata/ContrastDemo15.csv");

		model.setEnvContrastFile("e:/Sampledata/EnvContrast.csv");
		model.setFinlayWikinson(true);
		model.setShukla(true);
		model.setAMMI(true);
		model.setGGE(true);
		model.setBoxplotOnAcrossEnv(false);
		model.setBoxplotOnSingleEnv(true);
		model.setHistogramOnAcrossEnv(false);
		model.setHistogramOnSingleEnv(true);
		model.setDiagnosticPlotOnAcrossEnv(false);
		model.setDiagnosticPlotOnSingleEnv(true);
		model.setResponsePlot(true);
		model.setAdaptationMap(true);
		model.setAMMI1Biplot(true);
		model.setAMMIBiplotPC1VsPC2(true);
		model.setAMMIBiplotPC1VsPC3(true);
		model.setAMMIBiplotPC2VsPC3(true);
		model.setGGEBiplotSymmetricView(true);
		model.setGGEBiplotEnvironmentView(true);
		model.setGGEBiplotGenotypeView(true);
		
		ssslRserveManager.doAnalysis(model);
//		ssslRserveManager.doMultiEnvAnalysisOneStage(model);
	}
}
