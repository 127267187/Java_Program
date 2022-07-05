package ArrayProgram;

public class Count_Of_PositiveNumber_Array {
	
//	public static void main(String[] args) 
//	{
//		int[] n = {11,84,90,-42,87,-23,55,-66,88,13};
//		System.out.println(positiveNumberReturn(n));
//	}
//	
//	public static int positiveNumberReturn(int[] n) 
//	{
//		int len = n.length;
//		
//		int count = 0;
//		
//		for(int i=0; i<len; i++) 
//		{
//			if(n[i]>0)        // if(n[i]>0 && n[i]%2==1) -- this is for to print even or odd number
//			{
//				count++;
//			}
//		}
//		return count;
//		
//	}
	
	public static void main(String[] arg) 
	{
		int[] n = {11,84,90,-42,87,-23,55,-66,88,13};
		
		int len = n.length;
		
		int count = 0;
		
		for(int i=0; i<len; i++) 
		{
			if(n[i]>0 && n[i]%2==0)        // if(n[i]>0 && n[i]%2==1) -- this is for to print even or odd number
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
