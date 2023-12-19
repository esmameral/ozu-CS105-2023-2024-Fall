package week12.examples;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExamples {

	public static void main(String[] args) {

		
		//SortedSet<String> names = new TreeSet<String>();
		TreeSet<String> names = new TreeSet<String>();
		names.add("zeynep");
		names.add("alperen");
		names.add("ali");
		System.out.println();
		names.add("kerem");
		
		for (String aName : names) {
			System.out.println(aName);
		}
		names.remove("ali");
		System.out.println("after delete");
		for (String aName : names) {
			System.out.println(aName);
		}
		
	
	}

}
