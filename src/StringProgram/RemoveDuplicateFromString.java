package StringProgram;

public class RemoveDuplicateFromString {
	
	public static void main(String[] args) {
		
	
	String name = "conclusion";
	 
	//char[] ch = name.toCharArray();
	String newStr = "";
	
	for(char c : name.toCharArray()) 
	{
//		String newStr = "";
		if(name.indexOf(c)==name.lastIndexOf(c)) 
		{
			//System.out.print(c);
			newStr = newStr + c;
		}

//		System.out.print(newStr);
		
	}
	System.out.print(newStr);
	

}
	
}
