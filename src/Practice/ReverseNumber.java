package Practice;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int no = 5496;
		int rev = 0;
		int a;
		
//		while(no!=0) 
//		{
//			rev = rev*10 + no%10;
//			no =  no/10;
//		}
//		
//		System.out.println(rev);
		
		while(no!=0) 
		{
			a = no%10;
			rev = rev*10 + a;
			no = no/10;
		}
		System.out.println(rev);
	}

}
