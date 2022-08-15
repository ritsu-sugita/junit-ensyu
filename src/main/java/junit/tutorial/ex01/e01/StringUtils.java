package junit.tutorial.ex01.e01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
	public static String toSnakeCase(String text) {
		if (text == null) {
			throw new NullPointerException("text == null.");
		}
		String snake = text;
		Pattern p = Pattern.compile("([A-Z])");
		for (;;) {
			Matcher m = p.matcher(snake);
			if (!m.find()) {
				break;
			}
//			System.out.println("matcher.group() = " + m.group());
			snake = m.replaceFirst("_" + m.group(1).toLowerCase());
//			System.out.println("snake = " + snake);
		}
		return snake.replaceFirst("^_", "");
	}

}
