package java.concepts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferReader {

	public static void main(String[] args) {
		
		String path = "C:/Users/bhara/Downloads/sample-1.txt";
		BufferedReader bfr = null;
		
		try {
			
		    bfr = new BufferedReader(new FileReader(path));
			System.out.println("file content is: ");
			
			int c = 0;
			while((c = bfr.read()) != -1) {
				System.out.print((char)c);
			}
			
		} catch (Exception e ) {
			e.printStackTrace();
		}
		finally {
			try {
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
