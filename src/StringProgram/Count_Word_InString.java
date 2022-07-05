package StringProgram;

public class Count_Word_InString {
	
	public static void main(String[] args) 
	{
		String s = "i love my india";
		
		//String[] word = s.split("");
		 
		int count = 1;
		
		for(int i=0; i<s.length(); i++) 
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) 
			{
				count++;
			}
		
		}
		System.out.println("Number of words in a string is " + count);
		
		
		
	}

}
