package java.concepts;

import java.io.File;

public class Resume {

	public static void main(String[] args) {

		File file = new File("./May17/src/may/practices/IsNumber.java");
		file.setExecutable(true);

		file.setReadable(false);

		file.setWritable(true);

		System.out.println("done.....");

	}

}
