package java.concepts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxCount {

	static String path = "C:\\Users\\bhara\\Downloads\\sample-1.txt";

	public static void main(String[] args) {

		Map<String, Integer> digitsMap = new HashMap<String, Integer>();

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(path));
			String currentLine = reader.readLine();
			while (currentLine != null) {

				String words[] = currentLine.toLowerCase().split(" ");

				for (String word : words) {
					if (!word.isBlank()) {
						if (digitsMap.containsKey(word)) {
							digitsMap.put(word, digitsMap.get(word) + 1);
						} else {
							digitsMap.put(word, 1);
						}

					}

				}

				currentLine = reader.readLine();

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		digitsMap.forEach((k, v) -> System.out.println(k + ":" + v));

		// Max count

		Map<String, Integer> maxMap = new HashMap<String, Integer>();

		digitsMap.entrySet().stream().filter(entry -> entry.getValue() == Collections.max(digitsMap.values()))
				.forEach(e -> maxMap.put(e.getKey(), e.getValue()));
		
		System.out.println("--------------------");
		System.out.println(maxMap);

	}

}
