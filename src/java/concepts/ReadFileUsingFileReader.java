package java.concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

	public static void main(String[] args) {
		
		String path = "C:/Users/bhara/Downloads/sample-1.txt";
		FileReader file = null;
		try {
			 file = new FileReader(path);
			System.out.println("file content is: ");
			int c = 0;
			try {
				while((c = file.read()) != -1) {
					System.out.print((char)c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
