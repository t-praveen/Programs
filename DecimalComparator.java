package Recursion;
import java.util.Scanner;

public class DecimalComparator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		double n1 = sc.nextDouble();
		System.out.print("Enter 2nd number : ");
		double n2 = sc.nextDouble();
		boolean result = areEqualByThreeDecimalPlaces(n1 , n2);
		System.out.println(result);
		sc.close();
	}
	public static boolean areEqualByThreeDecimalPlaces(double n1 , double n2)
	{
		int a = (int)(n1 * 1000);
		int b = (int)(n2 * 1000);
		if(a == b )
		{
			return true ;
		}
		return false ;
	}
}
