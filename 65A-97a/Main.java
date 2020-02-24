/******************************************************************************
while içinde kullanıcıdan her satırda 1 karakter okuyarak girilen karakter "." olana kadar işlem yapacak
alınan karakterleri fileoutputstream kullanarak text.txt içine yaz ve close
open this file with fileinputstream ile okuyup her değeri byte değer -> karakter karşılığı /97->a/ 

*******************************************************************************/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) throws Exception
	{
	    String file = "text.txt";
	    byte value;
	    String ch;
	    int i=0;
	    Scanner input = new Scanner(System.in);
		FileOutputStream outputFile = new FileOutputStream(new File(file));
		do
		{
		    System.out.println("Enter char:");
		    ch = input.next();
		    outputFile.write(ch.charAt(0));
		    
		} while(ch.charAt(0) != '.');
		outputFile.close();
		
		ch = "";
		FileInputStream inputFile = new FileInputStream(new File(file));
		do
		{
		   
		   value= (byte)inputFile.read();
		   if((char)value != '.')
		   {
		   System.out.println(value + " --> " + ((char)value));
		   }
		} while(((char)value) != '.');
		inputFile.close();
		
	}
}
