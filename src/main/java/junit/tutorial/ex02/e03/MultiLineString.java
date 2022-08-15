package junit.tutorial.ex02.e03;

public class MultiLineString {
	
	public static String join(String... str) {
		StringBuilder sb = new StringBuilder();
		for(String s : str) {
//			sb.append(s + "a" + System.lineSeparator());
			sb.append(s + System.lineSeparator());
		}
		return sb.toString().trim();
	}

}
