//FIND THE LARGEST ELEMEMT IN THE ARRAY//

package Recursion;
import java.util.Scanner;

public class MaxValueInArray {

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
		System.out.println("Maximum value in the array is : "+LargeElement(arr , n));
		sc.close();
	}
	public static int LargeElement(int arr[] , int n)
	{
		int max = arr[0] ;
		for(int i = 0 ; i < n ; i++)
		{
			if(max < arr[i])
			{
				max = arr[i] ;
			}
		}
		return max ;
	}
	
}
