package java.concepts;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadFileUsingNIO {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\bhara\\Downloads\\self introduction.txt";
		
			try {
				List <String> harish = Files.readAllLines(Paths.get(path),StandardCharsets.UTF_8);
				Iterator<String> it = harish.iterator();
				
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	

	}

}
