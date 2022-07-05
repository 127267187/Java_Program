package StringProgramPractice;

public class ReverseString_ByWord {
	
	public static void main(String[] args) {
	
	String str = "hi my name is anil";
	
	String[] words = str.split(" ");
	
	String rev = " ";
	
	for(String w : words) 
	{
		int count = w.length();
		
		String revWord = " ";
		
		for(int i=count-1; i>=0; i--) 
		{
			revWord = revWord + w.charAt(i);
		}
		rev = rev+revWord+" ";
	}
	 
	System.out.println(rev);
}
}