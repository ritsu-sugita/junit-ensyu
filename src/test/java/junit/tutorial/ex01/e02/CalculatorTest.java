package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

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
	void testDivide() {
		try {
			Calculator cal = new Calculator();
			int answer = cal.divide(4, 0);
			fail();
		} catch (Exception e) {
			System.out.println("計算できません");
		}

		// fail("Not yet implemented");
	}

	@Test
	void testDivide2() {
		Calculator cal = new Calculator();
		// assertThrows(Calculator, () -> );

		// fail("Not yet implemented");
	}

}
