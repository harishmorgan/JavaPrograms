package java.concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {

		/*
		 * create a file in Java Using: 1.File 2.FileOutStream 3. Java NIO utils
		 */

		String path = "C:/Users/bhara/Downloads/sample.txt";
		File file = new File(path);
		try {
			boolean flag = file.createNewFile();
			if (flag) {
				System.out.println("New File is created");
			} else {
				System.out.println("File is already presented .....");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2.FileOutputStream
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the file name with location path:");
			String filepath = sc.nextLine();

			FileOutputStream fos = new FileOutputStream(filepath, true);
			System.out.println("Enter the file content:");
			String fileContent = sc.nextLine();
			byte b[] =	fileContent.getBytes();
			try {
				fos.write(b);
				fos.close();
				System.out.println("File is saved in the specified location");
			} catch (IOException e) {
				System.out.println("some exception is coming .......");
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		//3. Java nio package
		
		Path pathOfTheFile =Paths.get( "C:/Users/bhara/Downloads/sample-2.txt");
		try {
		Path newPath = 	Files.createFile(pathOfTheFile);
		System.out.println("New File is created at path:" +newPath);
		} catch (IOException e) {
			System.out.println("some exception is coming .......");
			e.printStackTrace();
		}

	}

}
