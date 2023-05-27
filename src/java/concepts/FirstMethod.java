package java.concepts;

public class FirstMethod {

	public static void main(String[] args) {
		// using third varaiable
		int a = 10;
		int b =20;
		System.out.println("Before swapping values are" +a+" "+b);
		int t = a;
		a= b;
		b=t;
		System.out.println("After swapping values are" +a+" "+b);	

	//without using third variable and using + & -
	System.out.println("Before swapping values are" +a+" "+b);
	 a = a+b;
	 b= a-b;
	 a = a-b;
	System.out.println("After swapping values are" +a+" "+b);
	
	// single statement
	System.out.println("Before swapping values are" +a+" "+b);
	b = a+b-(a=b);
	System.out.println("After swapping values are" +a+" "+b);
	}
}
