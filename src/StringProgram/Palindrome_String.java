package StringProgram;

import java.util.Scanner;

public class Palindrome_String {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String Value");
		
		String a = s.nextLine();
		
		String b = a;
		
		int count = b.length();
		
		String rev = "";
		
		for(int i = count-1; i>=0; i--) 
		{
			rev = rev + b.charAt(i);
		}
		
		System.out.println(rev);
		
		if(b.equals(rev)) 
		{
			System.out.println(rev + " Is palindrome string");
		}
		else
		{
			System.out.println(rev + " is not palindrome string ");
		}
	}

}
