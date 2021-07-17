

package programs;
import java.util.Scanner;

public class AllFactors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		printFactors(number);
		sc.close();
	}
	public static void printFactors(int number)
	{
		if(number >= 1)
		{
			System.out.println("Factors of the entered number are: ");
			for (int i = 1 ; i <= number ; ++i) 
			{
		        	if (number % i == 0) 
		        	{
		        		System.out.println(i);
		        	}
		    }
		}
		else
			System.out.println("Inavlid Value");

	}
}
