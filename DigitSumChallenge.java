package programs;   
import java.util.Scanner;  

public class DigitSumChallenge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		int result = sumDigits(number);
		System.out.println("The sum of the digits of the given number is : "+result);
		sc.close();
	}
	public static int sumDigits(int number)
	{
		int m , sum = 0 ;
		if(number < 10)
		{
			System.out.println("The entered number is less than 10/negative , so couldnt find sum. ");
			return -1 ;
		}
		while(number > 0)
		{
			m = number % 10;    
			sum = sum + m;    
			number = number/10; 
		}
		return sum ;
	}

}
