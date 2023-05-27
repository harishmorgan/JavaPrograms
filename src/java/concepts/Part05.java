package java.concepts;

public class Part05 {
	
	public static int convertBinaryToDecimal(long num) {
		
		int decimalNumber = 0;
		int i = 0;
		long remainder;
		while(num!= 0) {
			remainder = num%10;
			num = num/10;
			
			decimalNumber += remainder *Math.pow(2, i);
			i++;
		}
		
		return decimalNumber;
		
	}
	
	public static long convertDecimalToBinary(int num) {
		
		long binary = 0;
		int remainder = 1;
		int i = 1;
		
		while(num!= 0) {
			remainder = num%2;
			num = num/2;
			
			binary += remainder *i;
			i*=10;
			
		}
		return binary;
		
	}
	
	public static int convertDecimalToOctal(int decimal) {
		
		int octalNumber = 0;
		int i=1;
		while(decimal!= 0) {
			
			octalNumber += (decimal%8) * i;
			decimal/=8;
			i*=10;
			
		}
		return octalNumber;
		
	}
	
public static int convertOctalToDecimal(int octal) {
		
		int decimalNumber = 0;
		int i=0;
		while(octal!= 0) {
			
			decimalNumber += (octal%10) * i;
			octal/=10;
			i++;
			
			
		}
		return decimalNumber;
		
	}


	public static void main(String[] args) {
		
		// Java Program to Convert Binary Number to Decimal
		
		int num = 11100011;
		System.out.println(convertBinaryToDecimal(num));
		
		// Java Program to Convert Decimal Number to Binary
		
		int numbr = 227;
		
		System.out.println(convertDecimalToBinary(numbr));
		
		// Java Program to Convert Decimal Number to Octal
		
		System.out.println(convertDecimalToOctal(227));
		
		// Java Program to Convert Octal Number to Decimal
		
		System.out.println(convertOctalToDecimal(227));
		
	}

}
