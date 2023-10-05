package week1.examples;

/*
 * Write a program that prints the digits of a four-digit number one by one 
 * on the screen.
 * Your program also should print the sum of its digits.
 * The sample program output should be as follows:
 * Number:6547
 * First digit:7
 * Second digit:4
 * Third digit:5
 * Fourth digit:6
 * Sum of digits: 23
 */
public class Example3 {

	public static void main(String[] args) {
		int number = 9832;

		// Use only following operators: / , %

		int digit1 = number % 10;
		int digit2 = number / 10 % 10;
		int digit3 = number / 100 % 10;
		int digit4 = number / 1000;

		System.out.println("First Digit:" + digit1);// 7
		System.out.println("Second Digit:" + digit2);// 4
		System.out.println("Third Digit:" + digit3);// 5
		System.out.println("Fourth Digit:" + digit4);// 6

		int sum=digit1+digit2+digit3+digit4;
		System.out.println("Sum:" +sum );

	}

}
