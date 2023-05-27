package java.concepts;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;

public class VowelsCount {

	// java

	public static boolean getVowelsCount(char t) {
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
				|| t == 'U';
	}

	public static void main(String[] args) {
		// Vowels Count within a String using : Java, Java 8 Streams and Google Guava
		// library.

		String str = "automation testing";
		int count = 0;

		for (int x = 0; x < str.length(); x++) {
			if (getVowelsCount(str.charAt(x))) {
				count++;
			}
		}
		System.out.println(count);
		
		//java 8 streams
		
		IntPredicate vowels = new IntPredicate() {

			@Override
			public boolean test(int h) {
				return h == 'a' || h == 'e' || h == 'i' || h == 'o' || h == 'u' || h == 'A' || h == 'E' || h == 'I' || h == 'O'
						|| h == 'U';
			}
			
		};
		
		String stri = "These small concepts are very much valuable";
		long counts = stri.chars().filter(vowels).count();
		
		System.out.println(counts); //13
		
		//Using Google Guava libraries
		
		/* For Guava Library ; download the google guava jar files and add it to eclipse 
		* For Adding into Eclipse : Right click on the project and select properties and select java Buildpath
		*select classpath and select Add External jars
		*click on apply and close */
		
		String st = "guava google jar libraries";
		
		int vcCount = CharMatcher.anyOf("aeiouAEIOU").countIn(st);
		
		System.out.println(vcCount); //11
	}

}
