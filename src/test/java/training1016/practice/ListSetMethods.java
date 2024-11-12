package training1016.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListSetMethods {

	public static void main(String[] args) {
		 
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(5);
		list1.add(6);
		list1.add(3);
		
		
		List<Integer> list2=new ArrayList<Integer>();
		list2.addAll(list1);
		list2.add(10);
		//System.out.println(list2);
		//list2.clear();
		
		//System.out.println(list2);
		if(list2.contains(5))
		{
			//System.out.println("5 is present");
		}
		 
		if(list1.containsAll(list2))
		{
			//System.out.println("All elements present");
		}
		
		Iterator<Integer> it=list2.iterator();
		//while(it.hasNext())
		//{
			//System.out.println(it.next());
		//}
		
		//System.out.println(Collections.min(list2));
		Collections.sort(list1);
		//System.out.println(list1);
		
		list2.retainAll(list1);
		System.out.println(list2);
		
		list2.toArray();
		
	}

}
