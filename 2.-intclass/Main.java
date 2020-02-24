import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws IOException {
	    PrintWriter writer = new PrintWriter(new File("int.txt"));
		for(int i = 0; i < 100; i++)
		{
			int rnd = (int) (48 + Math.random() * 53);
			writer.print((char)rnd);
		}
		writer.close();
	    
		Scanner read = new Scanner(new File("int.txt"));
		String chrs = read.nextLine();
		for(int i = 0; i < chrs.length(); i++)
		{
			if ((chrs.charAt(i) >= '0') && (chrs.charAt(i) < '9'))
			{
				Int mInt = new Int(chrs.charAt(i));
				System.out.println(mInt.toString());
			}
		}
		read.close();
	}
}
