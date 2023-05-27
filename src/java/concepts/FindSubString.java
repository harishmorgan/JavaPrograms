package java.concepts;

public class FindSubString {
	
	public static boolean isSubString(String main, String Sub) {
		return main.matches("(.*)"+ Sub +"(.*)");
	}
	
	public static boolean isSubString1(String main, String Sub) {
		return main.contains(Sub);
	}
	
	public static boolean isSubString2(String main, String Sub) {
		return main.indexOf(Sub)!= -1;
	}

	public static void main(String[] args) {
		
		// Check if Substring is Present in a Given String
		
		System.out.println(isSubString("naveen automation labs", "labs"));
		System.out.println(isSubString1("naveen automation labs", "labs"));
		System.out.println(isSubString2("naveen automation labs", "labs"));
		
		System.out.println(isSubString("Check if Substring is Present in a Given String", "Substring"));
		System.out.println(isSubString("naveen automation labs", "labs"));
		System.out.println(isSubString("naveen automation labs", "naveen"));
		System.out.println(isSubString("naveen automation labs", "test ing"));
		System.out.println(isSubString("naveen automation labs $$ special", "$$"));
		System.out.println(isSubString("automation", "auto"));
		System.out.println(isSubString("automation","test"));
		System.out.println(isSubString("automation","ti"));
		System.out.println(isSubString("automation11", "11"));
		System.out.println(isSubString("automation11","1"));
		System.out.println(isSubString("automation11",null));
		System.out.println(isSubString("automation11"," "));
	

	}

}
