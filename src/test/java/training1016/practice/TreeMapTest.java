package training1016.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("bbb", null);
		map.put("aaa", 1245);		
		map.put("ccc", null);
		 

		

		for (String i : map.keySet()) {
			System.out.println(i+" - "+map.get(i));
		}
	}

}
