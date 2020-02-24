import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(new File("Person.txt"));
		while(read.hasNextLine())
		{
			Person person = new Person(read.nextLine());
			System.out.println("I am " + person.toString());
		}
		read.close();
	}
}
