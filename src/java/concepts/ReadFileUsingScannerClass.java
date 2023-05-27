package java.concepts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileUsingScannerClass {

	public static void main(String[] args) {
		
		
		String path = "C:/Users/bhara/Downloads/sample-1.txt";
		FileReader file = null;
		try {
			file = new FileReader(path);
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
