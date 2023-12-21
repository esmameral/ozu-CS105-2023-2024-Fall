package week12.examples;

import java.util.ArrayList;

public class ArrayListAndArraysDifferencesExample {

	public static void main(String[] args) {
		String[] nameArr= new String[4]; 
		nameArr[0]="ali";
		nameArr[3]="omer";
		System.out.println("element at index 3 is:"+nameArr[3]);
		System.out.println(nameArr.length);
		//nameArr[4]="karen";
		
		
		ArrayList<String> names=new ArrayList<>();
		names.add("ali");
		names.add("veli");
		names.add("hasan");
		names.add("berke");
		Utility.printArrayList(names);
		
		ArrayList<String> names2=new ArrayList<>();
		names2.add("onur");
		names2.add("doruk");
		names2.add("Dyna");
		
		
		names.addAll(1,names2);
		System.out.println("element at index 3 is:"+names.get(3));
		System.out.println("After adding new arraylist");
		Utility.printArrayList(names);

	}

	

}
