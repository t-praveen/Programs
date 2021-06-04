package Recursion;
import java.util.Scanner;

public class ChartoASCIIandASCIItoChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character to display its ASCII Value : ");
		char ch = sc.next().charAt(0);
		System.out.print("Enter a ASCII value to display its character value : ");
		int n = sc.nextInt();
		System.out.println("Character to ASCII : "+CharactertoASCII(ch));
		System.out.println("ASCII to Character : "+ASCIItoCharacter(n));
		sc.close();
	}
	public static int CharactertoASCII(char ch)
	{
		return (int)ch ;
	}
	public static char ASCIItoCharacter(int n)
	{
		return (char)n ;
	}

}
