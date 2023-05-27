package java.concepts;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayConversion {
	
	public static String toString(String seperator,String...values) {
		
		StringBuilder sb = new StringBuilder();
		int end  = 0;
		
		for(String s: values) {
			if(s!=null) {
				sb.append(s); 
				end = sb.length();
				sb.append(seperator);
			}
			
		}
		
		return sb.substring(0,end);
		
	}
	
public static String toJoinInt(String seperator,Integer...values) {
		
		StringBuilder sb = new StringBuilder();
		int end  = 0;
		
		for(Integer s: values) {
			if(s!=null) {
				sb.append(s); 
				end = sb.length();
				sb.append(seperator);
			}
			
		}
		
		return sb.substring(0,end);
		
	}

	public static void main(String[] args) {
		
		String arr[]= {"H","a","r","i","s","h"};
		
		System.out.println(String.join(":", arr));
		
		//2.
		
	String join = 	Arrays.asList("t","r","y","i","n","g").stream().collect(Collectors.joining("|"));
	System.out.println(join);
	
	//3.
	
	System.out.println(toString(":","Z","E","B","R","O","N","I","C","S"));
	
	System.out.println(toJoinInt("|",1,2,3,4,5,6));
	
	//Integer Array to Integer
	
	
	String joint = 	Arrays.asList(1,2,3,99,101,444).stream().map(e->String.valueOf(e)).
												collect(Collectors.joining("|"));
	System.out.println(joint);

	}
	

}
