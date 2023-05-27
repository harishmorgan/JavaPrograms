package java.concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		File file = new File("C:/Users/bhara/Downloads/TaxForecast.pdf");
		File sampleFile = new File ("C:/Users/bhara/Downloads/TaxForecast_sample.pdf");
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileoutputStream = null;
		
		try {
			fileInputStream = new FileInputStream(file);
			fileoutputStream = new FileOutputStream(sampleFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(fileInputStream.available()); // available() represents number of bytes in that file is 2259
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i = 0;
		
		try {
			while((i = fileInputStream.read()) !=-1) {
				fileoutputStream.write(i);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//close the stream
			if(fileInputStream != null) {
				try {
					fileoutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			if(fileoutputStream != null) {
				try {
					fileoutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
