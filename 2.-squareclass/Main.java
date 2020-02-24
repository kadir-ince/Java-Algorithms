import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Square square1 = new Square();
		
		System.out.println("Enter an edge => ");
		int edge = input.nextInt();
		square1.setEdge(edge);
		System.out.println("Entered edge : " + square1.toString());
		System.out.println("Perimeter : " + square1.primeter());
		System.out.println("Area : " + square1.area());
	}
}