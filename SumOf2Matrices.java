//Sum of 2 matrices //

package Recursion;
import java.util.Scanner;

public class SumOf2Matrices {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no . of rows : ");
		int m = sc.nextInt();
		System.out.print("Enter no . of  columns : ");
		int n = sc.nextInt();
		int a[][] = new int[m][n] ;
		int b[][] = new int[m][n] ;
		int c[][] = new int[m][n] ;
		System.out.print("Enter elements into the 1st matrix : ");
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter elements into the 2nd matrix : ");
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		Sum(a ,b , c , m , n);
		sc.close();
	}
	public static void Sum(int a[][] , int b[][]  , int c[][] , int m , int n)
	{
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				c[i][j] = a[i][j] + b[i][j] ;
			}
		}
		System.out.println("The sum of 2 matrices is : ");
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
	}
}
