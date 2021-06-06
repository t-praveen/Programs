//SORTING OF ARRAY IN DESCENDING ORDER//

package Recursion;
import java.util.Scanner;

public class SortingArrayInDescendingOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		System.out.print("Enter the elements into the array : ");
		int arr [] = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Content of the Unsorted array : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(arr[i]);
		}
		DESCENDINGARRAY(arr , n);
		sc.close();
	}
	public static void DESCENDINGARRAY(int arr[] , int n)
	{
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = i + 1 ; j < n ; j++)
			{
				if(arr[i] < arr[j])
				{
					int t = arr[i] ;
					arr[i] = arr[j] ; 
					arr[j] = t ;
				}
			}
		}
		System.out.println("After Sorting in DESCENDING ORDER , the array is : ");
		{
			for(int i = 0 ; i < n ; i++)
			{
				System.out.println(arr[i]+ " ");
			}
		}
	}
}
