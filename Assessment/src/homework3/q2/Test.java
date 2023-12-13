package homework3.q2;

public class Test {

	public static void main(String[] args) {
		Animal	anAnimal= new Animal("Snake");
		Cat aCat= new Cat("Simba");
		Dog aDog=new Dog("Merlin");
		Animal anotherCat= new Cat("Karamel");
				
		System.out.println(anAnimal);
		System.out.println(aCat);
		System.out.println(aDog);
				
		aCat.greets();
		aDog.greets();
		aDog.greets(new Dog("Haydut"));

		((Cat)anotherCat).climb(4);
		
	}

}
