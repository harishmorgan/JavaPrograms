package java.concepts;

public class Part02 {

	public static void main(String[] args) {
		
		//java program to check whether a number is positive or negative 
		
		double num = -12.33;
		
		if(num<0.0) {
			System.out.println(num + " is negative number");
		} else if(num>0.0) {
			System.out.println(num + " is positive number");
			
		}else
		{
			System.out.println(num + " is zero");
		}
		
		//Java Program to Check Whether a Character is Alphabet or Not  
		
		char ch = 'G';
		
		if((ch >='a' && ch<='z') ||(ch>='A' && ch<='Z')) {
			System.out.println(ch+ " is a alphabet");
		}else {
			System.out.println(ch+ " is not an alphabet");
		}
		
		//Java Program to Calculate the Sum of Natural Numbers  
		
		int numbr = 100;
		int sum = 0;
		
		int total = 0;
		
		for(int i =1; i<=numbr;i++) {
			sum = sum+i;
		}
		System.out.println("sum is:" +sum);
		
		//2. 
		
		int k =1;
		while(k<=numbr) {
			total = total+k;
			k++;
		}
		System.out.println("sum is:" +total);
		
		//Java Program to Find Factorial of a Number        
		
		int nmber = 4;
		
		int factorial = 1;
		
		for(int i =1;i<=nmber;i++) {
			factorial =factorial*i;
		}
		
		System.out.println("factorial of "  +nmber + " is: " +factorial );
		
		// Java Program to Generate Multiplication Table      
		
		int multiplynum = 2;
		
		for(int i =1; i<=10;i++) {
		System.out.println(multiplynum+" X "+i+" = "+multiplynum*i);
		}
		
		//Java Program to Display Fibonacci Series   
		
		int numbersupto = 10;
		
		int t1 = 0;
		int t2 = 1;
		int totally = 0;
		
		for(int i =1; i<=numbersupto;i++) {
			System.out.println(t1);
			totally = t1+t2;
			t1= t2;
			t2=totally;
		}
		
		//Java Program to Display Characters from A to Z using loop  
		
		for(char cha = 'A' ; cha<='Z';cha++) {
			
			System.out.print(cha+ " ");
		}
		
		//Java Program to Count Number of Digits in an Integer      
		System.out.println("  ");
		int numbrofDigits = 12345;
		int countrr = 0;
		
		while(numbrofDigits != 0) {
			numbrofDigits = numbrofDigits/10;
			countrr++;
		}
		
		System.out.println("number of digits is: "+countrr);
		
		//Java Program to Reverse a Number
		
		int inputNumber = 12345;
		int rev = 0;
		
		while(inputNumber !=0){
		
		int n = inputNumber%10;
		rev = rev*10 +n;
		inputNumber = inputNumber/10;
		
	}
		System.out.println("reversed number is :"+rev);
	
	}
}
