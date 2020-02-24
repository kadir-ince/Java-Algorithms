import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Circle {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double area()
	{
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public static double area(int radius)
	{
		return Math.PI * Math.pow(radius, 2);
	}
}
