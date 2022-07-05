package StringProgramPractice;

public class Reverse_String_ByCharacter {
	
	public static void main(String[] args) {
		
		String str = "hi my is rahul";
		
		int count = str.length();
		
		String revString = " ";
		
		for(int i=count-1; i>=0; i--) 
		{
			revString = revString + str.charAt(i);
		}
		System.out.println(revString);
	}

}
