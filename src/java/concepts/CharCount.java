package java.concepts;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	
	public static void getCharCount(String name) {
		
		Map<Character,Integer>charMap = new HashMap<Character,Integer>();
		
		char strArray[]=name.toCharArray();
		
		for(char c: strArray) {
			if(!String.valueOf(c).isBlank()) { // To avoid space we can use this statement
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			} else {
				charMap.put(c, 1);
			}
		}
		}
		
		System.out.println(name +" : "+charMap);  
		
	}

	public static void main(String[] args) {
		getCharCount("test auto"); //test auto : { =1, a=1, s=1, t=3, e=1, u=1, o=1}
		getCharCount("t"); //t : {t=1}
		getCharCount("tt"); //tt : {t=2}
		getCharCount("HDFC0004272"); //HDFC0004272 : {0=3, 2=2, C=1, D=1, 4=1, F=1, 7=1, H=1}
		
		//test --> t=2 , e=1 ,s=1
		//test auto -->
		//HashMap --> <k,V> -—-> <Character, Integer>

		
	}

}
