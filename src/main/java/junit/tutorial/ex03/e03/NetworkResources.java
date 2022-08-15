package junit.tutorial.ex03.e03;

import java.io.IOException;
import java.io.InputStreamReader;

public class NetworkResources {
	
	NetworkLoader loader = new NetworkLoader();

	public String load() throws IOException {
		try(InputStreamReader reader = new InputStreamReader(loader.getInput())) {
			StringBuilder sb = new StringBuilder();
			char[] buf = new char[512];
			while(true) {
				int len = reader.read(buf);
				if (len == -1) {
					break;
				}
				sb.append(new String(buf, 0, len));
			}
			return sb.toString();
		}
	}
}
