package week3.examples;

import java.util.Scanner;

public class Week3Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value N:");
		int N=input.nextInt();
		double sum=0; 
		for (int k = 1; k <=N; k++) {
			sum+=Math.pow(-1, k+1)/(2*k-1);
		}
		System.out.println("Pi:"+4*sum);
		System.out.println("Actual:"+Math.PI);

	}

}
