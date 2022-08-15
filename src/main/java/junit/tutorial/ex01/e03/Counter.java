package junit.tutorial.ex01.e03;

public class Counter {

	private int count;
	
	public Counter() {
		count = 0;
	}
	
	public int increment() {
		return ++count;
	}
	
}
