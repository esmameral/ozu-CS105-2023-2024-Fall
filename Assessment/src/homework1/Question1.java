package homework1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the weight of the package:");
		double w=input.nextDouble();
		double cost=0;
		if(w<=2)
		System.out.println("Cost is 60 TL");

		else if(w<=5)
			System.out.println("Cost is 100 TL");
		else if(w<=15)
			System.out.println("Cost is 150 TL");
		else if(w<=30)
			System.out.println("Cost is 200 TL");
		else {
			System.out.println("The package cannot be shipped.");
		}
		
	}

}
