package homework3.q1;

public class Test {
	public static void main(String[] args) {
		// Rule 6: Instances of these classes are created by giving their x and y positions.
		Vehicle vehicle = new Vehicle(5, 10);
		// Rule 1: All Vehicles are white by default.
		
		System.out.println(vehicle);
		// Rule 2: ii. A Vehicle can move by a specific distance in x and y directions.
		// For instance, a Vehicle object herbie can move 100 meters in x-axis by
		// calling its method herbie.moveBy(100,0).
		vehicle.moveBy(20, 30);
		System.out.println(vehicle);
		
		SportsCar sCar=new SportsCar(2, 20);
		// Rule 3: All cars have four tires and four doors by default.
		// Rule 4: All sports cars are red and have only two doors.
		System.out.println(sCar);

		// Rule 5: All hatchback cars have five doors and their color is black by default.
		HatchbackCar hCar=new HatchbackCar(40, 20);
		System.out.println(hCar);
		
	}
}
