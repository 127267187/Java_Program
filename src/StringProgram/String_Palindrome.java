package StringProgram;

public class String_Palindrome {
	
	public static void main(String[] args) {
		
//		String a = "madam";
//		
//		String rev = "";
//		
//		int count  = a.length();
//		
//		for(int i = count-1; i>=0; i--) 
//		{
//			rev = rev + a.charAt(i);
//			
//		}
//		
//		if(a.equals(rev)) 
//		{
//			System.out.println(rev + " String is palindrome");
//		}
//		else 
//		{
//			System.out.println(rev + " String is not palindrome");
//		}
		
		
//============================OR==================================//
		
		String str = "madam";
		
		StringBuilder sb = new StringBuilder(str);
		
		StringBuilder revString = sb.reverse();
		
		String str2 = revString.toString();
		
		if(str.equals(str2)) 
		{
			System.out.println(str2 + " is palindrome string");
		}
		else 
		{
			System.out.println(str2 + " is not palindrome string");
		}
		
	}

}
