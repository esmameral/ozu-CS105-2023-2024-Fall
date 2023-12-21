package week12.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SortExamples {

	public static void main(String[] args) {
		//exampleForHashSet();
		//exampleForSortingStringSet();
		
		//exampleSortingByUsingComparator();
		exampleSortByCollectionsClass();

	}

	private static void exampleSortByCollectionsClass() {
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1=new Student(123,"Ayse","Kara");
		Student s2=new Student(311,"Zehra","Demir");
		Student s3=new Student(12,"Osman","Can");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		System.out.println("******* BEFORE SORT ********");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("******* AFTER SORT BY DEFAULT WAY (Comparable) ********");
		Collections.sort(students);
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("******* AFTER SORT BY NAME(Comparator) ********");
		Collections.sort(students,new StudentNameComparator());
		for (Student student : students) {
			System.out.println(student);
		}
		
		
	}

	public static void exampleSortingByUsingComparator() {
		//For sorting by ID
		//TreeSet<Student> students = new TreeSet<Student>(new StudentIdComparator());
		//For sorting by Name
		//TreeSet<Student> students = new TreeSet<Student>(new StudentNameComparator());
		//For using default sort (by surname-provided Comparable)
		TreeSet<Student> students = new TreeSet<Student>();
		Student s1=new Student(123,"Ayse","Kara");
		Student s2=new Student(311,"Zehra","Demir");
		Student s3=new Student(12,"Osman","Can");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public static void exampleForSortingStringSet() {
		TreeSet<String> names=new TreeSet<String>();
		names.add("ali");
		names.add("veli");
		names.add("hasan");
		names.add("berke");
		
		
		
		names.add("onur");
		names.add("doruk");
		names.add("dyna");
		Utility.printArrayList(names);
	}

	public static void exampleForHashSet() {
		HashSet<String> names=new HashSet<String>();
		names.add("ali");
		names.add("veli");
		names.add("hasan");
		names.add("berke");
		Utility.printArrayList(names);
		
		ArrayList<String> names2=new ArrayList<>();
		names2.add("onur");
		names2.add("doruk");
		names2.add("Dyna");
		names.addAll(names2);
		Utility.printArrayList(names);
	}

}
