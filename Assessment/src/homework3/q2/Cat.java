package homework3.q2;

public class Cat extends Mammal {

	public Cat(String name) {
		super(name);
	}
	public void greets() {
	System.out.println( "Meow");	
	}
	@Override
	public String toString() {
		return "Cat[" + super.toString() + "]";
	}
	
	public void climb(int a) {
		for (int i = 1; i <= a; i++) {
			System.out.println("Climb-"+i);
			
		}
		System.out.println("I am a cat I can climb trees");
	}

}
