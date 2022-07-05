package Practice;

public class PrimeNo_InBetween {
	
	public static void main(String[] args) 
	{
		int a;
		int b;
		int c ;
		
		for(a = 20; a<=200; a++)
		{
			c = 1;
			for(b=2; b<a; b++) 
			{
				if(a%b==0) 
				{
					c = c+1;
				}
			}
			
			if(c==1) 
			{
				System.out.println("No is Prime" + a);
			}
			else
			{
				System.out.println("no is not prime" + a);
			}
			
		}
		
	}

}
