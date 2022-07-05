package StringProgramPractice;

public class Convert_EveryFirstChar_Uppercase {
	
	public static void main(String[] args) {
		
		String str = "hello my name is rahul";
		
		String[] words = str.split(" ");
		
		for(String w : words) 
		{
			char[] ch = w.toCharArray();
			
			for(int j=0; j<ch.length; j++) 
			{
				ch[0] = Character.toUpperCase(ch[0]);
				
				System.out.print(ch[j]);
			}
			
			System.out.print(" ");
		}
		
	}

}
