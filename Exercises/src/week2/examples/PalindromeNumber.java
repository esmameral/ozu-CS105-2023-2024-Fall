package week2.examples;

import java.util.Scanner;

/**
 * A palindrome number is the number that is equal to it when it is 
 * written in reverse. 121, 333, 646 are palindrome numbers. 
 * Write a program, let your program read a 3-digit integer from the user and write on the screen whether
 * the number is palindrome or not.
 * 
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-digit number");
		int number=input.nextInt();
		
		int firstDigit=number%10;
		int lastDigit=number/100;
		
		if(firstDigit==lastDigit)
			System.out.println(number+" is a palindrome number");
		else
			System.out.println(number+" is not a palindrome number");

			
	}

}
