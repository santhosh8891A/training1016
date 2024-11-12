package training1016.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		 Map<String,Integer> map=new HashMap<String,Integer>();
		 
		 
		 map.put("aaa", 1245);
		 map.put("bbb", null);
		 map.put("ccc", null);
		 map.put(null, 2348);
		 
		 
		 map.keySet();
		 
		 for(String i:map.keySet())
		 {
			 System.out.println(map.get(i));
		 }

		 
		for(Map.Entry<String,Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
