package java.concepts;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageHandling {

	public static void main(String[] args) {
		
		File file = new File("F:/capgemini/PHOTO.jpg");
		
		try {
		BufferedImage image = ImageIO.read(file);
		ImageIO.write(image, "jpg", new File("./screenshots/photo.jpg"));
		ImageIO.write(image, "gif", new File("./screenshots/photo.gif"));
		ImageIO.write(image, "png", new File("./screenshots/photo.png"));
		ImageIO.write(image, "bmp", new File("./screenshots/photo.bmp"));
		System.out.println("---DONE-----");
} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
}

	}

}
