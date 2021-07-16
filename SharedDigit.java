package programs;
import java.util.Scanner;

public class SharedDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int secondNumber = sc.nextInt();
		System.out.println(hasSharedDigit(firstNumber , secondNumber));
		sc.close();
	}
	public static boolean hasSharedDigit(int firstNumber , int secondNumber)
	{
		 if((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)) 
		 {
	            int firstNumberLastDigit = firstNumber % 10;
	            int secondNumberLastDigit = secondNumber % 10;
	            firstNumber /= 10;
	            secondNumber /= 10;
	            int firstNumberFirstDigit = firstNumber;
	            int secondNumberFirstDigit = secondNumber;
	            System.out.println("Is there any shared digit in both given numbers?");
	            return ((firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit == secondNumberLastDigit) || (firstNumberLastDigit == secondNumberFirstDigit) || (firstNumberLastDigit == secondNumberLastDigit));
	        }
	        System.out.println("Invalid input.");
	        return false;
	}
}
