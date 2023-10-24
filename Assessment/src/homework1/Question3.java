package homework1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value N:");
		int N=input.nextInt();
		int x = (int)Math.random() * 10 + 1;
		double sum = 0;
		long fact = 1;
		for (int k = 1; k <= N; k++) {
			fact *= k;
			sum += Math.pow(-1, k) * (3 * Math.pow(x, k + 1) + 2) / fact;

		}
		System.out.println(sum);
	}

}
