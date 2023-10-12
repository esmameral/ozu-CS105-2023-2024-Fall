package week2.examples;
//5.	Print all even numbers from 100 to 10 on the screen 
//      by reverse order.
//100 
//98 
//96
//…
//10

public class Question16_5 {

	public static void main(String[] args) {
//		for(int value=100;value>=10;value-=2) {
//			System.out.print(value+" ");
//		}
		int value=100;
		
		while(value>=10) {
			System.out.print(value+" ");
			value-=2;
		}

	}

}
