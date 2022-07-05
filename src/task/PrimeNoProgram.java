package task;

import org.openqa.selenium.grid.Main;

public class PrimeNoProgram {
	// prime no between 1 to 200
	int a;
	int b;
	int c;
	
	public void m1() 
	{
		for(a=1; a<=100; a++)
		{
			c=1;
			for(b=2; b<a; b++) 
			{
				if(a%b==0)         
				{
					c=c+1;
					
				}
			}
			
		if(c==1) 
		{
			System.out.println("No is Prime No =" + a);
		}
		else 
		{
			System.out.println(a + "No is Not Prime");
		}
		
		}
		
	}
	
	
	public static void main(String[] args) {
		
		PrimeNoProgram p = new PrimeNoProgram();
		p.m1();
	}

}
