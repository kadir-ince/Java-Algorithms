/*
	. girilene kadar her seferinde kelime alıyor 
	aldığı kelimeyi . değilse arrayList'e ekliyor 
	daha sonra hangisini silmek istediğini soruyor 
	ordaki stringi yazıyorsun (index değil)
	sonra bir index girmeni istiyor girdiğin indexdeki elemanı veriyor
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		String newSentence = "";
		char c = 'a';
		while (c != '.')
		{
			System.out.print("Enter a word => ");
			newSentence = input.next();
			c = newSentence.charAt(newSentence.length()-1);
			System.out.println();
			
			if(!newSentence.equals("."))
			{
				list.add(newSentence);
			}
		}
		
		System.out.println(list.toString());
		
		System.out.print("Which one do you want to delete =>");
		String delete = input.next();
		int location = list.indexOf(delete);
		list.remove(location);
		
		System.out.println(list.toString());
		
		System.out.print("Enter an index => ");
		int index = input.nextInt();
		System.out.println();
		System.out.println("At index" + index + " : " + list.get(index));
		
		System.out.println("Size of the list : " + list.size());
	}
}
