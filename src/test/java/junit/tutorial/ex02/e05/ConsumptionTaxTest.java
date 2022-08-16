package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConsumptionTaxTest {

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

//	@Test
//	void test() {
//		ConsumptionTax con = new ConsumptionTax(5);
//		int answer = con.apply(100);
//		assertEquals(105, answer);
//		// fail("Not yet implemented");
//	}

	@ParameterizedTest
	@CsvSource({ 
		"5, 100, 105", 
		"5, 3000, 3150", 
		"10, 50, 55", 
		"5, 50, 52", 
		"3, 50, 51" })
	void test(int rate, int price, int expected) {
		ConsumptionTax con = new ConsumptionTax(rate);
		int answer = con.apply(price);
		assertEquals(expected, answer);
	}
}
