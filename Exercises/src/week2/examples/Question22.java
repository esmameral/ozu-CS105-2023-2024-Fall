package week2.examples;

import java.util.Scanner;

/*
 * Write a program that asks user for a number. Check that 
 * number is a prime number or not. 
 */
public class Question22 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int number=scan.nextInt();
		boolean isPrime=true;
		for(int i=2; i<=number/2;i++) {
			if(number%i==0) {
				System.out.println("is not a prime number");
				isPrime=false;
				break;
			}	
		}
		if(isPrime)
			System.out.println("is a prime number");
		
		
		
	}

}
