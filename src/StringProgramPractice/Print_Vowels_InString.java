package StringProgramPractice;

import java.util.Scanner;                 // || ch== 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'

public class Print_Vowels_InString {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		str = str.toLowerCase();
		
		//int count = 0;
		
		System.out.println("The vowels in the given string are : ");
		
		for(char ch : str.toCharArray()) 
		{
			if(ch== 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) 
			{
				 System.out.print(ch + " ");
				//count++;
			}
			
		}
		//System.out.println(count);
	}

}
