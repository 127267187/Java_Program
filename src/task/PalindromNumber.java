package task;

public class PalindromNumber {
	
	public static void main (String [] args) 
	{
		
		int org_Number = 18181;
		
		int num = org_Number;
		
		int rev = 0;
		
		while(num!=0) 
		{
			rev = rev*10 + num%10;
			
			num = num/10;
		}
		
		if(num==rev) 
		{
			System.out.println(rev + " This is Palindrome Number");
		}
		else 
		{
			System.out.println(rev + " This is not Palindrome Number");
		}
	}

}
