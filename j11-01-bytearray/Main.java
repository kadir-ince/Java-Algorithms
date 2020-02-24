import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
// random byte olarak hem dosyaya yaz hem array ikisinden de oku
public class Main
{
	public static void main(String[] args) throws Exception
	{
        FileOutputStream outputStream = new FileOutputStream(new File("input.txt"));
	    
		for (int i=0; i<15 ;i++ )
		{
		    byte number = (byte) (Math.random()*127); // byte 0-127 arasında alır (kapasitesi)
		    outputStream.write(number);
		}
        outputStream.close();
        
        System.out.println("in file:");
	    FileInputStream inputStream = new FileInputStream(new File("input.txt"));
        for (int i=0; i<15 ;i++ )
		{
		    System.out.print(inputStream.read() + " ");
		}
		inputStream.close();
		
		
		System.out.println("\nin array:");
		FileInputStream newInputStream = new FileInputStream(new File("input.txt"));
		byte[] byteArray = new byte[15];
		byte arrayNumber;
		for (int i=0; i<15 ;i++ )
		{
		     arrayNumber = (byte) newInputStream.read();
		     byteArray[i] = arrayNumber;
		     System.out.print(byteArray[i] + " ");
		}
		newInputStream.close();
	}
}
