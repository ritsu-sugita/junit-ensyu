package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

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
	void test() {
		FizzBuzz fizz = new FizzBuzz();
		List<String> list = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
				"13", "14", "FizzBuzz", "16");
		List<String> answer = fizz.createFizzBuzzList(16);
		assertIterableEquals(list, answer);
		// fail("Not yet implemented");
	}

//	@Test
//	void test2() {
//		FizzBuzz fizz = new FizzBuzz();
//		List<String> answer = fizz.createFizzBuzzList(16);
//		assertEquals("1,2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz,13, 14, FizzBuzz, 16", answer);
//		// fail("Not yet implemented");
//	}
//リストの型じゃないからダメ
}
