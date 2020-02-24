/*dosyaya 1 yazdır Scannerle oku*/
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) throws Exception
	{
		PrintWriter output=new PrintWriter(new File("input.txt"));
		output.write("1");
		output.close();
		Scanner input =new Scanner(new File("input.txt"));
		System.out.print(input.next());
		input.close();
	}
}
