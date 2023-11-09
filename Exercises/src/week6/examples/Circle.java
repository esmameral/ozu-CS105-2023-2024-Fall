package week6.examples;

public class Circle {
	private static int numberOfObjects =0;
	private double radius;
	private double area;
	public Circle(double radius) {
		this.radius=radius;
		calculateArea();
		numberOfObjects++;
		
		
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	private void calculateArea() {
		area=radius*radius*Math.PI;
	}
	
	public String toString() {
		return "Radius:"+radius+" Area:"+area;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	

}
