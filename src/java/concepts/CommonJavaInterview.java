package java.concepts;

import java.util.Scanner;

public class CommonJavaInterview {

	public static void main(String[] args) {

		// java program to print an integer (entered by user)

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number:");
		int num = sc.nextInt();

		System.out.println("you entered:" + num);

		// Java program to add two Integers

		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("sum of two Integers is:" + sum);

		// java program to multiply 2 float numbers

		Float f1 = 2.5f;
		Float f2 = 3.5f;

		System.out.println("product of two numbers is:" + f1 * f2);

		// java program to find ASCII value of character

		char c = 'a';
		int ascii = c;

		int asciiNumber = (int) c;
		System.out.println(ascii);
		System.out.println(asciiNumber);

		// Java program to compute quotient and remainder

		int dividend = 60;
		int divisor = 10;

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println(quotient);
		System.out.println(remainder);

		// java program to swap two numbers

		int e = 10;
		int d = 20;
		System.out.println("before swapping");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		System.out.println("after swapping");

		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		// without using third var

		System.out.println("before swapping");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		a = a - b;
		b = a + b;
		a = b - a;

		System.out.println("after swapping");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		// java program to check whether a number is even or odd

		if (num % 2 == 0) {
			System.out.println("entered number is even");
		} else {
			System.out.println("entered number is Odd");
		}

		// java program to whether an alphabet is vowel or consonants
		// a e i o u

		char ch = 'a';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel");

		} else {
			System.out.println(ch + " is consonants");
		}

		// 2.

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;
		default:
			System.out.println(ch + " is consonants");
			break;
		}
		
		//java program to find the largest among three numbers
		
		int x = 100;
		int y = 200;
		int z = 300;
		
		if(x>y && x>z) {
			
			System.out.println("x is the largest among three numbers:");
		} else if(y>z) {
			
			System.out.println("y is the largest among three numbers:");
		} else {
			System.out.println("z is the largest among three numbers:");
		}
		
		//java program to check the leap year
		
		
		//Divisible by 4 for all the century years -- ending with 00
		//century year is leap year only when its perfectly divisible by 400.
		//1900 is not a leap year
		//2012 is a leap year
		
		int year = 1900;
		boolean isLeap = false;
		
		if(year%4 ==0) {
			if(year%100 ==0) {
				if(year%400 ==0) {
					isLeap = true;
				} else {
					isLeap =false;
				}	
				
			}
			else {
				isLeap = true;
			}
			
		} else {
			isLeap = false;
		}
		if(isLeap) {
			System.out.println(year+" is a leap year");
		}else {
			System.out.println(year+" is not a leap year");
		}
	}

}
