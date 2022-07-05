package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_DuplicateNumber_InArray {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Numbers");

		
		int[] n = {1,2,0,232,5,3,4,9,9,9,8,};
		 
		int len = n.length;
		
		int count =0;
		
		for(int i=0; i<len-1; i++) 
		{
			if(n[i]!=n[i+1]) 
			{
				n[count++] = n[i];
			}
		}
		
		n[count++]=n[len-1];
		
		for(int j=0; j<count; j++) 
		{
			System.out.print( n[j]+" ");
		}

}
}