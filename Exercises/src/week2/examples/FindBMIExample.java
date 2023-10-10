package week2.examples;

import java.util.Scanner;

/**
 * Body mass index (BMI) is a measure of body fat based on 
 * height (h-centimeter)
 * and weight(w-kg) that applies to adult men and women. 
 * Write a program that prompts the user to enter a weight in kg and 
 * height in cm and  displays the BMI.
 * BMI=w/h^2
 * Underweight = <18.5 
 * Normal weight = 18.5–24.9 
 * Overweight = 25–29.9 
 * Obesity = BMI of 30 or greater
 * 
 */
public class FindBMIExample {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your weight (in kg)");
	double w=input.nextDouble();
	System.out.println("Enter your height (in m)");
	double h=input.nextDouble();
	double bmi=w/(h*h);
	
	System.out.println();
	if(bmi<=18.5) 
		System.out.println("Underweight");
	else if (bmi<=24.9) 
		System.out.println("Normal weight");
	else if(bmi<=29.9)
		System.out.println("Overweight");
	else 
		System.out.println("Obesity");
}


}
