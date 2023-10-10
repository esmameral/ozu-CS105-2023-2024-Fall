package week2.examples;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1=input.nextDouble();
		System.out.println("Enter second number");
		double num2=input.nextDouble();
		//double sum=num1+num2;
		System.out.println("Sum of 2 numbers:"+(num1+num2));
	}

}
