//Change Case of a STRING//

package Recursion;
import java.util.Scanner;

public class ChangeCases {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String in Lowercase to convert it into Uppercase : ");
		String str1 = sc.nextLine();
		System.out.print("Enter 2nd String in Uppercase to convert it into Lowerase: ");
		String str2 = sc.nextLine();
		LTOU(str1);
		UTOL(str2);
		sc.close();
	}
	public static void LTOU(String str1)
	{
		String result1 = str1.toUpperCase(); 
		System.out.println("Lowercase to Uppercase : "+result1);
	}
	public static void UTOL(String str2)
	{
		String result2 = str2.toLowerCase();
		System.out.println("Lowercase to Uppercase : "+result2);
	}

}
