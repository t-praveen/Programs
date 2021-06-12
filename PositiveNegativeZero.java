package Recursion;
import java.util.Scanner ;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check wether it is positive or negative or zero : ");
		int number = sc.nextInt();
		PNZ(number);
		sc.close();
	}
	public static void PNZ(int number)
	{
		if( number > 0 )
			System.out.println("Positive");
		else if( number < 0 )
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}

}
