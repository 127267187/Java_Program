package Practice;

public class ArmstrongNumber_SingalNumber {
	
	public static void main(String[] args) {
		
		int num = 153;
		int a = num;
		
		int sum = 0;
		int b;
		
		while(num!=0) 
		{
			b = num%10;
			sum = sum+(b*b*b);
			num = num/10;
		}
		
		if(a==sum) 
		{
			System.out.println("This is a ArmstrongNumber " + sum);
		}
		else 
		{
			System.out.println("This is not ArmstrongNumber " + sum);
		}

}
}
