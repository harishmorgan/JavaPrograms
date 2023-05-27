package java.concepts;

import org.apache.commons.lang3.StringUtils;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		//String newString = "    This   is my java code  ";
		
		//Inbuilt Methods
		
//		System.out.println(newString.replaceAll("\\s+", "")); //Thisismyjavacode
//		System.out.println(newString.trim()); // This   is my java code
//		String rem = StringUtils.deleteWhitespace(newString);
//		System.out.println(rem); //Thisismyjavacode
		
		String newString = "Naveen Automation Labs  " + "\n Java courses " + "\n learn it now u  "
		
				+"\n spring boot courses \t";
		
		String s[] = newString.split("\\s");
		
		StringBuffer remov = new StringBuffer();
		for(String e : s) {
		remov.append(e);
		}
		System.out.println(remov);
		
		//method 2
		
		String str = "    Selenium        is awesome   "; 
		
		String[] strArry = str.split(" ");
		for(int i = 0; i < strArry.length; i++) {
			System.out.print(strArry[i]);
		}


		
		
		
//		System.out.println(newString);
//		
//		String noWhiteSpaceString = "";
//		
//		for(int i =0; i<newString.length();i++) {
//			if((newString.charAt(i) != ' ') && (newString.charAt(i) != '\t')) {
//					noWhiteSpaceString = noWhiteSpaceString+newString.charAt(i);				
//			} 
//		}
//		
//		System.out.println(noWhiteSpaceString); //Thisismyjavacode

	}

}
