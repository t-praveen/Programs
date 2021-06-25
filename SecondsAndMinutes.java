//SECONDS AND MINUTES PROGRAM//

package Recursion;
import java.util.Scanner ;

public class SecondsAndMinutes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter minutes : ");
		long minutes = sc.nextLong();
		System.out.print("Enter seconds : ");
		long seconds = sc.nextLong();
		System.out.println(getDurationString(minutes , seconds));
		System.out.println(getDurationString(3945L));
		sc.close();
	}
	public static String getDurationString(long minutes , long seconds)
	{
		if(minutes >=0 && (seconds >= 0 && seconds <= 59 ) )
		{
			long hours = minutes / 60 ;
			long remainingMinutes = minutes % 60 ;
			return hours + "h " + remainingMinutes +"m "+seconds +"s " ;
		}
		return "Invalid Value" ;
	}
	public static String getDurationString(long seconds)
	{
		if(seconds < 0)
			return "Invalid Value " ;
		long minutes = seconds / 60 ;
		long remainingSeconds = seconds % 60 ;
		return getDurationString(minutes , remainingSeconds) ;
	}
}
