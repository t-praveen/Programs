package programs;
import java.util.Scanner ; 

public class LargestPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		System.out.println(getLargestPrime(number));
		sc.close();
	}
	public static int getLargestPrime(int number)
	{
		if(number < 0 || number == 0 || number == 1)
		{
			return -1 ;
		}
		else
		{
			 int div = 2;  
			   while (div < number)
			   {  
				   if(number % div != 0) 
				   {  
					   div++;  
				   } 
				   else 
				   {  
					   number = number / div;  
					   div = 2;  
				   }	  
			   }  
			   return number;  
			  }  
		}  
}



