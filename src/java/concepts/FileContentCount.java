package java.concepts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {
	
	
	static String path = "C:\\Users\\bhara\\Downloads\\sample-1.txt";

	public static void main(String[] args) throws IOException {
		
		int charCount = 0;
		int LineCount = 0;
		int wordCount = 0;
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
				String currentLine = reader.readLine().trim();
				
				while(currentLine != null) {
					LineCount++;
					
					//words 
					
				String words[]	= currentLine.split(" ");
				wordCount = wordCount + words.length;
				
				//lines
				
				for(String word : words) {
					charCount = charCount+word.length();
				}
				
				currentLine = reader.readLine();
					
				}
				System.out.println("total lines:" +LineCount);
				System.out.println("total words:" +wordCount);
				System.out.println("total characters:" +charCount);
		

	}

}
