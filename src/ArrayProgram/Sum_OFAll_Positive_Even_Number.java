package ArrayProgram;

public class Sum_OFAll_Positive_Even_Number {
	
	public static void main(String[] args) {
		
		int[] n = {10,13, -14, -20, 22, 3, 7, 88}; 
		
		int sum = 0;
		
		for(int i=0; i<n.length; i++) 
		{
			if(n[i]>0) 
			{
				if(n[i]%2==0)            // if( n[i]%2==1 ) to print Sum_OFAll_Positive_odd_Number from given array
				{
					sum = sum + n[i];
				}
			}
		}
		
		System.out.println(sum);
	}

}
