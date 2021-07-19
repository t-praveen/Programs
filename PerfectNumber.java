package programs;
import java.util.Scanner ;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check whether it is perfecct number or not : ");
		int number = sc.nextInt();
		System.out.println(isPerfectNumber(number));
		sc.close();
	}

	public static boolean isPerfectNumber(int number)
	{
		int sum = 1 ;
		if(number >= 1)
		{
			  for (int i = 2; i < number ; i++)
			  {      
		            if(number % i == 0) 
		            {
		                sum += i;
		            }
		        }
			  if(sum == number)
				  return true ;
		}
		return false ;
	}
}
