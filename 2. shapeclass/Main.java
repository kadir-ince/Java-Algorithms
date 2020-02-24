import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		/*PrintWriter writer = new PrintWriter(new File("input.txt"));
		writer.println(25);
		writer.println(50);
		writer.println(75);
		writer.close();*/
		
		Scanner input = new Scanner(new File("input.txt"));
		while(input.hasNextInt())
		{
			Shape shape = new Shape(input.nextInt(), input.nextInt(), input.nextInt());
			System.out.println(shape.toString());
			System.out.println(shape.getCount());
		}
		input.close();
		
	}
}

