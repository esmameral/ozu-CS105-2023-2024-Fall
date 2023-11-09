package week6.examples.test;

import week6.examples.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1=new Circle(10);
		//c1.calculateArea();//Because method is private
		System.out.println("Circle Count:"+Circle.getNumberOfObjects());
		System.out.println(c1.getArea());
		for(int i=1;i<=5;i++) {
			Circle aCircle=new Circle(Math.random()*20);
			//aCircle.calculateArea();
			//System.out.println(aCircle.toString());//Same
			System.out.println(aCircle);
			System.out.println("Circle Count:"+Circle.getNumberOfObjects());
		}
		System.out.println("Circle Count:"+Circle.getNumberOfObjects());
		

	}

}
