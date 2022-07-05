package task;

public class Star_Pattern {
	
	public static void main(String[] args) {
		Star_Pattern obj = new Star_Pattern();
		obj.m1();
	}

	
	public void m1() 
	{
		for(int i=0; i<6; i++) 
		{
			for(int j=6; j>i; i--) 
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) 
			{
				System.out.print(" " + "+");
			}
			
			System.out.println();
		}
	}
}
