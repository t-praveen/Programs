//COVERSION OF MINUTES TO YEARS AND DAYS//

package Recursion;
import java.util.Scanner ;

public class MinutesToYearsAndDaysCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Minutes : ");
		long minutes = sc.nextLong();
		printYearsAndDays(minutes);
		sc.close();
	}
	public static void printYearsAndDays(long minutes)
	{
		if( minutes < 0 )
		{
			System.out.println("Invalid Value");
		}
		else
		{
			long minutesInYear = 60 * 24 * 365 ;
			long years = (long) (minutes / minutesInYear);
			int days = (int) (minutes / 60 / 24) % 365;
	    
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
		}
	}

}
