package Practice;

public class PalindromeNumber_InBetween {
	
	public static void main(String[] args) {
		
		for(int i = 11; i<500; i++) 
		{
			int a = i, b=a;
			//int b = a;
			int rev = 0;
			int c;
			
			while(a!=0) 
			{
				c = a%10;
				rev = rev*10 + c;
				a = a/10;
			}
			
			if(b==rev) 
			{
				System.out.println(" This is a palindrome Number " + rev);
			}
			else 
			{
				System.out.println(" This is not palindrom Number " + rev);
			}
		}
		
	}

}
