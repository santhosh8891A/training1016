package training1016.practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTesting {
	
	public static void main(String[] args) {
		
		List<Integer> llist=new LinkedList<Integer>();
		
		//int -->Integer
		//char-->Character
		//float-->Float
		//double-->Double
		
		llist.add(5);
		llist.add(8);
		llist.add(9);
		llist.add(9);
		
		for(int i:llist)
		{
			System.out.println(i);
		}
	}

}
