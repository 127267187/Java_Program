package ArrayProgram;

import org.openqa.selenium.grid.Main;

public class Sort_Array_ASC_DESC {

	public static void main(String[] args) {
	
	int[] a = {11,0,84,90,-42,0,11,87,-23,55,-66, 7};
	
	int b=0;
	
	for(int i=0; i<a.length; i++) 
	{
		for(int j=i+1; j<a.length; j++) 
		{
			if(a[i]<a[j]) 
			{
				b    = a[i];
				a[i] = a[j];
				a[j] = b;
			}
		}
		
		//System.out.print(a[i] + " ");
	}
	System.out.println();
	System.out.println("second heigest element = " + a[1] + " second Lowest = " + a[10]);
}
}