package StringProgram;

public class Convert_EveryFirstChar_Uppercase {
	
	public static void main(String[] args) {
		
		
		String s = "hello my name is anil";
		
		String[] words = s.split(" ");
		
//		for(int i=0; i<words.length; i++) 
//		{
//			char[] ch = words[i].toCharArray();
//			
//			for(int j=0; j<ch.length; j++)
//			{
//				ch[0] = Character.toUpperCase(ch[0]);
//				
//				System.out.print(ch[j]);
//				
//			}
//			
//			System.out.print(" ");
//			
//		}
		
		for(String w : words) 
		{
			char[] ch = w.toCharArray();
			
			for(int i=0; i<ch.length; i++) 
			{
				ch[0] = Character.toUpperCase(ch[0]);
				System.out.print(ch[i]);
			}
			System.out.print(" ");
		}
	}

}
