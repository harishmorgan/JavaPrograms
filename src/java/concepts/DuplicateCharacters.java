package java.concepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void DuplicateCharactersFromString(String str) {

		if (str == null) {
			System.out.println("Null String");
			return;
		}
		if (str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		if (str.length() == 1) {
			System.out.println("Single Char String");
			return;
		}

		char words[] = str.toCharArray();
		Map<Character, Integer> characterSet = new HashMap<Character, Integer>();

		for (char c : words) {
			if (characterSet.containsKey(c)) {
				characterSet.put(c, characterSet.get(c) + 1);

			} else {
				characterSet.put(c, 1);
			}
		}

		// print the Map
		Set<Map.Entry<Character, Integer>> entrySet = characterSet.entrySet();

		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}

	}

	public static void main(String[] args) {
		
		DuplicateCharactersFromString(null); //Null String
		DuplicateCharactersFromString(""); //Empty String
		DuplicateCharactersFromString("harish"); //h:2
		DuplicateCharactersFromString("harish kumar");//a:2 r:2 h:2
		DuplicateCharactersFromString("10000"); //0:4
		

		// How to Print count of duplicate characters from String?

	}

}
