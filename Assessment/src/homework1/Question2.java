package homework1;



public class Question2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8 - i; j++) {
				System.out.print("     ");
			}
			for (int j = 0; j < i; j++) {
				String number = (int) Math.pow(3, j) + "";
				switch (number.length()) {// you also can find the length without using String.length
				case 1:
					number = "   " + number;
					break;
				case 2:
					number = "  " + number;
					break;
				case 3:
					number = " " + number;
					break;
				}
				System.out.print(number + " ");
			}
			for (int j = i - 2; j >= 0; j--) {

				String number = (int) Math.pow(3, j) + "";

				switch (number.length()) {
				case 1:
					number = "   " + number;
					break;
				case 2:
					number = "  " + number;
					break;
				case 3:
					number = " " + number;
					break;
				}
				System.out.print(number + " ");

			}
			System.out.println();

		}

	
	
	}
}
