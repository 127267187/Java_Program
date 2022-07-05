package practice2;

public class Count_everyCharacter {
	
	public static void main(String[] args) {
		
		int[] s = new int[26];
		
		String str = "Hello My Name Is Anil";
		
		//str = str.toLowerCase();
		
		int upperCase=0;
		int lowerCase=0;
		
		
		for(int i=0; i<str.length(); i++) 
		{
			if(str.charAt(i)>=97 && str.charAt(i)<=122) 
			{
			   lowerCase++;
			}
			else if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				upperCase++;
			}
		}
		
		System.out.println(lowerCase);
		
		System.out.println(upperCase);
		
//		for(int j=0; j<26; j++) 
//		{
//			if(s[j]!=0) 
//			{
//				System.out.println((char)(j+97) + " :: " + s[j]);
//			}
//		}
		
	}

}
