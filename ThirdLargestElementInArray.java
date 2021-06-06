//Program to find the 3rd largest Element in Array//

package Recursion;
import java.util.Scanner;

public class ThirdLargestElementInArray {

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
		System.out.println("Second Largest value in the array is : "+ThirdLargeElement(arr , n));
		sc.close();
	}
	public static int ThirdLargeElement(int arr[] , int n)
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
       return arr[n - 3];  
	}

}
