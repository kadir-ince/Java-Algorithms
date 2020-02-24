import java.util.Scanner;
// girilen hex sayıyı tek tek dec hale çevirir
public class Main
{
	public static void main(String[] args) 
	{
		String hex = read();
		int binary = hexToBinary(hex);
	}
	
	static String read()
	{
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter hex number");
	    String s = input.next();
	    return s;
	}
	
	static int hexToBinary(String hexadecimal)
	{
	    int[] tempArray = new int[2];
	    int last = 0;
	    for(int i = 0; i<2; i++)
	    {
	        if(hexadecimal.charAt(i)>='0' && hexadecimal.charAt(i)<='9')
	        {
	            tempArray[i] = (int)hexadecimal.charAt(i)-'0';
	            toBinary(tempArray[i]);
	            
	        }
	        else if(hexadecimal.charAt(i)>='A' && hexadecimal.charAt(i)<='F')
	        {
	            tempArray[i] = (int)hexadecimal.charAt(i)-'A'+10;
	        }
	    }
	    
	    for(int i = 0; i<2; i++)
	    {
	        System.out.println(tempArray[i]);
	    }
	    
	    return 0;
	}
	
	static int toBinary(int hex)
	{
	    String x = "";
	    for(int i = 0; i<4; i++)
	    {
	        x += hex % 2;
	    }
	    return 0;
	}
}
