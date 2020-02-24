// bi hex 4binary 2hec string oku ayrıştır hec'e çevir  topla A101023

// eksik gece tamamla! 
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter = ");
		String s = input.nextLine();
		input.close();
		
		char hex = 0;
		String binary = "";
		String dec = "";
		for(int i=0; i<s.length();i++)
		{
			if(i<1)
			{
				hex = s.charAt(i);
			}
			else if(i>0 && i<5)
			{
				binary += s.charAt(i);
			}
			else if(i>4)
			{
				dec += s.charAt(i);
			}
		}
		
		
		int hexValue ;
		if(hex >= '0' && hex <='9')
		{
		    hexValue = hex - '0';
		}
		else 
		{
		    hexValue = hex - 'A'+10;
		}
		
		
		int totalBinary =0,temp=0;
		for(int i = 0; i< binary.length(); i++)
		{
			int x = (int)binary.charAt(i) -'0';
			for(int j = i; j>=0; j--)
			{
			    temp=(int)binary.charAt(j) -'0';
			}
			    totalBinary += temp*loop(2,i);
		}

		int decValue = 0;
		for(int i = 1; i>=0 ; i--)
		{
			if(i == 1)
			{
			    decValue += (int)dec.charAt(i)-'0';
			}
			if(i == 0)
			{
			    decValue += ((int)dec.charAt(i)-'0')*10;
			}
		}
		int total = hexValue + totalBinary + decValue;
		
		System.out.println("hex = " +hexValue);
		System.out.println("binary = " +totalBinary);
		System.out.println("dec = " +decValue);
		System.out.println("\nTotal = " + total);
	}
	
	public static int loop(int x, int y)
	{
	    int a = 1;
	    if(y == 0)
	    {
	        return 1;
	    }
	    else 
	    {
	        for(int i=0; i<y; i++)
	        {
	            a *= x;
	        }
	    }
	    return a;
	}

}



