package org.strasa.middleware.manager;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.strasa.middleware.factory.ConnectionFactory;
import org.strasa.middleware.mapper.StudyRawDataMapper;
import org.strasa.middleware.mapper.other.StudyRawDataBatch;
import org.strasa.middleware.model.Germplasm;
import org.strasa.middleware.model.Study;
import org.strasa.middleware.model.StudyRawData;
import org.strasa.middleware.model.StudyRawDataByDataColumn;
import org.strasa.middleware.model.StudySite;

import au.com.bytecode.opencsv.CSVReader;

public class TestStudyRawDataManagerImpl {

	private static ConnectionFactory connectionFactory;
	private long startTime;

	@BeforeClass
	public static void setUp() throws Exception {
		connectionFactory = new ConnectionFactory();
	}

	@Before
	public void beforeEachTest() {
		startTime = System.nanoTime();
	}

	@After
	public void afterEachTest() {
		long elapsedTime = System.nanoTime() - startTime;
		System.out.println("#####" + ": Elapsed Time = " + elapsedTime + " ns = " + ((double) elapsedTime / 1000000000) + " s");
	}

	@Test
	public void testGetStudyRawDataColumn() throws Exception {
		StudyRawDataManagerImpl studyRawDataManagerImpl = new StudyRawDataManagerImpl(true);
		ArrayList<StudyRawDataByDataColumn> list = (ArrayList<StudyRawDataByDataColumn>) studyRawDataManagerImpl.getStudyRawDataColumn(1, "GName");
		for (StudyRawDataByDataColumn s : list) {
			System.out.println(s.getStudyid() + " " + s.getDatacolumn() + " " + s.getDatavalue());
		}
	}

	@Test
	public void testBuildColumnRaw() throws Exception {
		StudyRawDataManagerImpl studyRawDataManagerImpl = new StudyRawDataManagerImpl(true);
		ArrayList<ArrayList<String>> list = studyRawDataManagerImpl.constructDataRaw(122, new String[] { "Location", "Country", "Province", "Region", "Altitude", "Latitude", "WeatherStation" }, "Location", true);

		System.out.println(list.size());
	}

	@Test
	public void testNewBuildColumnRaw() throws Exception {
		SqlSession session = connectionFactory.sqlSessionFactory.openSession();
		StudyRawDataBatch mapper = session.getMapper(StudyRawDataBatch.class);
		List<StudySite> lstData = mapper.getRawSite(129, "studyrawdata", 1);
		System.out.println(lstData.size());
		for (StudySite loc : lstData) {
			System.out.println(loc.toString());
		}
	}

	@Test
	public void testGermplasmRaw() throws Exception {
		System.out.println("Start");
		SqlSession session = connectionFactory.sqlSessionFactory.openSession();
		StudyRawDataBatch mapper = session.getMapper(StudyRawDataBatch.class);
		List<Germplasm> lstData = mapper.getRawGermplasm(60, "studyrawdata", 1);
		System.out.println(lstData.size());
		for (Germplasm loc : lstData) {
			System.out.println(loc.toString());
		}
	}

	@Test
	public void testSiteRaw() throws Exception {
		System.out.println("Start");
		SqlSession session = connectionFactory.sqlSessionFactory.openSession();
		StudyRawDataBatch mapper = session.getMapper(StudyRawDataBatch.class);
		List<StudySite> lstData = mapper.getRawSite(60, "studyrawdata", 1);
		System.out.println(lstData.size());
		for (StudySite loc : lstData) {
			System.out.println(loc.toString());
		}
	}

	@Test
	public void testGermplasmCount() {
		SqlSession session = connectionFactory.sqlSessionFactory.openSession();
		StudyRawDataBatch mapper = session.getMapper(StudyRawDataBatch.class);
		Map<String, Object> params = new HashMap<String, Object>();

		ArrayList<String> list = new ArrayList<String>((Arrays.asList("Gen1", "Gen2", "Gen3")));
		params.put("studyid", 1);
		params.put("table", "studyrawdata");
		params.put("list", list);
		System.out.println("COUNT: " + mapper.countGermplasmOccurence(params));

	}

	@Test
	public void testRawCount() {
		SqlSession session = connectionFactory.sqlSessionFactory.openSession();
		StudyRawDataMapper mapper = session.getMapper(StudyRawDataMapper.class);
		StudyRawData data = new StudyRawData();
		data.setDatacolumn("s");
		data.setDatarow(1);
		data.setDatavalue("ss");

		mapper.insert(data);
		System.out.println(mapper.countByExample(null));
	}

	@Test
	public void testLargeDataInsert() throws Exception {
		StudyRawDataManagerImpl studyRawDataManagerImpl = new StudyRawDataManagerImpl(true);
		CSVReader csvMaster = new CSVReader(new FileReader(new File("c://SaltSample2.csv")));
		Study study = new Study();
		// 3.447850592 s
		// 3.048389672

		study.setDescription("Sample");
		study.setName("SampleAgain");
		study.setUserid(1);
		studyRawDataManagerImpl.addStudyRawDataByRawCsvList(study, csvMaster.readAll(), 1);
	}

}
