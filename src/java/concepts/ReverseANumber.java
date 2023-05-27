package java.concepts;

public class ReverseANumber {
	
	public static void rev(int number) {
		
		if(number<10) {
			System.out.print(number);
			return;
			
		} else {
			System.out.print(number%10);
			rev(number/10);
		}
	}

	public static void main(String[] args) {
		
		rev(123456789);
		rev(123);
		rev( 12345); 
		rev(111);
		rev(123909888) ;
		
		//2.
		
//		int num = 123;
//		while(num>0) {
//			int rev = num%10;
//			System.out.print(rev);
//			num = num/10;
//		}
		
		//3.
		System.out.println("Using string buffer------>");
		long num1 = 123456789067894321L;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
