package training1016.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		 
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(5);
		list.add(6);
		list.add(6);
		list.add(10);
		
		for(int i:list)
		{
			//System.out.println(i);
		}
		
		for(int i=0;i<list.size();i++)
		{
			//System.out.println(list.get(i));
		}
		
		
		
		Iterator it=list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//System.out.println(list);
		
		list.add(10);
		
		
		List<Object> list2=new ArrayList<Object>();
		list2.add(5);
		list2.add("test");
		list2.add(25.6f);
		list2.add(list);
	//	System.out.println(list2);
		
		System.out.println(list.get(1));
		
		
	}

}
