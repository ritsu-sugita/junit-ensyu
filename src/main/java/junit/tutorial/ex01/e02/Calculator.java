package junit.tutorial.ex01.e02;

public class Calculator {
	
	public int divide(int x, int y) {
		if (y == 0) throw new IllegalArgumentException("divide by zero.");
		return x / y;
	}

}
