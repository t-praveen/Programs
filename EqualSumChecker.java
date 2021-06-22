//EQUAL SUM CHECKER//

package Recursion;
import java.util.Scanner;

public class EqualSumChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ") ;
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ") ;
		int b = sc.nextInt();
		System.out.print("Enter 3rd number : ") ;
		int c = sc.nextInt();
		boolean result = hasEqualSum(a , b , c) ;
		System.out.println(result);
		sc.close();

	}
	public static boolean hasEqualSum(int a , int b ,int c)
	{
		if((a + b) == c)
			return true ;
		return false ;
	}
}
