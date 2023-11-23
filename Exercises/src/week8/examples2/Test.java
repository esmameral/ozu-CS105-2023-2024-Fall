package week8.examples2;

public class Test {

	public static void main(String[] args) {
//		Vehicle vehicle=new Honda();
//		System.out.println(vehicle.toString());

		Honda v = new Honda("34EEE67", 2020, "Adonis");

		System.out.println(v.getPlateNumber() + " " + v.getName() + " " + v.getYear());
		System.out.println(v.getBrand());

	}

}
