package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonthlyCalendarTest {

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
		LocalDate date = LocalDate.of(2012, 1, 31);
		MonthlyCalendar calender = new MonthlyCalendar(date);
		int answer = calender.getRemainingDays();
		assertEquals(0, answer);
	}

	@Test
	void test2() {
		LocalDate date = LocalDate.of(2012, 1, 30);
		MonthlyCalendar calender = new MonthlyCalendar(date);
		int answer = calender.getRemainingDays();
		assertEquals(1, answer);
	}

	@Test
	void test3() {
		LocalDate date = LocalDate.of(2012, 2, 1);
		MonthlyCalendar calender = new MonthlyCalendar(date);
		int answer = calender.getRemainingDays();
		assertEquals(28, answer);
	}
}
