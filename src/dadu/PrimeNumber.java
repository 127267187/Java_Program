package dadu;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int a = 38;   
		
		int b = 0;
		
		for(int i=2; i<a; i++) 
		{
			if(a%i==0) 
			{
				b = b+1;
			}
		}
		
		if(b==0) 
		{
			System.out.println("prime number " + a);
		}
		else 
		{
			System.out.println("not prime " + a);
		}
		
	}

}
