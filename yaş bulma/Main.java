// kullanıcıdan bulunduğu yılı al doğduğu yılı al yaşını hesapla hepsini fonksiyonla
import java.util.Scanner;
public class Main
{
    static Scanner input = new Scanner(System.in);

	public static void main(String[] args) 
	{
	    System.out.println("Şuanki yılı girin");
	    int atNowYear = inputNowYear();
	    System.out.println("Doğum yılınızı girin");
	    int birthYear = inputBirthYear();
	    System.out.println("Sonuç:");
        int calcAge = calculateAge(atNowYear,birthYear);
        printAge(calcAge);
	}
	
	public static int inputNowYear() 
	{
	    int inputYear = input.nextInt();
	    return inputYear;
	}
	
	public static int inputBirthYear()
	{
	    int birthYear = input.nextInt();
	    return birthYear;
	}
	
	public static int calculateAge(int year, int birthYear)
	{
	    int age = year - birthYear;
	    return age;
	}
	
	public static void printAge(int calcAge)
	{
	    System.out.println(calcAge);
	}
}

