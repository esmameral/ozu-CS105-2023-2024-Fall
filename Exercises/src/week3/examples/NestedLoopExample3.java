package week3.examples;

public class NestedLoopExample3 {

	public static void main(String[] args) {
		for (int line = 1; line <= 5; line++) {
			for (int j = 1; j <= (5 - line); j++) {
				System.out.print(".");
			}
			System.out.print(line);
			for (int k = 1; k <= line-1; k++) {
				System.out.print(".");
			}
			System.out.println();
		}

	}

}
