package week10.examples;

import java.io.Serializable;

public class Car extends Vehicle implements Taxable, Serializable {

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public String currency() {
		// TODO Auto-generated method stub
		return "USD";
	}
	

}
