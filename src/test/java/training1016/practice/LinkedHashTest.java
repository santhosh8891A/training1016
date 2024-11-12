package training1016.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashTest {

	public static void main(String[] args) {
		Set<Integer> set=new LinkedHashSet<Integer>();
		set.add(5);
		set.add(4);
     	set.add(3);
		set.add(6);
		set.add(9);
		set.add(null);
	    set.add(5);
		set.add(4);
		
		System.out.println(set);

	}

}
