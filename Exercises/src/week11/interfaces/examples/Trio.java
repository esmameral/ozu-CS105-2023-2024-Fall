package week11.interfaces.examples;

public class Trio implements MenuItem {
	private Sandwich sandwich;
	private Salad salad;
	private Drink drink;

	public Trio(Sandwich sandwich, Salad salad, Drink drink) {
		super();
		this.sandwich = sandwich;
		this.salad = salad;
		this.drink = drink;
	}

	/*
	 * The name of the Trio consists of the names of the sandwich, salad, and drink,
	 * in that order, each separated by “/” and followed by a space and then “Trio”.
	 */
	@Override
	public String getName() {
		return sandwich.getName() + " / " + salad.getName() + " / " + drink.getName() + " Trio";
	}

	/*
	 * The price of the Trio is the sum of the two highest-priced items in the Trio;
	 * one item with the lowest price is free. A trio consisting of a cheeseburger,
	 * Green salad, and a coke would have the name
	 * "Cheeseburger/Green Salad/Coke Trio" and a price of 52 (the two highest
	 * prices are 30 and 22).
	 */
	@Override
	public double getPrice() {
		if (drink.getPrice() < sandwich.getPrice() && drink.getPrice() < salad.getPrice())
			return sandwich.getPrice() + salad.getPrice();
		else if(salad.getPrice() < sandwich.getPrice() && salad.getPrice() < drink.getPrice())
			return sandwich.getPrice() + drink.getPrice();
		else
			return salad.getPrice() + drink.getPrice();

	}

	@Override
	public String toString() {
		return getName() +" Price=" + getPrice();
	}

}
