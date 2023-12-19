package week12.examples;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExamples2 {

	public static void main(String[] args) {

		
		//SortedSet<String> names = new TreeSet<String>();
		TreeSet<Student> students = new TreeSet<Student>();
		Student s1=new Student(123,"Ayse");
		Student s2=new Student(311,"Zehra");
		Student s3=new Student(12,"Osman");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		
		
	
	}

}
