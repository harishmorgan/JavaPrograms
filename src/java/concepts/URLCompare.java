package java.concepts;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompare {

	public static void main(String[] args) {
		
		try {
			System.out.println(new URL("https://www.amazon.in/").equals(new URL ("https://108.174.10.10 ")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
