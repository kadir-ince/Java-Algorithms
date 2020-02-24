/*
Kaç satır yazdırsın =>                                                                                                                                                             
4                                                                                                                                                                                  
   *                                                                                                                                                                               
  **                                                                                                                                                                               
 ***                                                                                                                                                                               
****

*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Kaç satır yazdırsın => ");
		int line = input.nextInt();
		input.close();
		
		for(int i=1; i <= line; i++)
		{
		    int space;
		    for(space=0; space<line-i; space++)
		    {
		        System.out.print(" ");
		    }
		    
		    for(int star=0; star<line-space; star++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
	}
}
