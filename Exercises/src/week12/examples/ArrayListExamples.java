package week12.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {
	
		//List<String> names = new ArrayList<String>();
		ArrayList<String> names = new ArrayList<String>();
		names.add("alperen");
		names.add("ali");
		System.out.println();
		names.add(1, "Taha");
		names.add("Kerem");
		System.out.println(names.indexOf("alperen"));
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("size before delete:"+names.size());

		names.remove(1);
		names.remove("Kerem");
		System.out.println("size after delete:"+names.size());
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

	}

}
