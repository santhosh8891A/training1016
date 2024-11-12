package training1016.practice;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(5);
		set.add(4);
     	System.out.println(	set.add(3));
		set.add(6);
		set.add(9);
		set.add(null);
	    System.out.println(set.add(5));
		set.add(4);
		
		System.out.println(set);
		

	}

}
