/**
 *
 * 	Builder: 	Mao Qin
 *	Email:		mqin@ymail.com
 *	Date:		2014 - Jun 24, 2014
 *	Project: 	StrasaWeb
 *  Package: 	org.strasa.middleware.manager
 *	Name:	 BrowseIntrogressionLineManagerImplTest.java
 *	
 *
 */
package org.strasa.middleware.manager;

import java.util.List;



import junit.framework.Assert;

import org.apache.ibatis.session.SqlSession;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.strasa.middleware.factory.ConnectionFactory;
import org.strasa.middleware.factory.MySqlSessionFactory;
import org.strasa.middleware.manager.BrowseIntrogressionLineManagerImpl;
import org.strasa.middleware.mapper.BrowseIntrogressionLineMapper;
import org.strasa.middleware.model.Germplasm;
import org.strasa.middleware.model.Segment;

public class BrowseIntrogressionLineManagerImplTest
{
	private static  BrowseIntrogressionLineManagerImpl browseIntrogressionLineManagerImpl;
//	private static ConnectionFactory connFactory;
	@BeforeClass
	public static void setup()
	{
		browseIntrogressionLineManagerImpl = new BrowseIntrogressionLineManagerImpl();
	}
	
	@AfterClass
	public static void teardown()
	{
		browseIntrogressionLineManagerImpl = null;
	}
	
//	@Test 
//	public void testFindAllIntrogressionLines()
//	{
//		List<IntrogressionLine> introgressionLines = browseIntrogressionLineManagerImpl.findAllIntrogressionLine();
//		Assert.assertNotNull(introgressionLines);
//		for(IntrogressionLine introgressionLine : introgressionLines)
//		{
//			System.out.println(introgressionLine.toString());
//		}
//	}
	
//	@Test
//	public void testFindAllGermplasms()
//	{
//		List<Germplasm> germplasms = browseIntrogressionLineManagerImpl.findAllGermplasms();
//		Assert.assertNotNull(germplasms);
//		for(Germplasm germplasm : germplasms)
//		{
//			System.out.println(germplasm.toString());
//		}
//	}
//	
//	@Test
//	public void testFindAllSegments()
//	{
//		List<Segment> segments = browseIntrogressionLineManagerImpl.findAllSegments();
//		Assert.assertNotNull(segments);
//		for(Segment segment : segments)
//		{
//			System.out.println(segment.toString());
//			System.out.println();
//		}
//	}
//	

}

