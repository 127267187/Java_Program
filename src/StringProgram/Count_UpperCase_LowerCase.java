package StringProgram;

public class Count_UpperCase_LowerCase {
	
	public static void main(String[] args) {
		
		String str = "My Name Is Anil Rathod I Am From Yavatmal";
		
        int uppercase = 0;
		
		int lowercase = 0;
		
		for(int i=0; i<str.length(); i++) 
		{
			//char c = str.charAt(i);
			
			if(str.charAt(i)>=65 && str.charAt(i)<=90) 
			{
				uppercase++;
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				lowercase++;
			}
		}
		
		System.out.println(uppercase);
		System.out.println(lowercase);
		
	}

}

