package java.concepts;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String str = "!@#$%selenium---&^%$*()";
		
		String str1 = "あなた its japaneseあなた language";
		
		String s = str.replaceAll("[^a-zA-Z0-9]", "");
		
		String s1 = str1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		System.out.println(s1);

	}

}
