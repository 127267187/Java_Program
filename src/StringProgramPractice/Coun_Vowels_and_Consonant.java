package StringProgramPractice;

public class Coun_Vowels_and_Consonant {
	
	public static void main(String[] args) {
	
	String str = "hi my name is anil";
	
	str = str.toLowerCase();
	
	int vcount=0 , ccount =0;
	
	char[] ch = str.toCharArray();
	
	for(char c : ch) 
	{
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') 
		{
			vcount++;
		}
		else 
		{
			ccount++;
		}
	}

	System.out.println("Total " + vcount + " vowels are present in given string ");
	System.out.println("Total " + ccount + " consonant are present in given string ");
}
}