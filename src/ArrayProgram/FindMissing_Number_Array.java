package ArrayProgram;

public class FindMissing_Number_Array {
	
	public static void main(String[] args) {
		
		int[] n = {1,2,3,5,6,7};
		
		// sum of all ele in array = 24
		// sum of range of ele in array = 28
		
		int sum1 = 0;
		
		for(int i=0; i<n.length; i++) 
		{
			sum1 = sum1 + n[i];
		}
		
		System.out.println("sum of all ele in array = "  + sum1);
		
		int sum2 =0;
		
		for(int j=1; j<=7; j++)   
		{
			sum2 = sum2 + j;
		}
		
		System.out.println("sum of range of ele in array = " + sum2);
		
		System.out.println("Missing number from array is " + (sum2 - sum1));
		
		
		
	}

}
