package programs;
import java.util.Scanner;

public class DiagonalStar {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		printSquareStar(number);
		sc.close();
	}
		 public static void printSquareStar(int number)
		 {
		        if( number < 5)
		        {
		            System.out.println("Invalid number");
		            return;
		        }

		        for (int row = 1; row <= number; row++)
		        {
		            for (int col = 1; col <= number; col++)
		            {
		                if (row == 1 || row == number || col == 1 || col == number)
		                {
		                    System.out.print("*");
		                } 
		                else if (row == col) 
		                {
		                    System.out.print("*");
		                } 
		                else if (col == (number - row + 1))
		                {
		                    System.out.print("*");
		                } 
		                else
		                    System.out.print(" ");
		            }// close inner loop
		            System.out.println();

		        }// close outter loop
		    }
}
