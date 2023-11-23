package week8.examples2;

public  class Vehicle {
	private String plateNumber;
	private int year;
	public String getBrand() {
		return "Fiat";
	}
	
//	public Vehicle() {
//		super();
//		System.out.println("Vehicle()");
//
//	}
	public Vehicle(String plateNumber) {
		super();
		System.out.println("Vehicle(String plateNumber)");
		this.plateNumber = plateNumber;
	}
	
	public Vehicle(String plateNumber, int year) {
		this(plateNumber);
		System.out.println("Vehicle(String plateNumber, int year)");
		this.year = year;
		
	}
	
	

	public String getColor() {
		return "Black";
	}
	
	@Override
	public String toString() {
		return getColor();
	}
	
	public String getPlateNumber() {
		
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}



	
	

}
