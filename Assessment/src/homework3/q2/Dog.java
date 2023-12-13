package homework3.q2;

public class Dog extends Mammal {

	public Dog(String name) {
		super(name);
	}

	public void greets() {
		System.out.println("Woof");
	}

	public void greets(Dog anotherDog) {
		System.out.println("Wooooof");
	}

	@Override
	public String toString() {
		return "Dog[" + super.toString() + "]";
	}

}
