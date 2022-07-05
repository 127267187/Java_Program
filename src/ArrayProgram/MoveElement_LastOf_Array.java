package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MoveElement_LastOf_Array {
	
	public static void main(String[] args) {
		
		int[] n = {2,0,8,5,0,7,0,5,3,0,7,6,7};
		
		int a = 0; //1
		
		for(int i=0; i<n.length; i++) 
		{
			if(n[i]!=8) 
			{
				int temp  = n[a]; 
				
				n[a]=n[i];        
				
				n[i]=temp;        
				
				a++;
				
				
			}
		}
	    System.out.println(Arrays.toString(n));
	
	

}
}