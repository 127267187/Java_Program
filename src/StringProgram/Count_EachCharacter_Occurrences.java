package StringProgram;

public class Count_EachCharacter_Occurrences {
	
	public static void main(String[] args) 
	{
		String s = "java is based on object oriented programing langauage";
		
		getCountChar(s,'b');
		
//		int count = 0;
//		
//		for(char ch : s.toCharArray())
//		{
//			if(ch=='g') 
//			{
//				count++;
//			}
//		 
//		}
//		System.out.println( count);

	}
	
	public static void getCountChar(String s, char val) 
	{
		int count = 0;
		
		for(char ch : s.toCharArray()) 
		{
			if(ch == val) 
			{
				count++;
			}
		}
		System.out.println(val + " : " + count );
	}
	
	
}
