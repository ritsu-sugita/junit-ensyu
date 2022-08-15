package junit.tutorial.ex01.e05;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {
	private Map<String, Integer> itemMap = new HashMap<>();
	
	public int getNum(Item item) {
		Integer num = itemMap.get(item.getName());
		if (num == null) {
			return 0;
		} else {
			return num;
		}
	}
	
	public void add(Item item) {
		Integer num = itemMap.get(item.getName());
		if (num == null) {
			num = 0;
		}
		num++;
		itemMap.put(item.getName(), num);
	}

}
