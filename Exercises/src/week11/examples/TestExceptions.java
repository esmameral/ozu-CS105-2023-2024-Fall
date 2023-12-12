package week11.examples;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptions {

	public static void main(String[] args) {
		
		try {
			System.out.println(Example.getElement(1));
			Example.readLine();
			//asnbamnd
		} catch (Exception e) {
			System.out.println("There is no file named test.txt");
			e.printStackTrace();
		}finally {
			System.out.println("I am in the finally block");
		}
		
	}

}
