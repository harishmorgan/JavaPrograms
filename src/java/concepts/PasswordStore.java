package java.concepts;

import java.util.Arrays;

public class PasswordStore {

	public static void main(String[] args) {
		
		//Why password should be stored in char array char[] instead of string?
		
		String pw = "Newuser@123";
		System.out.println("pwd is:" +pw);
		
		char ch[] = new char[] {'N','a','v','e','e','n'};
	    System.out.println("pwd is: " + ch);
	    
	    Arrays.fill(ch, '*');
	    
	    for(int i =0; i<ch.length;i++) {
	    	System.out.print(ch[i]);
	    }
		

	}

} 
