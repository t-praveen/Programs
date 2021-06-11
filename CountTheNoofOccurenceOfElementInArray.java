//Count The No. of occurence Of Element In the Array//

package Recursion;
import java.util.Scanner ;

public class CountTheNoofOccurenceOfElementInArray {

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
		System.out.print("Enter the number you want to search : ");
		int number = sc.nextInt();
		System.out.print("Content of the array : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("The number of occurence of "+number+" in the array is : "+OccurenceOfElementInArray(arr , n , number));
		sc.close();
	}
	public static int OccurenceOfElementInArray(int arr[] , int n , int number )
	{
		int count = 0 ;
		for(int i = 0 ; i< n ; i++ )
		{
			if( number == arr[i] )
			{
				count++ ;
			}
		}
		return count ;
		
	}

}
