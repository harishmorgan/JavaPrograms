package java.concepts;

import java.io.IOException;

public class LaunchApp {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Runtime runtime = Runtime.getRuntime();
		
//		Process pr = runtime.exec("notepad.exe C:/Users/bhara/Downloads/sample-1.txt");
//		Thread.sleep(4000);
//		pr.destroy();

		String s[] = new String[] {"\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"", "https://www.javatpoint.com/java-8-functional-interfaces"};
		runtime.exec(s);
		
		
	}

}
