package homework1;

public class Question2_SimpleSolution {

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			for (int j = 0; j <= 8 - i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("  " + (int) Math.pow(3, j));
			}
			for (int j = i - 2; j >= 0; j--) {
				System.out.print(" " + (int) Math.pow(3, j));
			}
			System.out.println();
		}
	

}
}
