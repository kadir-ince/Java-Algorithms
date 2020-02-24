/*
2 dizinin çarpımı:
1 3 2 4 5
4 2 5 2 6
4 6 10 8 30
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] firstArray = new int[5];
		int[] secondArray = new int[5];
		int[] totalArray = new int[5];
		System.out.println("Enter first array:");
		for(int i = 0; i<5; i++)
		{
		    firstArray[i] = input.nextInt();
		}
		
		
		System.out.println("Enter second array:");
		for(int i = 0; i<5; i++)
		{
		    secondArray[i] = input.nextInt();
		}
		
		//çarpım işlemi
		for(int i = 0; i<5; i++)
		{
            totalArray[i] = firstArray[i] * secondArray[i];	    
		}
		
		//yazdırma işlemi 
		System.out.println("Total Array: ");
		for(int i = 0; i<5; i++)
		{
		    System.out.print(totalArray[i] + " ");
		}
	}
}


