package java.concepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLength {
	
	//7.
	
	 public static int Stringlen(String str) {
		
		 int i = 0;
		 try { 
		 while(true) {
			 str.charAt(i);
			 i++;
		 }
		} catch (Exception e ) {
			return i;
		}
		
	 }

	 public static int getLenth(String str) {
		 
		 String s[] = str.split("");
		 int count = 0;
		 
		 for(String t : s) {
			 count += t.toCharArray().length;
		 }
		 return count;
	 }
	public static void main(String[] args) {

		String str = "TODO Auto-generated method stub";

		// 1.
		System.out.println(str.toCharArray().length); // 31

		// 2.
		System.out.println(str.lastIndexOf("")); // 31

		// 3.
		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int len = m.end();
		System.out.println(len); //31
		
		//4.
		
		System.out.println(str.split("").length); //31
		
		//5.
		
		int l = new StringBuilder(str).length(); //31
		System.out.println(l);

		
		//6.
		int count = 0;
		for(char c : str.toCharArray()) {
			count++;		
		}
		
		System.out.println(count); // 31
		
		//7.
		
		System.out.println(Stringlen("testing")); //7
		
		//8.
		 int lent = 0;
		 try {
			 lent = str.getBytes("UTF-16BE").length/2;
		 } catch (Exception e ) {
			 
		 }
		System.out.println(lent);// 31
		
		System.out.println(getLenth("I do my testing only")); //20
	}

}
