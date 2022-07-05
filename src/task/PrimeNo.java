package task;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		int a = 15;
		
		int b = 1;
		
		for(int i = 2; i<a; i++) 
		{  
			
			if(a%i==0) 
			{
				b=b+1;
			}
			
		}
		
		    if(b==1) 
		    {
		    	System.out.println("No is prime "+ a);
		    }
		    else 
		    {
		    	System.out.println("No Not Prime " + a);

		    }
		
		
	}

}
