package java.concepts;

public class NaturalNumbersSumWithRecurrsion {
	
	public static int isNaturalNum(int num) {
		
		if(num !=0) {
			return num+isNaturalNum(num-1);
			
		} else {
			return num;
		}
		
	}
	

	public static int multiplyNum(int num) {
		
		if(num>1) {
			
			return num*multiplyNum(num-1);
			
		} else {
			return 1;
		}
		
	}

	public static void main(String[] args) {
		
		//  Java Program to Find the Sum of Natural Numbers using Recursion 
			int num =19;
			System.out.println(isNaturalNum(num));
			
			//Java Program to Find Factorial of a Number Using Recursion  
			
			System.out.println(multiplyNum(num));

	}

}
