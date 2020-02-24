/******************************************************************************

mevsimler (season) enum{spring..} tanımla 
kullanıcıdan başlangıç season değerini oku (yazı)
do-while ile o mevsimden başlayarak summer'a kadar tüm değerleri yazdır

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    enum Season{
        SPRING,
        SUMMER,
        FALL,
        WINTER
    }
    
	public static void main(String[] args) 
	{
	    
		System.out.println("Enter season: ");
		System.out.println("1-Spring ");
		System.out.println("2-Summer ");
		System.out.println("3-Fall ");
		System.out.println("4-Winter ");
		
		Scanner input = new Scanner(System.in);
		int season = input.nextInt();
		
		    switch(season)
		    {
		        case 1: 
		            System.out.println(Season.SPRING);
		            System.out.println(Season.SUMMER); break;
		        case 2: 
		            System.out.println(Season.SUMMER); break;
		        case 3: 
		            System.out.println(Season.FALL);
		            System.out.println(Season.WINTER);
		            System.out.println(Season.SPRING);
		            System.out.println(Season.SUMMER); break;
		        case 4: 
		            System.out.println(Season.WINTER);
		            System.out.println(Season.SPRING);
		            System.out.println(Season.SUMMER); break;
		    }
		 
		    
            Season nowSeason = Season.SPRING;
            switch(season)
	        {
	            case 1: nowSeason = Season.SPRING; break;
	            case 2: nowSeason = Season.SUMMER; break;
	            case 3: nowSeason = Season.FALL; break;
	            case 4: nowSeason = Season.WINTER; break;
	            default: System.out.println("Incorrect input"); break;
	        }
	        
	        int i;
		    do
		    {
		        for (i = season; i != 2 ; i++ )
		        {
                    System.out.println(nowSeason);
                    nowSeason = nextSeason(nowSeason);
                    System.out.println (nowSeason);
		        }
		    }while(i!=2);
	}
	
	
	public static Season nextSeason(Season atSeason)
	{
	    Season returnSeason = atSeason;
	    switch(atSeason)
	    {
	        case SPRING: returnSeason = Season.SUMMER; break;
	        case SUMMER: returnSeason = Season.FALL; break;
	        case FALL: returnSeason = Season.WINTER; break;
	        case WINTER: returnSeason = Season.SPRING; break;
	        default:
	            System.out.println("Incorrect input"); break;
	    }
	    return returnSeason;
	    
	}
}
