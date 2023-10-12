package week2.examples;

import java.util.Scanner;

/*
 * Write a program. Your program first gets the number 
 * count from the user. 
 * After that, it should read numbers from the user, 
 * count how many of them are divisible by 3 and how many of 
 * them are divisible by 7, and write the results on the screen.
 */
public class Question21 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number count:");
		int numberCount=scan.nextInt();
		int divBy7=0;
		int divBy3=0;
		for(int i=1; i<=numberCount;i++) {
			//it should read numbers from the user
			System.out.println("Enter "+i+".number:");
			int number=scan.nextInt();
			//check if number is divisible by 7 or not
			if(number%7==0) {
				divBy7++;
			}
				
			//check if number is divisible by 3 or not
			if(number%3==0) {
				divBy3++;
			}	
		}

		System.out.println("There are "+divBy7+" numbers divisible by 7");
		System.out.println("There are "+divBy3+" numbers divisible by 3");
	}

}
