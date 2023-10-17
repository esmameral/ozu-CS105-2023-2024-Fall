package week3.examples;

public class NestedLoopExample2 {

	public static void main(String[] args) {
		for (int line = 1; line <= 5; line++) {
			for (int j = 1; j <= (5 - line); j++) {
				System.out.print(".");
			}
			for (int k = 1; k <= line; k++) {
				System.out.print(line);
			}
			System.out.println();
		}

	}

}
