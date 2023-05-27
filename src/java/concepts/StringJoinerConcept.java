package java.concepts;

import java.util.StringJoiner;

public class StringJoinerConcept {

	public static void main(String[] args) {
		
		//[Harish,Kumar,Pasupuleti]
		
		StringJoiner sj = new StringJoiner(",","[","]");
		sj.add("Harish").add("Kumar").add("Pasupuleti");
		
		System.out.println(sj.toString()); // [Harish,Kumar,Pasupuleti]
		

	}

}
