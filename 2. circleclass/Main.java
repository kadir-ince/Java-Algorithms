import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException
	{
		PrintWriter writer = new PrintWriter(new File("input.txt"));
		int random = (int) (10 + Math.random()*11);
		for(int i = 0; i < random; i++)
		{
			int randomRadius = (int) (5 + Math.random() * 11);
			writer.println(randomRadius);
		}
		writer.close();
		
		Scanner input = new Scanner(new File("input.txt"));
		while(input.hasNextInt())
		{
			int radius = input.nextInt();
			Circle circle = new Circle(radius);
			System.out.println(circle.area());
			System.out.println(Circle.area(radius));
		}
		input.close();
	}
}
