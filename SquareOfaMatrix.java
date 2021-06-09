//Square of a matrix //

package Recursion ;
import java.util.Scanner;

public class SquareOfaMatrix {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no . of rows : ");
		int m = sc.nextInt();
		System.out.print("Enter no . of  columns : ");
		int n = sc.nextInt();
		int a[][] = new int[m][n] ;
		int b[][] = new int[m][n] ;
		System.out.print("Enter elements into the matrix : ");
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		Square(a ,b , m , n);
		sc.close();
	}
	public static void Square(int a[][] , int b[][]  , int m , int n)
	{
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				int k = 0 ;
				for( k = 0 ; k < m ; k++)
				{
					b[i][j] = b[i][j] + ( a[i][k] * a[k][j] ) ;
				}
			}
		}
		System.out.println("The Square of matrix is : ");
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
