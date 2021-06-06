//Print Array in REVERSE ORDER//

package Recursion;
import java.util.Scanner;

public class PrintArrayReverseOrder {

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
		RevArray(arr , n);
		sc.close();
	}
	public static void RevArray(int arr[] , int n)
	{
		System.out.print("Content of the array in reverse order : ");
		for(int i = n - 1 ; i >= 0 ; i--)
		{
			System.out.println(arr[i]);
		} 
	}
}
