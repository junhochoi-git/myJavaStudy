package example_oop;

public class VarArgs {
	public static void main(String[] args) {
	String[] strArr= {"100","200","300"};
	System.out.println(concatenate("","100","200","300"));
	System.out.println(concatenate("-",strArr));
	}
	
	static String concatenate(String delim, String...args) { //concatenate : link (things) together in a chain or series.
		String result="";
		for(String str:args) {
			result+=str+delim;
			
		}
		return result;
	}
}
