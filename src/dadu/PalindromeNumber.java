package dadu;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		                                                  //9754510 % 10   = 0
			int a = 188581;
			
			int b =a;
			                                               //9754510/10     = 975451
			int rev =0;
			
			int c;
			
			while(a!=0) 
			{
			   	c = a%10;       
			   	rev = rev*10 + c;        
			    a = a/10;           
			}
			
			if(b==rev)   
			{
				System.out.println("this is a palindrom num " + rev);
			}
			else 
			{
				System.out.println("this is not palindrom num " + rev);
			}
		
	}
}
