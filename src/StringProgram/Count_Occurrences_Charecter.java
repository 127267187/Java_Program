package StringProgram;

public class Count_Occurrences_Charecter {   // find how many u is present in string
	
	public static void main(String[] args) {
		
		String s = "buysusrcxtyurybr";   
		
		char[] ch = s.toCharArray();
		
//		int totalCount = s.length();
//		
//		int count_afterremove = s.replace("y","").length();
		
		//System.out.println(count_afterremove);
//		int count = totalCount-count_afterremove;
//		
//		System.out.println(" count of u character in string is " + count);
        
		for(int i=0; i<ch.length; i++) 
		{
             int count = 0;
             
             char c = s.charAt(i);

			int count_afterremove = s.replace("y","").length();
		}
	
	}

	
}
