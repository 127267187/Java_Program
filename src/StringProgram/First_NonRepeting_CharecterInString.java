package StringProgram;

public class First_NonRepeting_CharecterInString {
	
	public static void main(String[] args) {
		
		String s = "conclusionxeaosn";
		
		//char[] ch = s.toCharArray();
		
		for(char c : s.toCharArray())    // or (char c : ch)
		{
			if(s.lastIndexOf(c)==s.indexOf(c))
			{
				System.out.print(c);
				break;
			}
		}
		
	}

}
