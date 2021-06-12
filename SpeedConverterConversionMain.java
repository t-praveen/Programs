package Recursion;
import java.util.Scanner ;

public class SpeedConverterConversionMain {

	    public static void main(String[] args) 
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter Kilometres : ");
	    	double k = sc.nextDouble();
	        long miles = SpeedConverter.toMilesPerHour(k);
	        System.out.println("Miles = " + miles);

	        SpeedConverter.printConversion(k);
	    }
}
