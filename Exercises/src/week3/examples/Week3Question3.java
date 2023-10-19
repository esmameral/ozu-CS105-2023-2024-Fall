package week3.examples;

import java.util.Scanner;

//Write a program which takes the size and the values 
//of the array from the user, and finds the number of 
//elements which are divisible by 5. 
//Put these values into a new array
public class Week3Question3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array length:");
		int n = input.nextInt();
		int[] numbers = new int[n];
		int count=0;
		System.out.println("Enter values:");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
			if(numbers[i]%5==0)
				count++;
		}
		int[] divisibleBy5=new int[count];
		int j=0;
		for (int i = 0; i < n; i++) {
			
			if(numbers[i]%5==0) {
				divisibleBy5[j]=numbers[i];
				j++;
			}
		}
		
		System.out.println();
	}

}
