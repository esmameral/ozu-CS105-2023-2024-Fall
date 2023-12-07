package week10.examples;

public interface Taxable {
	public double calculateTax();
	default public String currency() {
		return "TL";
	}

}
