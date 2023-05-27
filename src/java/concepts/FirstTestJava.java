package java.concepts;

public class FirstTestJava {

	public static void main(String[] args) {
		
		String str1 = "Bharath";
		String str2 = "";
		int n = str1.length();
		
		for(int i = n-1; i >= 0; i--) {
			str2 = str2+str1.charAt(i);
			System.out.println(str2);
		}
		
		
	}

}
