package java.concepts;

public class PrintNames {

	public static void main(String[] args) {
		
		String name = "harishkumar";
		String s = "a";
		
		s= s.replaceAll("a", "aaaaaaaaaa"); //10
		
		s= s.replaceAll("a", "aaaaaaaaaa"); //10*10 = 100
		
		s= s.replaceAll("a", "aaaaaaaaaa"); //100*10 = 1000
		
		s= s.replaceAll("a", name +"\n"); //10
		
		System.out.println(s);

	}

}
