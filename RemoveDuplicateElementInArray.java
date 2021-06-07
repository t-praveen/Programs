//Remove duplicate element in an array //

package Recursion;
import java.util.Scanner;

public class RemoveDuplicateElementInArray {

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
		Duplicate(arr , n);
		/*System.out.println("The Original Array is : ");
		//int length = arr . length ;
		int length = Duplicate(arr , n) ;
		for(int i = 0 ; i < length ; i++)
		{
			System.out.println(arr[i]+" ");
		}*/
		sc.close();
	}
	public static void Duplicate(int arr[] , int n)
	{
		if (n == 0 || n == 1)
		{  
            System.out.println(n);  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for(int i = 0; i < n-1; i++)
        {  
            if (arr[i] != arr[i+1])
            {  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        for (int i= 0 ; i < j; i++)
        {  
            arr[i] = temp[i];  
        }  
        System.out.println("After Removing all the dulicates , The Original Array is : ");
        for(int i = 0 ; i < j ; i++)
		{
			System.out.println(arr[i]+" ");
		}
    }  
	
}
