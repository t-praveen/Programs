package programs;
import java.util.Scanner;

public class FirstAndLastDigitSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		int result = sumFirstAndLastDigit(number);
		System.out.println("The sum of the first and last digits of the given number is : "+result);
		sc.close();
	}
	public static int sumFirstAndLastDigit(int number)
	{
		int sum = 0 , firstdigit , lastdigit ;
		if(number < 0)
		{
			return -1;
		}
		//TO find the last digit of a number //
		lastdigit = number % 10 ;
		
		//Find the first digit by dividing n by 10 until n greater then 10
	    while(number >= 10)
	    {
	        number = number / 10;
	    }
		firstdigit = number ;
		
		//Calculating the sum of first digit and last digit//
		sum = firstdigit + lastdigit ;
		return sum ;
	}

}
