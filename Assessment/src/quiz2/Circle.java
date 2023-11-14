package quiz2;

import java.util.Objects;

public class Circle {
	private int radius;
	private int centerX;
	private int centerY;
	public Circle(int centerX, int centerY,int radius) {
		super();
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
	}
	@Override
	public int hashCode() {
		return Objects.hash(centerX, centerY, radius);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return centerX == other.centerX && centerY == other.centerY && radius == other.radius;
	}
	
	public String positionOfPoint(Point p) {
		double distance=Math.sqrt(Math.pow((p.getX()-centerX),2)+Math.pow((p.getY()-centerY),2));
		if(distance>radius)
			return "Outside ";
		else if(distance<radius)
			return "Inside ";
		else
			return "On ";
		
	}
	@Override
	public String toString() {
		return "the circle C["+ centerX+","+ centerY+"] radius:"+radius;
	}

}
