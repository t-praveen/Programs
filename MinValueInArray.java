//Program to find the Minimum Element in Array//

package Recursion;
import java.util.Scanner;

public class MinValueInArray {

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
		System.out.println("Second Largest value in the array is : "+SmallElement(arr , n));
		sc.close();
	}
	public static int SmallElement(int arr[] , int n)
	{
		int temp ;
		for (int i = 0; i < n ; i++)   
        {  
            for (int j = i + 1; j < n ; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
       return arr[0];  
	}

}
