package Practice;

public class PrimeNo_SingleValue {
	
	public static void main(String[] args) {
		
//		int a = 17;
//		int b = 1;
//		
//		for(int i = 2; i<a; i++) 
//		{
//			if(a%i==0) 
//			{
//				b=b+1;
//			}
//		}
//		
//		if(b==1) 
//		{
//			System.out.println("No is prime " + a);
//		}
//		else 
//		{
//			System.out.println("No is not prime " + a);
//		}
//		
		
		for(int i=50; i<=100; i++) 
		{
			int a = i , b=1 , j;
			
			for(j=2; j<i; j++ ) 
			{
				if(i%j==0) 
				{
					b = b +1;
				}
			}
			if(b==1) 
			{
				System.out.println("prime " + i);
			}
		}
	}

}
