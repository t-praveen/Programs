package programs;
import java.util.Scanner ;

public class GCDProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int secondNumber = sc.nextInt();
		int result = getGreatestCommonDivisor(firstNumber , secondNumber);
		System.out.println("The GCD of the 2 numbers is : "+result);
		sc.close();
	}
	public static int getGreatestCommonDivisor(int firstNumber , int secondNumber)
	{
		if(firstNumber >= 10 && secondNumber >= 10)
		{
			int gcd = 1 ;
			for(int i = 1 ; i <= firstNumber && i <= secondNumber ; i++)
			{
				if(firstNumber % i == 0 && secondNumber % i == 0)
				{
					gcd = i ;
				}
			}
			return gcd ;
		}
		return -1 ;
	}

}
