package Recursion;
import java.util.Scanner ;

public class LeapYearCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year to check wether it is leap year or not : ");
		int year = sc.nextInt();
		boolean result = isLeapYear(year);
		System.out.println(result);
		sc.close();
	}
	public static boolean isLeapYear(int year)
	{
		if( ( year < 1 ) || (year > 9999))
		{
			return false ;
		}
		if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
		{
			return true ;
		}
		else if(year % 4 == 0 && year % 100 != 0)
		{
			return true ;
		}
		return false ;
	}
}
