package training1016.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("bbb", null);
		map.put("aaa", 1245);		
		map.put("ccc", null);
		map.put(null, 2348);

		

		for (String i : map.keySet()) {
			System.out.println(map.get(i));
		}

		

	}

}
