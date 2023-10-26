package weeek4.examples;

public class BMI {
	private String name ;
	private int age;
	private double weight;
	private double height;
	private double bmi;
	public BMI(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	public BMI(String name, int age, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public double getBMI() {
		bmi = weight/Math.pow(height, 2);
		return bmi;
	}
	
	public String getStatus() {
		if(bmi<18.5)
			return "Underweight";
		else if(bmi<25)
			return "Normal";
		else if(bmi<30)
			return "Overweight";
		else
			return "Obese";
	}
}
