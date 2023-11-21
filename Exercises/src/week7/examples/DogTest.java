package week7.examples;

public class DogTest {

	public static void main(String[] args) {
		Dog myDog = new Dog("Rover");
		System.out.println(myDog);
		foo(myDog);
		System.out.println(myDog);
		
	}
	
	public static void foo(Dog someDog) {  // Line:1
		System.out.println(someDog);
	    someDog.setName("Max");     // Line:2
		System.out.println(someDog);
	    someDog = new Dog("Fifi");  // Line:3
		System.out.println(someDog);
	    someDog.setName("Rowlf");   // Line:4
		System.out.println(someDog);
	}
	
	

	

	 

}
