package week2.examples;

import java.util.Scanner;

/**
 * Question: Find the largest number among three numbers
 */
public class IfConditionExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = input.nextInt();
		System.out.println("Enter second number");
		int b = input.nextInt();
		System.out.println("Enter third number");
		int c = input.nextInt();

		if (a > b) {// a or c is the largest number
			if (a > c) {
				System.out.println("Largest Number:" + a);
			} else {
				System.out.println("Largest Number:" + c);
			}
		} else {// a is not the largest number. b or c is the largest number
			if (b > c) {
				System.out.println("Largest Number:" + b);
			} else {
				System.out.println("Largest Number:" + c);
			}

		}

	}

}
