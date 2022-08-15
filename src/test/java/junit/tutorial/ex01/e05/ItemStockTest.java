package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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
		Item item = new Item("book", 1);
		ItemStock stock = new ItemStock();
		int answer = stock.getNum(item);
		assertEquals(0, answer);
		// fail("Not yet implemented");
	}

	@Test
	void test2() {
		Item item = new Item("book", 1);
		ItemStock stock = new ItemStock();
		stock.add(item);
		int answer = stock.getNum(item);
		assertEquals(1, answer);

		// fail("Not yet implemented");
	}

	@Test
	void test3() {
		Item item = new Item("book", 1);
		ItemStock stock = new ItemStock();
		stock.add(item);
		int answer = stock.getNum(item);
		assertEquals(1, answer);
		// fail("Not yet implemented");
	}

	@Test
	void test4() {
		Item item = new Item("book", 1);
		ItemStock stock = new ItemStock();
		stock.add(item);
		stock.add(item);
		int answer = stock.getNum(item);
		assertEquals(2, answer);
		// fail("Not yet implemented");
	}

	@Test
	void test5() {
		Item item = new Item("book", 1);
		ItemStock stock = new ItemStock();
		stock.add(item);

		Item item2 = new Item("cd", 1);
		stock.add(item2);
		int answer = stock.getNum(item);
		
		assertEquals(1, answer);
		// fail("Not yet implemented");
	}

}
