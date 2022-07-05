package StringProgram;

public class Print_NumberFrom_String {
	
	public static void main(String[] args) {
		
	
	
	String str = "total row in rach page is 20 (256 pages)";
	
//	str.indexOf("(");
//	str.indexOf("pages");
	
	int num = Integer.valueOf(str.substring(str.indexOf("(")+1 , str.indexOf("pages")-1));
	
	System.out.println(num);
	
	}

}
