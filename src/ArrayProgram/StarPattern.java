package ArrayProgram;

public class StarPattern {

	//public static void main(String[] args) {
	 
	
	 public static void main(String[] args) {
		int i,j;
		for(i=0; i<6; i++) 
		{     
			 for(int a=i; a<6; a++) 
             {
       	      System.out.print(" ");
             }
             for(j=0; j<=i; j++) 
             {
            	 System.out.print(" + ");
             }
             System.out.println("");
		}
		
		for(i=0; i<6; i++) 
		{
             for(j=6; j>i; j--) 
             {
            	 System.out.print(" + ");
             }
             System.out.println("");
		}


	}

}
