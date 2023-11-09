package week6.examples.test;

import week6.examples.Person;
import week6.examples.User;

public class TestObjectOperators {

	public static void main(String[] args) {
		//testObjectOperators();
		//testEqualsMethod();
		testStatic();
		
	}

	public static void testObjectOperators() {
		User fUser = new User(1, "ali");
		User sUser = new User(2, "ayse");
		fUser.setName("hasan");
		//Test == and = operators
		System.out.println(fUser==sUser);
		System.out.println(fUser.getName());
		System.out.println(sUser.getName());
		
		fUser=sUser; 
		System.out.println(fUser==sUser);
		fUser.setName("kerem");
		System.out.println(fUser.getName());
		System.out.println(sUser.getName());
		
		System.out.println(fUser instanceof User);
		String name="Ali";
		String name2=new String("Ali");
		Integer number=34;
		Integer number2=new Integer(3);
		
		User user=new User();
		Object obj=new Person();
		obj=new User();
		
	}
	
	public static void testEqualsMethod() {
		//Test equals method
		User fUser = new User(1, "ali");
		User sUser = new User(1, "ayse");
		
		System.out.println("equals:"+fUser.equals(sUser));
	}
	
	public static void testStatic() {
		//Test equals method
		User fUser = new User(1, "ali");
		
		System.out.println(User.getSchoolName());
		User.setSchoolName("OZU");
		System.out.println(User.getSchoolName());
		
		//Not a good usage:You should access static methods by static way only
		System.out.println(fUser.getSchoolName());
		
		//Some static methods and variables from Math class
		System.out.println(Math.PI);
		System.out.println(Math.abs(-12));
		System.out.println(Math.random());
		System.out.println(Math.sin(12));
		System.out.println(Math.round(12.67));
		
		
		
	}

}
