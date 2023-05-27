package java.concepts;

public class SwapTwoStringsWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		// Swap two Strings without using temp/third variable
		
		String a = "Harish";
		String b = "Kumar";
		
		System.out.println("Before Swapping:");
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		
		//1.append a and b
		a = a+b;
		
		//2.store initial string a in string b
		
		b = a.substring(0,a.length() - b.length());
		
		//2.store string b in string a
		
		a = a.substring(b.length());
		
		System.out.println("after Swapping:");
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		
		

	}

}
