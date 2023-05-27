package java.concepts;

public class StringQuotes {

	public static void main(String[] args) {
		/*
		 * /"Hello"/
		  /'Hello'/
		   '/'Hello'/'
		    "/'Hello'/"
		    "Hello"
		    I love "Java" and "programming" and "movies"
		    
		     'I love "Java" and "programming" and "movies'"
		 */
		System.out.println("/\"Hello\"/"); //  /"Hello"/
		
		System.out.println("/'Hello'/"); //  /"Hello"/
		
		System.out.println("'/'Hello'/'"); // '/'Hello'/'
		
		System.out.println("\"/'Hello/'\""); // "/'Hello/'"

		System.out.println("\"Hello\""); // "Hello"
		
		System.out.println("I love \"Java\" and \"programming\" and \"movies\""); // I love "Java" and "programming" and "movies"
		
		System.out.println("'I love \"Java\" and \"programming\" and \"movies'\""); //'I love "Java" and "programming" and "movies'"
		
		System.out.println(getXpath("lakshmisurekha"));
	}
	
	public static String getXpath(String name) {
		String xpath = "//input[@id = '"+name+"']"; // //input[@id = 'lakshmisurekha']
		
		return xpath;
	}

}
