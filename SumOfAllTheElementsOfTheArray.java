//SUM OF ALL THE ELEMENTS OF THE ARRAY //

package Recursion;
import java.util.Scanner ;

public class SumOfAllTheElementsOfTheArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no . of elements to be entered in the array : ");
		int n = sc.nextInt();
		System.out.print("Enter the elements into the array : ");
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The sum of all the elements in the array is : "+Sum( arr , n ));
		sc.close();
	}
	public static int Sum(int arr[] , int n )
	{
		int sum = 0 ;
		for(int i = 0 ; i < n ; i++)
		{
			sum += arr[i] ;
		}
		return sum ;
	}

}
