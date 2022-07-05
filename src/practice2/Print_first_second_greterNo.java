package practice2;

public class Print_first_second_greterNo {
	
	public static void main(String[] args) {
		
		int[] n = new int[]{65,90,12,95,43,553,79,23,120,80,60};
		
		int a=0;
		
		for(int i=0; i<n.length; i++) 
		{
			for(int j=i+1; j<n.length; j++) 
			{
				if(n[i]<n[j]) 
				{
					a=n[i];
					n[i]=n[j];
					n[j]=a;
				}
			}
			System.out.print(n[i] + " ");
		}
		System.out.println();
		System.out.println("[" + n[0]+" , "+n[9] + "]");
	}

}
