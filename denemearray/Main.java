import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Main
{
	public static void main(String[] args) throws Exception
	{
        PrintWriter output = new PrintWriter(new File("input.txt"));    
		int rnd ;
		//5 tane 0-10 arası random sayı oluştur printwriter ile yaz
		for(int i=0; i<5; i++)
		{
    		rnd = (int)(Math.random()*10);
    		output.print(rnd);
    		System.out.print(rnd + " ");
		}
		// dosyada bir alt satıra in 
		output.print("\n");
		System.out.println();
		//5 tane 0-10 arası random sayı oluştur printwriter ile yaz
		for(int i=0; i<5; i++)
		{
    		rnd = (int)(Math.random()*10);
    		output.print(rnd);
    		System.out.print(rnd + " ");
		}
		output.close();
		//1. satırdaki sayılardan kaç tane var bul
		Scanner input = new Scanner(new File("input.txt"));
		String firstLine = input.nextLine();
		String secondLine = input.nextLine();
		System.out.println();
		input.close();
		int[] count = new int[5];
		for(int i=0; i<5; i++)
		{
		    for(int j=0; j<5; j++)
    		{
    		    if(firstLine.charAt(i) == secondLine.charAt(j))
    		    {
    		        count[i]++;
    		    }
    		}
		}
		for(int i = 0; i<5; i++)
		{
		    System.out.println(firstLine.charAt(i) + "= "+ count[i]);
		}
	}
}
