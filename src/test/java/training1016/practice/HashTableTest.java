package training1016.practice;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		map.put("bbb", 3458);
		map.put("aaa", 1245);		
		map.put("ccc", 7898);
		 
		map.putIfAbsent("ccc", 1245);
		
		//System.out.println(map.keySet());
		
		System.out.println(map.getOrDefault("ddd",1213));
		
       //map.remove("aaa");
		for (String i : map.keySet()) {
			System.out.println(i+" - "+map.get(i));
		}
		
		System.out.println(map.values());
		System.out.println(map.size());
	}

	}


