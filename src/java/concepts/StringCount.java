package java.concepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCount {

	public static void main(String[] args) {

		// Get the Count of Words From a Capitalized String

		String str = "thisGettheCountofWordsFromaCapitalizedString";
		
		//if small char word is at the beginning
		
		int c = 0;
		if(Character.isLowerCase(str.charAt(0))) {
			c++;	
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				c++;
			}
		}
		
		System.out.println(c);

		// 1.

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}

		System.out.println(count);

		// 2. Using ASCII values

		int count1 = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count1++;
			}
		}

		System.out.println(count1);

		// 3.using UpperCase

		int count2 = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count2++;
			}
		}

		System.out.println(count2);
		
		//4.using streams
		
	long count4 =	str.chars().filter(e -> e>= 65 && e<=90).count();
	System.out.println(count4);
	
	//5.
	
	long count5 =	str.chars().filter(e -> Character.isUpperCase(e)).count();
	System.out.println(count5);

	
	//6.using reg expressions
	
	String reg = "[A-Z]+";
	
	Pattern pattern = Pattern.compile(reg);
	Matcher matcher = pattern.matcher(str);
	
	int count6 =0;
	while(matcher.find()) {
		count6+= matcher.group(0).length();
	}
	
	System.out.println(count6);
	
	}

}
