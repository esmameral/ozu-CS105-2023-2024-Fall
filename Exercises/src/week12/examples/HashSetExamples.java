package week12.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExamples {

	public static void main(String[] args) {
				
		Set<String> names = new HashSet<String>();
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
