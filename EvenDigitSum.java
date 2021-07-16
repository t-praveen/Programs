package programs;

import java.util.Scanner;

public class EvenDigitSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		int result = getEvenDigitSum(number);
		System.out.println("The sum of the even digits of the given number is : "+result);
		sc.close();
	}

	public static int getEvenDigitSum(int number)
	{
		if(number < 0)
		{
			return -1;
		}
		int lastDigit = 0;
	    int evenDigitSum = 0;

	    // loop to repeat the process
	    while(number != 0) 
	    {
	       // find last digit
	       lastDigit = number % 10;

	       // check last digit even?
	       if(lastDigit % 2 == 0) 
	       {
	           // add it to sum
	           evenDigitSum += lastDigit;
	       }

	       // remove last digit of number
	       number = number / 10;
	    }

	    // return sum value
	    return evenDigitSum;
	  }
}

