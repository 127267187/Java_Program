package Practice;

public class ArmstrongNumber_InBetween {

	public static void main(String[] args) 
	{

       for(int i=1000; i<5000; i++) 
       {
    	   int num=i;
    	   int b = num;
    	   int sum = 0;
    	   int c;
    	   
    	   while(num!=0) 
    	   {
    		   c = num % 10;
    		   sum = sum + c*c*c*c;
    		   num = num/10;
    	   }
    	   
    	   if(b==sum) 
    	   {
    		   System.out.println("This is Armstrong no " + sum);
    	   }
//    	   else
//    	   {
//    		   System.out.println("This is not Armstrong no " + sum);
//    	   }
       }
	}



}


