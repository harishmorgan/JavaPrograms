package java.concepts;

import org.apache.commons.lang3.StringUtils;

public class OccurrencesOfACharacterInAString {

	public static void main(String[] args) {

		String str = "I am doing automation Testing";

		getCharCount(str, 'i'); // i:1
		
		getOccureneceString(str,'e'); // e:1
		
		getCharOccurenceStreams(str,"t"); // t:3
		
		getCharOccurenceUtils(str,"a"); //a:3
		
		
	}
	
	//2.str.len -- charAt(i)
	
	public static void getCharCount(String str, char val) {

		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == val) {
				counter++;
			}
		}
		System.out.println(val + ":" + counter);
	}
	

	
	public static void getOccureneceString(String str, char val) {
		
		// 1.CharArray -- for loops
		int counter = 0;
		
		for (char ch : str.toCharArray()) {
			if (ch == val) {
				counter++;
			}

		}
		
		System.out.println(val + ":" + counter);
		
	}
	
	//3.using streams
	
	public static void getCharOccurenceStreams(String str,String valu) {
		long count = 	str.chars().mapToObj(e -> String.valueOf((char)e)).filter(e->e.equals(valu)).count();
		
		System.out.println(valu + ":" +count); // 2 

	}
	
	//4. Using apache --stringUtils
	public static void getCharOccurenceUtils(String str,String value) {
			int count = StringUtils.countMatches(str, value);
			
			System.out.println(value + ":" + count);
	}

}
