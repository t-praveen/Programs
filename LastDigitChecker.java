package programs;
import java.util.Scanner;

public class LastDigitChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int secondNumber = sc.nextInt();
		System.out.print("Enter 3rd number : ");
		int thirdNumber = sc.nextInt();
		System.out.println(hasSameLastDigit(firstNumber , secondNumber , thirdNumber));
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		System.out.println(isValid(number));
		sc.close();
	}
	public static boolean hasSameLastDigit(int firstNumber , int secondNumber , int thirdNumber)
	{
		 if((firstNumber >= 10 && firstNumber <= 1000) && (secondNumber >= 10 && secondNumber <= 1000) && (thirdNumber >= 10 && thirdNumber <= 1000))
		 {
			 int firstNumberLastDigit = firstNumber % 10;
			 int secondNumberLastDigit = secondNumber % 10;
			 int thirdNumberLastDigit = thirdNumber % 10;
			 return ((firstNumberLastDigit == secondNumberLastDigit) || (firstNumberLastDigit == thirdNumberLastDigit) || (secondNumberLastDigit == thirdNumberLastDigit));
		 }
		 return false ;
	}
	public static boolean isValid(int number)
	{
		if(number >= 10 && number <= 1000)
		{
			return true ;
		}
		return false ;
	}

}
