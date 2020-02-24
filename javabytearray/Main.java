import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//bir tane dosya aç içine 10 tane byte ata sonra onu oku yaz fileinputsrtream ile yap
public class Main {
	public static void main(String[] args) throws IOException
	{
		FileOutputStream outputStream = new FileOutputStream(new File("input.txt"));
		for (int i = 0; i < 10; i++) 
		{
			byte b = (byte) (Math.random() * 11);
			outputStream.write(b);
		}
		outputStream.close();
		
		FileInputStream inputStream = new FileInputStream(new File("input.txt"));
		byte byteValue = 0;
		int count = 0;
		byte[] array = new byte[10];
		do 
		{
		    byteValue = (byte) inputStream.read();
			if (byteValue != -1) {
				array[count++] = byteValue;
			}
		}
		while (byteValue != -1) ;
		inputStream.close();
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}
}

