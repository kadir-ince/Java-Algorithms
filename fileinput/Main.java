/*5 adewt sayı  diziye ata diziden byte dosyaya yaz scannerle oku okudugunda aski*/
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class Main
{
	public static void main(String[] args) throws Exception
	{
        Scanner input=new Scanner(System.in);	
		int [] numberarray =new int [5]; 
		System.out.print("enter five number");
		for(int i=0;i<5;i++)
		{
		    numberarray[i]=input.nextInt();
		}
		FileOutputStream writeByte=new FileOutputStream(new File("input.txt"));
		for(int i=0;i<5;i++)
		{
		    writeByte.write(numberarray[i]);
		    
		}
		writeByte.close();
		FileInputStream readFile=new FileInputStream(new File("input.txt"));
		int i=0;
		do
		{
		    i=readFile.read();
		    if(i!=-1)
		    {
		        System.out.print(i);
		    }
		}while(i>-1);
		
	}
}
