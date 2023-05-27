package java.concepts;

public class SwapTwoIntegersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		// Swap two integers without using temp/third variable
		
		int x = 10;
		int y = 20;
		
		//1. without using third variable using +
		
		x = x+y;
		y=x-y;
		x= x-y;
		
		System.out.println(x);
		System.out.println(y);
		
		//2. without using third variable using *
		
		x = x*y;
		y=x/y;
		x= x/y;
		
		System.out.println(x);
		System.out.println(y);
		
		//3. without using third variable using ^
		
		x = x^y;
		y=x^y;
		x= x^y;
		
		System.out.println(x);
		System.out.println(y);
	}

}
