package ArrayProgram;

public class Sum_Of_PositiveNumber_Array {
	
	public static void main(String[] args) {
		
		int[] n = {11,84,90,-42,87,-23,55,-66};
		
		int sum = 0;
		
		for(int i=0; i<n.length; i++) 
		{
			if(n[i]>0) 
			{
				sum = sum + n[i];
			}
		}
		
		System.err.println("Sum of all positive number from given string are = " + sum);
	}

}
