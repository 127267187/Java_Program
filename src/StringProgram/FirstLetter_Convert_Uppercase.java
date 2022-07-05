package StringProgram;

public class FirstLetter_Convert_Uppercase {

	public static void main(String[] args) {

		String str = "anil love me"; 
		
		String firstLetter = str.substring(0, 1).toUpperCase();
		
	   String remainingLetter = str.substring(1);
	  
	  // firstLetter = firstLetter.toUpperCase();
	   
	   str = firstLetter + remainingLetter;
	   
	   System.out.println(str);
		
		
//		String[] words = str.split(" ");
		
//		boolean foundSpace = true;
//		
//		for(String w : words) 
//		{
//			
//			String firstLetter = w.substring(0,1);
//			
//			 String remainingLetter = w.substring(1);
//			 
//			 firstLetter = firstLetter.toUpperCase();
//			 
//			 str = firstLetter + remainingLetter;
//			
//		}
//		System.out.println(str);
	}
	}	
		


	


















