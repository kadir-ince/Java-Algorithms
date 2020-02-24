import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException
	{
		PrintWriter writer = new PrintWriter(new File("input.txt"));
		for (int i = 0; i < 20; i++)
		{
			int random = (int) (Math.random() * 256);
			writer.println(random);
		}
		writer.close();
		
		Scanner input = new Scanner(new File("input.txt"));
		while(input.hasNextInt())
		{
			Int intConvert = new Int(input.nextInt());
			System.out.println("Hex : " + intConvert.toHex());
			System.out.println("Binary : " + intConvert.toBinary());
		}
		input.close();
	}
}
