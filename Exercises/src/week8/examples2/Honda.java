package week8.examples2;

public class Honda extends Car {
	private String name;
	
	

	public Honda(String plateNumber, int year, String name) {
		//super();
		System.out.println("Honda(String plateNumber, int year, String name)");
		setPlateNumber(plateNumber);
		setName(name);
		setYear(year);
	}

	@Override
	public String getColor() {
		
		return "Red";
	}

	@Override
	public String toString() {
		return super.getColor();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getBrand() {
		
		return super.getBrand()+ " BMW";
	}
	
	
	

}
