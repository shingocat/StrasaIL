package org.analysis.rserve.manager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;

public class SSSLRserveManager {
	private RConnection conn;
	private String rootFloder = Executions.getCurrent().getDesktop()
			.getWebApp().getRealPath("/RScript");

	// Sessions.getCurrent().getWebApp()
	// .getDirectory();

	public SSSLRserveManager() {
		try {
			conn = new RConnection();
			System.out.println("SSSL Rserve Manager Start...");
		} catch (RserveException e) {
			e.printStackTrace();
		}
	}

	public List<String> getVariableInfo(String fileName, int fileFormat,
			String separator) {
		String funcGetVarInfo;
		REXP x;
		List<String> lstVarInfo = new ArrayList<String>();
		System.out.println("source(\""+rootFloder + File.separator + "getVarInfo.R\")");
		try {
			conn.eval("source(\""+rootFloder + File.separator + "getVarInfo.R\")");
		} catch (RserveException e) {
			e.printStackTrace();
		}
		if (fileFormat == 2) {
			funcGetVarInfo = "varsAndTypes <- getVarInfo(fileName = \"" + fileName + "\", fileFormat = 2, separator = \"" + separator + "\")";
		} else
		{
			funcGetVarInfo = "varsAndTypes <- getVarInfo(fileName = \"" + fileName + "\", fileFormat = " + fileFormat + ", separator = NULL)"; 
		}
		System.out.println(funcGetVarInfo);
		String [] vars;
		String [] types;
		
		try
		{
			conn.eval(funcGetVarInfo);
			vars = conn.eval("as.vector(varsAndTypes$Variable)").asStrings();
			types = conn.eval("as.vector(varsAndTypes$Type)").asStrings();
			for(int i = 0; i < vars.length; i++)
			{
				lstVarInfo.add(vars[i] + ":" + types[i]);
			}
			for(String s: lstVarInfo)
			{
				System.out.println(s);
			}
			
		}catch(RserveException e)
		{
						e.printStackTrace();
		} catch (REXPMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return lstVarInfo;
	}
}
