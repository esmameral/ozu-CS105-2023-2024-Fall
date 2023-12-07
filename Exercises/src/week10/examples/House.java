package week10.examples;

public class House extends Building implements Taxable{

	@Override
	public double calculateTax() {
		
		return 100;
	}

}
