package junit.tutorial.ex02.e01;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	public List<String> createFizzBuzzList(int num) {
		List<String> result = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result.add("FizzBuzz");
			} else if (i % 5 == 0) {
				result.add("Buzz");
			} else if (i % 3 == 0) {
				result.add("Fizz");
			} else {
				result.add("" + i);
			}
		}
		return result;
	}

}
