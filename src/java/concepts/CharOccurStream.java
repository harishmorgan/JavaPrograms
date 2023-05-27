package java.concepts;

public class CharOccurStream {
	
	public static long getCount(String str, char c ) {
		return str.chars().filter(e -> (char)e == c).count();
	}
	
	public static long getCount(String str, char c1, char c2 ) {
		return str.chars().filter(e -> (char)e == c1 || (char)e==c2).count();
	}

	public static void main(String[] args) {
		
		// Count the Number of Occurrences of a Character in a String using Java 8 Streams?
		
		String str = "technical support";
		
//		long  count = str.chars().filter(e -> (char)e =='t'|| (char)e =='p').count();
//		System.out.println(count);
		
		System.out.println(getCount(str,'t')); //2
		
		System.out.println(getCount(str,'n','a')); //2

	}

}
