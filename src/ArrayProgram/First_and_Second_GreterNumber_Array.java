package ArrayProgram;

public class First_and_Second_GreterNumber_Array {
	
	public static void main(String[] args) {
	
	int[] n = {9,4,6,2,87,4,9,32,54,90,120};
	
	int fGreter =0 , sGreter=0;
	
	for(int i=0; i<n.length; i++) 
	{
		if(n[i]>fGreter) 
		{
			sGreter = fGreter;  // 0  9   32   54  87  90
			
			fGreter = n[i];     // 9  32  54  87  90  120
		}
	}
    
	System.out.println("first greter number " + fGreter);
	
	System.out.println("second greter number " + sGreter);
}
}
