package Practice;

public class FibonacciProgram { // print first 20 fibonacci number
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		
		System.out.print(a +" " + b);
		
		int c;
		
		for(int i =2; i<20; i++) 
		{
			c = a+b;
			System.out.print(" " + c);
			
			a = b;
			b = c;
		}
	}

}
