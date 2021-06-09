//Showing Elements of Matrix //

package Recursion;
import java.util.Scanner ;

public class ShowingElementsOfMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no . of rows : ");
		int m = sc.nextInt();
		System.out.print("Enter no . of  columns : ");
		int n = sc.nextInt();
		int a[][] = new int[m][n] ;
		System.out.print("Enter elements into the matrix : ");
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		Matrix(a , m , n);
		sc.close();
	}
	public static void Matrix(int a[][] , int m , int n)
	{
		System.out.println("Given matrix is : ");
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}

