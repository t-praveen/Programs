package programs;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check wether it is palindrome or not : ");
		int number = sc.nextInt();
		System.out.println(isPalindrome(number));
		sc.close();
	}
	public static boolean isPalindrome(int number)
	{
		int r , sum = 0 , temp ;
		temp = number ;
		while(number != 0)
		{
			r = number % 10 ; 
			sum = (sum * 10) + r ;
			number = number / 10 ;
		}
		if(temp == sum)
			return true ;
		else
			return false;
	}

}
