package StringProgramPractice;

public class Count_EachCharacter_String {
	
	public static void main(String[] args) {
		
		int[] c = new int[26];
		
		String name = "Hi My Name Is Anil & Am from yavatmal ";
		
		// we can access any string on index basis by converting string to char
		
		char[] ch = name.toCharArray();
		
		for(int i=0; i<ch.length; i++)      
		{    
			
			//in prog language evry character have sky value , here i have provide condition by using
			// sky value of character 
			// ex :- character--> A   B   C ....Z     a   b   c  .....z
            //	     sky value--> 65  66  67....90    97  98  99 .....122
			if(name.charAt(i)>=65 && name.charAt(i)<=90) 
			{                                              
				c[name.charAt(i)-65]++;                     
			}                                            
			else if(name.charAt(i)>=97 && name.charAt(i)<=122)
			{
				c[name.charAt(i)-97]++;
			}
		}
		for(int i=0; i<26; i++) 
		{   
			if(c[i]>0) 
		    {
			System.out.println((char)(i+65) + " = " + c[i]);
			}
		}
	
	

}
}
