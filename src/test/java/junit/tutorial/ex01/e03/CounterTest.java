package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

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
	void testIncrement() {
		Counter cou = new Counter();
		int answer = cou.increment();
		assertEquals(1, answer, "失敗");
		// fail("Not yet implemented");
	}

	@Test
	void testIncrement2() {
		Counter cou = new Counter();
		cou.increment();
		int answer = cou.increment();
		assertEquals(2, answer, "失敗");
	}

	@Test
	void testIncrement3() {
		Counter cou = new Counter();
		for (int i = 1; i <= 50; i++) {
			cou.increment();
		}
		int answer = cou.increment();
		assertEquals(51, answer);
	}

}
