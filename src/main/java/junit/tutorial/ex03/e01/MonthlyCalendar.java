package junit.tutorial.ex03.e01;

import java.time.LocalDate;

public class MonthlyCalendar {

	private final LocalDate nowDate;
	
	public MonthlyCalendar() {
		this(LocalDate.now());
	}
	
	MonthlyCalendar(LocalDate nowDate) {
		this.nowDate = nowDate;
	}
	
	public int getRemainingDays() {
		return nowDate.lengthOfMonth() - nowDate.getDayOfMonth();
	}
}
