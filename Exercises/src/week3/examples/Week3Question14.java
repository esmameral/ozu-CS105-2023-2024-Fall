package week3.examples;

import java.util.Scanner;

//An n * n matrix is called a positive 
//Markov matrix if each element is positive and 
//the sum of the elements in each column is 1. 
//Write a program to check whether a matrix is a Markov matrix.
public class Week3Question14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the row count:");
		int rowCount =input.nextInt();
		
		System.out.println("Enter the col count:");
		int colCount = input.nextInt();
		/*
		 * Scanner.nextXXX() methods (except nextLine) 
		 * only read the value. So when you continue reading 
		 * with input.nextLine() you receive the "\n" Enter key. 
		 * So to skip this you have to add the input.nextLine().
		 */
		input.nextLine();
		double[][] matrix = new double[rowCount][colCount];
		for (int i = 0; i < rowCount; i++) {
			System.out.println("Enter row["+i+"]=?");
			String aLine=input.nextLine();
			//Split line values
			String[] elements=aLine.split(" ");
			//Assign line values int to array
			int j=0;
			for (String aValue:elements) {
				double aValueDouble=Double.valueOf(aValue);
				matrix[i][j]=aValueDouble;
				j++;
				
			}
			System.out.println();
		}

		boolean isMarkovMatrix = true;
		for (int col = 0; col < colCount; col++) {
			double sum = 0;
			for (int row = 0; row < rowCount; row++) {
				sum += matrix[row][col];
				if (sum > 1) {
					isMarkovMatrix = false;
					break;
				}
				if (matrix[row][col] < 0) {
					isMarkovMatrix = false;
					break;
				}
			}
			if (sum != 1) {
				isMarkovMatrix = false;
				break;
			}
		}

		if (isMarkovMatrix)
			System.out.println("is a Markov matrix");
		else
			System.out.println("is NOT a Markov matrix");

	}

}
