import java.util.Scanner;
// dikdörtgen alan bulma
public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a short edge => ");
		float shortEdge = input.nextFloat();
		System.out.println("Enter a long edge2 => ");
		float longEdge = input.nextFloat();
		
		System.out.println("area : " + (shortEdge * longEdge));
		System.out.println("perimeter : " + (2*shortEdge + 2*longEdge));
	}
}
