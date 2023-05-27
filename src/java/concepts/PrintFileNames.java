package java.concepts;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

	public static void main(String[] args) {
		
		String path = "C:/Users/bhara/Downloads";
		
		File file = new File(path);
		
		File downloadsDir[] = file.listFiles();
		
		Arrays.sort(downloadsDir);
		
		for(File f :downloadsDir ) {
			if(f.isFile()) {
				System.out.println("FileName is :" +f.getName() + " "+f.getAbsolutePath());
			} else {
				if(f.isDirectory()) {
					System.out.println("Directory is :" +f.getName()+ " "+f.getAbsolutePath());
				} else {
					System.out.println("Not Known message:"+f.getName()+ " "+f.getAbsolutePath());
				}
			}
		} 

	}

}
