package java.concepts;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStreams {

	public static void main(String[] args) {

		String path = "C:/Users/bhara/Downloads/sample-1.txt";
		FileInputStream fileInput = null ;

		try {
			File file = new File(path);
			 fileInput = new FileInputStream(file);
			System.out.println("file content is: ");
			
			int c = 0;
			while((c = fileInput.read()) != -1) {
				System.out.print((char)c);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileInput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
