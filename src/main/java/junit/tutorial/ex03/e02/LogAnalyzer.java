package junit.tutorial.ex03.e02;

import java.io.IOException;
import java.util.Map;

public class LogAnalyzer {
	
	LogLoader logLoader = new LogLoader();
	
	public Object analyze(String file) {
		try {
			Map<String, String> rawData = logLoader.load(file);
			return doAnalyze(rawData);
		} catch (IOException e) {
			throw new AnalyzeException(e);
		}
	}
	
	private Object doAnalyze(Map<String, String> rawData) {
		// 仮実装
		return new Object();
	}
	
}
