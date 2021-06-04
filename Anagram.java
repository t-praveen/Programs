//Anagram - An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “abcd” and “dabc” are an anagram of each other. //

package Recursion;
import java.util.Scanner ; 
import java.util.Arrays ;

public class Anagram {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter first String: ");
	    String str1 = input.nextLine();
	    System.out.print("Enter second String: ");
	    String str2 = input.nextLine();
	    if(str1.length() == str2.length())
	    {
	      char[] charArray1 = str1.toCharArray();
	      char[] charArray2 = str2.toCharArray();
	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);
	      boolean result = Arrays.equals(charArray1, charArray2);

	      if(result) {
	        System.out.println(str1 + " and " + str2 + " are anagram.");
	      }
	      else {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	      }
	    }
	    else 
	    {
	    	System.out.println(str1 + " and " + str2 + " are not anagram.");
	    }

	    input.close();
	 }
}

	   
