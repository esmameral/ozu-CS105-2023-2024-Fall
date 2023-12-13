package homework3.q1;

public class Vehicle {
	private String color;
	private int numberOfDoors;
	private int numberOfTires;
	private int x;
	private int y;

	public Vehicle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.color = "White";
		
	}

	
	
	public void moveBy(int xMove, int yMove) {
		x+=xMove; 
		y+=yMove;
	}
	
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfTires() {
		return numberOfTires;
	}

	public void setNumberOfTires(int numberOfTires) {
		this.numberOfTires = numberOfTires;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	@Override
	public String toString() {
		return getClass().getSimpleName()+" [color=" + color + ", numberOfDoors=" + numberOfDoors + ", numberOfTires=" + numberOfTires
				+ ", x=" + x + ", y=" + y + "]";
	}

}
