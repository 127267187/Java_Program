package Practice;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		int num = 19791;
		
		int a = num;
		
		int rev = 0;
		
		while(num!=0) 
		{
			rev = rev*10 + num %10;
			num = num/10;
		}
		
		if(a==rev) 
		{
			System.out.println("This is palindrom no " + rev);
		} 
		else
		{
			System.out.println("This is not Palindrome no " + rev);
		}
	}

}
