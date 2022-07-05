package StringProgram;

public class Count_Each_Character {
	
	public static void main(String[] args) {
		
	int[] n = new int[26];
		
	String str = "hello where are from";
	
	//char[] ch = str.toCharArray();
	
	for(int i=0; i<str.length(); i++) 
	{
		if(str.charAt(i)>=65 && str.charAt(i)<=90) 
		{
			n[str.charAt(i)-65]++;
		}
		else if(str.charAt(i)>=97 && str.charAt(i)<=122) 
		{
			n[str.charAt(i)-97]++;
		}
	}
	
	for(int i=0; i<26; i++) 
	{
		if(n[i]!=0) 
		{
			System.out.println( (char)(i+97) +" = "+ n[i]);
		}
	}
}
	
}
