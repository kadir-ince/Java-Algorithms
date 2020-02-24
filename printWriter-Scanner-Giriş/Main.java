/******************************************************************************
önce printwriter kullanılarak dosyaya yazdırma yapılıyor
sonra scanner kullanılarak okuma yapılıyor
*******************************************************************************/
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Main
{
	public static void main(String[] args) throws Exception
	{
	    String fileName = "text.txt";
	    
	    PrintWriter printFile = new PrintWriter(new File(fileName));
	    System.out.println("Writing bytes using PrintWriter");
	    printFile.print("ABab");
	    printFile.close();
		System.out.println("completed writing bytes ");
		
        System.out.println("\nusing scanner to read");
        Scanner scanfile = new Scanner(new File(fileName));
		System.out.println("reading as text: \""+ scanfile.nextLine()+ "\"");
		scanfile.close();


		
	}
}
