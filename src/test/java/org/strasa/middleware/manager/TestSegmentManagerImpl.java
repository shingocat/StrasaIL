/**
 *
 * 	Builder: 	Mao Qin
 *	Email:		mqin@ymail.com
 *	Date:		2014 - Jun 28, 2014
 *	Project: 	StrasaWeb
 *  Package: 	org.strasa.middleware.manager
 *	Name:	 TestSegmentManagerImpl.java
 *	
 *
 */
package org.strasa.middleware.manager;

import java.util.HashMap;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.util.Assert;
import org.strasa.middleware.model.Segment;
import org.strasa.middleware.util.ConditionAndValue;
import org.strasa.middleware.util.StringConstants;

public class TestSegmentManagerImpl
{
	public static SegmentManagerImpl segmentManagerImpl = null;
	
	@BeforeClass
	public static void setup()
	{
		segmentManagerImpl = new SegmentManagerImpl();
	}
	
	@AfterClass
	public static void teardown()
	{
		segmentManagerImpl = null;
	}
	
	@Test
	public void testGetAllSegments()
	{
		SegmentManagerImpl segmentManagerImpl = new SegmentManagerImpl();
		List<Segment> segments = segmentManagerImpl.getAllSegments();
		System.out.println(segments.size());
		for(Segment s : segments)
		{
			System.out.println("Segment id " + s.getSegmentId() + ", chromosome " + s.getChromosome() + ", recurrent parent " 
					+ s.getRecurrentParent() + " , donor parent "+ s.getDonorParent() + ", position 1 " + s.getPosition1()
					+ ", position 2 " + s.getPosition2() + ", position 3 " + s.getPosition3() + ", position 4 " + s.getPosition4()
					+ ", physical start " + s.getPhysicalStart() + ", physical end " + s.getPhysicalEnd() + ", estimated length " 
					+ s.getEstimatedLength() + ", minimum length " + s.getMinimumLength() + ", maximum length " +
					s.getMaximumLength() + ", description " + s.getDescription());
		}
	}
//	@Test 
//	public void testGetSegmentByRecurrentName()
//	{
//		List<Segment> segments = segmentManagerImpl.getAllSegmentByRecurrentName("74");
//		System.out.println("Segment size " + segments.size());
//		for(Segment s : segments)
//			{
//				System.out.println("Segment id " + s.getSegmentId() + ", chromosome " + s.getChromosome() + ", recurrent parent " 
//						+ s.getRecurrentParent() + " , donor parent "+ s.getDonorParent() + ", position 1 " + s.getPosition1()
//						+ ", position 2 " + s.getPosition2() + ", position 3 " + s.getPosition3() + ", position 4 " + s.getPosition4()
//						+ ", physical start " + s.getPhysicalStart() + ", physical end " + s.getPhysicalEnd() + ", estimated length " 
//						+ s.getEstimatedLength() + ", minimum length " + s.getMinimumLength() + ", maximum length " +
//						s.getMaximumLength() + ", description " + s.getDescription());
//			}
//	}
	
//	@Test
//	public void testGetSegmentByDynamicSQL()
//	{
//		HashMap<String, ConditionAndValue> conditions = new HashMap<String, ConditionAndValue>();
//		ConditionAndValue conditionAndValue = new ConditionAndValue(Condition.Equal,"2");
//		ConditionAndValue cav = new ConditionAndValue(Condition.Equal, "2");
//		conditions.put(StringConstants.SEGMENT_ID, conditionAndValue);
////		conditions.put(StringConstants.CHROMOSOME, cav);
//		conditions.put(StringConstants.GENETIC_ESTIMATED_LENGHT, new ConditionAndValue(Condition.GreaterThan,"10"));
//		List<Segment> segments = segmentManagerImpl.getSegmentByDynamicSQL(conditions);
//		for(Segment s : segments)
//		{
//			System.out.println("Segment id " + s.getSegmentId() + ", chromosome " + s.getChromosome() + ", recurrent parent " 
//					+ s.getRecurrentParent() + " , donor parent "+ s.getDonorParent() + ", position 1 " + s.getPosition1()
//					+ ", position 2 " + s.getPosition2() + ", position 3 " + s.getPosition3() + ", position 4 " + s.getPosition4()
//					+ ", physical start " + s.getPhysicalStart() + ", physical end " + s.getPhysicalEnd() + ", estimated length " 
//					+ s.getEstimatedLength() + ", minimum length " + s.getMinimumLength() + ", maximum length " +
//					s.getMaximumLength() + ", description " + s.getDescription());
//		}
//	}
}

