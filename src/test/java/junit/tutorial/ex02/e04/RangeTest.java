package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RangeTest {

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

	@Test
	void test1() {
		Range range = new Range(0.0, 10.5);
		boolean answer1 = range.contains(-0.1);
		boolean answer2 = range.contains(0.0);
		boolean answer3 = range.contains(10.5);
		boolean answer4 = range.contains(10.6);

		assertEquals(false, answer1);
		assertEquals(true, answer2);
		assertEquals(true, answer3);
		assertEquals(false, answer4);
		// fail("Not yet implemented");
	}

	void test2() {
		Range range = new Range(-5.1, 5.1);
		boolean answer1 = range.contains(-5.2);
		boolean answer2 = range.contains(-5.1);
		boolean answer3 = range.contains(5.1);
		boolean answer4 = range.contains(5.2);

		assertEquals(false, answer1);
		assertEquals(true, answer2);
		assertEquals(true, answer3);
		assertEquals(false, answer4);
		// fail("Not yet implemented");
	}
}
