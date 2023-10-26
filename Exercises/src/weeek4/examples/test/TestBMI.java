package weeek4.examples.test;

import weeek4.examples.BMI;

public class TestBMI {

	public static void main(String[] args) {
		
		BMI bmi1 = new BMI("John", 70, 1.7);
		System.out.println("The BMI for "+bmi1.getName()+" "+bmi1.getBMI()+" "+bmi1.getStatus());
		BMI bmi2 = new BMI("Susan", 140, 1.5);
		System.out.println("The BMI for "+bmi2.getName()+" "+bmi2.getBMI()+" "+bmi2.getStatus());


	}

}
