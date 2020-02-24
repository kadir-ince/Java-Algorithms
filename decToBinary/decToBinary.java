/*
    girilen decimal sayıyı (10luk tabandaki sayıyı)
    binary'e çeviren program
*/

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dec => ");
        int dec = input.nextInt();
        
        String binary = "";
        String binaryReverse = "";
        int kalan = 0;
        int i = 0;
        while(dec > 0)
        {
            kalan = dec % 2;
            binary += kalan;
            dec /= 2;
            i++;
        }
        for (int j = binary.length()-1; j>=0 ;j--) 
        {
            binaryReverse += binary.charAt(j);
        }
        System.out.println(binaryReverse);
	}
}

