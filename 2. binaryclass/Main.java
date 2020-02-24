import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("input.txt"));
		while(input.hasNextLine())
		{
		    String binaryStr = input.nextLine();
			Binary binary = new Binary(binaryStr);
			System.out.println(binaryStr + " normal method : " + binary.toDec());
			System.out.println(binaryStr + " static method : " + Binary.toDec(binaryStr));
		}
		input.close();
	
	}
}
