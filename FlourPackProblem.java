package programs;
import java.util.Scanner ;

public class FlourPackProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter big count : ");
		int bigCount = sc.nextInt();
		System.out.print("Enter small count : ");
		int smallCount = sc.nextInt();
		System.out.print("Enter goal : ");
		int goal = sc.nextInt();
		System.out.println(canPack(bigCount , smallCount , goal));
		sc.close();
	}
	 public static boolean canPack(int bigCount, int smallCount, int goal) {
	        if (bigCount < 0 || smallCount < 0 || goal < 0) {
	            return false;
	        }
	        if(goal > ((bigCount * 5) + smallCount)) {
	            return false;
	        }

	        if((goal % 5) > smallCount) {
	            return false;
	        }
	        return true;
	    }

}
