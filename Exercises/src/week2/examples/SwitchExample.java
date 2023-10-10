package week2.examples;

/**
 * 
 */
public class SwitchExample {

	public static void main(String[] args) {
		int i = 2;
		switch (i) {
		case 1:
			System.out.println("1");
		case 3:
			System.out.println("3");
		case 2:
			System.out.println("2");
		case 5: {
			System.out.println("5");
			break;
		}
		default:
			System.out.println("default");
		}

		System.out.println("after the switch block");


	}
}
