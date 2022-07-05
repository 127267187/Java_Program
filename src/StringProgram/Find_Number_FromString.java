package StringProgram;

public class Find_Number_FromString 
{
	
	public static void main(String[] args) 
	{
		String s1 = "anil28";
		
		String s2 = "rathod1997";
		
		String s3 = s1.concat(s2);
		
		char[] ch = s3.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		int countNum = 0;
		
		for(char c : ch) 
		{
			if(Character.isDigit(c))
			{
				sb.append(c);
				
				countNum++;
			}
		}
		System.out.println(countNum);
	}

}
