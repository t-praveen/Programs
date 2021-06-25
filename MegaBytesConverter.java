//MEGABYTES CONVERTER PROGRAM//

package Recursion;
import java.util.Scanner ; 

public class MegaBytesConverter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter KiloBytes : ") ;
		int KiloBytes = sc.nextInt();
		printMegaBytesAndKiloBytes(KiloBytes);
		sc.close();
	}
	public static void printMegaBytesAndKiloBytes(int KiloBytes)
	{
		if( KiloBytes < 0 )
			System.out.println("Invalid Value");
		else
		{
			 int megabytes = ( KiloBytes / 1024 ) ;
	         int kiloRemainder = ( KiloBytes % 1024 ) ;
	         System.out.println(KiloBytes+" KB = "+megabytes+" MB and "+kiloRemainder+" KB");
		}
	}

}
