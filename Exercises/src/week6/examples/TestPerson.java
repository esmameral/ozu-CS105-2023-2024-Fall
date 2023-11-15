package week6.examples;

public class TestPerson {
	public static void main(String[] args) {
		Person myPerson=new Person("Demet",12);
		Person myPerson2=new Person("Demet",12);
		System.out.println(myPerson.toString());
		//myPerson.setName("Esra");
		System.out.println(myPerson);
		
		System.out.println(myPerson==myPerson2);
		System.out.println(myPerson.equals(myPerson2));
		
	}
}
