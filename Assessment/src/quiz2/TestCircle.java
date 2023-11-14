package quiz2;

public class TestCircle {

	public static void main(String[] args) {
		Point p1=new Point(6,-6);
		Circle c1=new Circle(-1,-3,6);
		System.out.println(p1+" is "+c1.positionOfPoint(p1)+c1);
		
		Point p2=new Point(-4,3);
		Circle c2=new Circle(-2,1,3);
		System.out.println(p2+" is "+c2.positionOfPoint(p2)+c2);
		
		Point p3=new Point(5,15);
		Circle c3 = new Circle(5, 5, 10);
		System.out.println(p3+" is "+c3.positionOfPoint(p3)+c3);
		
		Circle c4 = new Circle(5, 5, 10);
		Circle c5 = new Circle(5, 5, 1);
		
		System.out.println(c3.equals(c4));
		System.out.println(c4.equals(c5));
	}

}
