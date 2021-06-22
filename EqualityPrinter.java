//EQUALITY PRINTER//

package Recursion;
import java.util.Scanner ;

public class EqualityPrinter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number : ");
		int c = sc.nextInt();
		printEqual(a , b , c);
		sc.close();
	}
	public static void printEqual(int a , int b , int c)
	{
		if( a < 0 || b < 0 || c < 0 )
			System.out.println("Invalid Value");
		else if (a == b && a == c)
			System.out.println("All numbers are equal");
		else if(a != b && b != c && b != c)
			System.out.println("All numbers are different");
		else
			System.out.println("Neither all are equal nor different");
		
	}

}
