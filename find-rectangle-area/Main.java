
/*
3-13 arası random sayı
13-26 arası random sayı
arraye  ata
alan hesapla
*/
public class FindArea {

	public static void main(String[] args) 
	{
		int[] arrayRectangle = new int[2];
		assignArray(arrayRectangle);
		int total = calculateArray(arrayRectangle);
		writeArrayAndTotal(arrayRectangle,total);
	}
	
	
	
	public static void assignArray(int[] arrayRectangle)
	{
		arrayRectangle[0] = (int)(3+Math.random()*10);
		arrayRectangle[1] = (int)(13+Math.random()*14);
	}
	
	public static int calculateArray(int[] arrayRectangle) {
		int area = arrayRectangle[0] * arrayRectangle[1];
		return area;		
	}
	
	public static void writeArrayAndTotal(int[] arrayRectangle,int total) 
	{
		System.out.println("Width = " + arrayRectangle[0]);
		System.out.println("Height = " + arrayRectangle[1]);
		System.out.println("\nArea = " + total);
	}
	

}
