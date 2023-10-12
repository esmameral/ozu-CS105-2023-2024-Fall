package week2.examples;
/*
 * Generate a random number and don’t diplay that number user. 
 * Let the user repeatedly guess a number until it is correct.
The problem is to guess what number a computer has in mind. 
You will write a program that randomly generates an 
integer between 10 and 99, inclusive. 
The program prompts the user to enter a number continuously until 
the number matches the randomly generated number. 
For each user input, the program tells the user whether the 
input is too low or too high, so the user can make the 
next guess intelligently. Here is a sample run:
Guess a magic number between 10 and 99 
Enter your guess: 50
Your guess is too high
Enter your guess: 25
Your guess is too low
Enter your guess: 42
Your guess is too high
Enter your guess: 39
Yes, the number is 39
Iteration count: 4
*/

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int randomNumber=(int)(Math.random()*90)+10;
		int count=0;
		while(true) {
			System.out.println("Guess the number?");
			int guess=input.nextInt();
			count++;
			if(guess==randomNumber) {
				System.out.println("Your guess is correct");
				break;
			}else if(guess>randomNumber) {
				System.out.println("Your guess is too high");
			}else {
				System.out.println("Your guess is too low");
			}
			
			
		}
		System.out.println("guess count:"+count);

	}

}
