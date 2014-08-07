package org.strasa.middleware.manager;

import org.analysis.rserve.manager.SSSLRserveManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

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
	
	
	@Test
	public void testGetVariableInfo()
	{
		ssslRserveManager.getVariableInfo("", 1, null);
	}
}
