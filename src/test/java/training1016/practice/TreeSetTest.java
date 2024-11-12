package training1016.practice;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<Integer> set=new TreeSet<Integer>();
		set.add(5);
		set.add(4);
     	set.add(3);
		set.add(6);
		set.add(9);
		set.add(5);
		set.add(4);
		
		System.out.println(set);

	}

}
