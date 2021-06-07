//To Print Odd And Even numbers in an array //

package Recursion;
import java.util.Scanner;

public class PrintOddAndEvenNumbersInAnArray {

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
		System.out.println("Content of the array : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(arr[i]);
		} 
		EvenNumbers(arr , n);
		OddNumbers(arr , n);
		sc.close();
	}
	public static void EvenNumbers(int arr[] , int n)
	{
		int i = 0 ;
		System.out.println("Even Numbers : ");
		for( i = 0 ; i < n ; i++ )
		{
			if(arr[i] % 2 == 0 )
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void OddNumbers(int arr[] , int n)
	{
		int i = 0 ;
		System.out.println("Odd Numbers : ");
		for( i = 0 ; i < n ; i++ )
		{
			if(arr[i] % 2 != 0 )
			{
				System.out.println(arr[i]);
			}
		}
	}
}
