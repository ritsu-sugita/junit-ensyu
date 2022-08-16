package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized.Parameter;

import com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase;

class FrameworksTest {

	private static final Database Oracle = null;
	private static final ApplicationServer GlassFish = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@ParameterizedTest
	@CsvSource({ 
		"true,GlassFish,Oracle", 
		"true,GlassFish,DB2", 
		"true,GlassFish,PostgreSQL", 
		"true,GlassFish,MySQL",
		"false,JBoss,Oracle", 
		"true,JBoss,DB2", 
		"true,JBoss,PostgreSQL", 
		"false,JBoss,MySQL", 
		"false,Tomcat,Oracle",
		"false,Tomcat,DB2", 
		"false,Tomcat,PostgreSQL", 
		"true,Tomcat,MySQL" })
	void test(boolean expected, ApplicationServer appServer, Database db) {
		boolean answer = Frameworks.isSupport(appServer, db);
		assertEquals(expected, answer);
	}

//	@Test
//	void test1() {
//		boolean answer = Frameworks.isSupport(ApplicationServer.GlassFish, Database.Oracle);
//		assertEquals(true, answer);
//	}
//
//	void test2() {
//		boolean answer = Frameworks.isSupport(ApplicationServer.GlassFish, Database.DB2);
//		assertEquals(true, answer);
//	}
//
//	void test3() {
//		boolean answer = Frameworks.isSupport(ApplicationServer.GlassFish, Database.MySQL);
//		assertEquals(true, answer);
//	}
//
//	void test4() {
//		boolean answer = Frameworks.isSupport(ApplicationServer.GlassFish, Database.PostgreSQL);
//		assertEquals(true, answer);
//	}
//
//	void test5() {
//		boolean answer = Frameworks.isSupport(ApplicationServer.JBoss, Database.Oracle);
//		assertEquals(false, answer);
//	}
//
//	void test6() {
//		boolean answer = Frameworks.isSupport(ApplicationServer.JBoss, Database.DB2);
//		assertEquals(true, answer);
//	}
//
//	void test7() {
//		boolean answer = Frameworks.isSupport(ApplicationServer.JBoss, Database.MySQL);
//		assertEquals(true, answer);
//	}
//
//	void test8() {
//		boolean answer = Frameworks.isSupport(ApplicationServer.JBoss, Database.PostgreSQL);
//		assertEquals(false, answer);
//	}
//
//	void test9() {
//		boolean answer = Frameworks.isSupport(ApplicationServer.Tomcat, Database.Oracle);
//		assertEquals(false, answer);
//	}
//
//	void test10() {
//		boolean answer = Frameworks.isSupport(ApplicationServer.Tomcat, Database.DB2);
//		assertEquals(false, answer);
//	}
//
//	void test11() {
//		boolean answer = Frameworks.isSupport(ApplicationServer.Tomcat, Database.MySQL);
//		assertEquals(false, answer);
//	}
//
//	void test12() {
//		boolean answer = Frameworks.isSupport(ApplicationServer.Tomcat, Database.PostgreSQL);
//		assertEquals(true, answer);
//	}

}
