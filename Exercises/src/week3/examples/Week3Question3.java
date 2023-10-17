package week3.examples;

import java.util.Scanner;

//Write a program which takes the size and the values 
//of the array from the user, and finds the number of 
//elements which are divisible by 5. 
//Put these values into a new array
public class Week3Question3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter length:");
		int n=input.nextInt();
		int[] numbers=new int[n];
		System.out.println("Enter values:");
		for (int i = 0; i < n; i++) {
			numbers[i]=input.nextInt();
			
			
		}

	}

}
