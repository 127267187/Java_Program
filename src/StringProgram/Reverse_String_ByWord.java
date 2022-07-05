package StringProgram;

public class Reverse_String_ByWord {
	
	public static void main(String[] args) {
		
		// Approch 1
		
		String str = "I Love My India";
		
		String[] seprate_word = str.split(" ");    // split --> "I","Love","My","India"--> this format store into -->seprate_word
		
		String revString1 = "";
		
		for(String w : seprate_word ) 
		{
			String revWord = "";
			
			int count = w.length();
			
			for(int i = count-1; i>=0; i--) 
			{
				revWord = revWord + w.charAt(i);
				
			}
			
			//System.out.print(revWord + " ");
			
			revString1 = revString1 + " " + revWord;
			
		}
	
		System.out.println(revString1);
//	}
	
//------------------------OR-----------------------------//
	
	//Approch 2
//	
//	String str = "I Love My India";
//	
//	String[] eachWord = str.split("\\s");
//	
//	String reverseString = "";
//	
//	for(String w : eachWord) 
//	{
//		StringBuilder sb = new StringBuilder(w);
//		
//	    sb.reverse();
//		
//	    reverseString = reverseString +  sb.toString();
//	    
//	    System.out.println(reverseString);
//		
//		
//	}

}
}
