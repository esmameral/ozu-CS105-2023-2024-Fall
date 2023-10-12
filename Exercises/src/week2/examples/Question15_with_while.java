package week2.examples;

import java.util.Scanner;

//Question 15: (loops-while) 
//Write a program that repeatedly asks the user 
//for an integer and calculates the sum of those numbers. 
//When the total exceeds 100, your program should stop 
//asking for a new integer and print the number count and 
//average of the numbers to the screen.
//Solve the problem using both "while" and "do-while"

public class Question15_with_while {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int total=0;
		int count=0;	
		while(total<=100) {
		
			//ask user for entering a new integer
			System.out.println("Enter an integer value:");
			int value=input.nextInt();
			//add number to total
			total+=value;//total=total+value;
			count++;//count=count+1;
		}
		System.out.println("Total:"+total);	
		System.out.println("Count:"+count);	
		double avg=1.0*total/count;
		System.out.println("Avg:"+avg);	

	}
	

}
