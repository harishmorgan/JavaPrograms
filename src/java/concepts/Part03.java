package java.concepts;

import java.util.Scanner;

public class Part03 {

	public static void main(String[] args) {

		// Java Program to Calculate the Power of a Number

		int base = 3;
		int exponent = 4;

		long result = 1;

		while (exponent != 0) {
			result *= base;
			exponent--;
		}
		System.out.println(result);

		// In Built Function

		System.out.println(Math.pow(base, exponent));

		// Java Program to Check Whether a Number is Palindrome or Not

		int number = 121;
		int rev = 0;

		int actualNumber = number;

		while (number != 0) {
			int n = number % 10;
			rev = rev * 10 + n;
			number = number / 10;
		}
		if (actualNumber == rev) {
			System.out.println(actualNumber + " is a palindrome");
		} else {
			System.out.println(actualNumber + " is not a palindrome");
		}

		// Java Program to Check Whether a Number is Prime or Not

		int num = 13;
		boolean flag = false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % 2 == 0) {
				flag = true;
				break;
			}

		}

		if (!flag) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}

		// Java Program to Display Prime Numbers Between Two Intervals

		int lower = 20;
		int higher = 50;

		while (lower < higher) {

			boolean flagStatus = false;
			for (int i = 2; i < lower / 2; i++) {
				if (lower % i == 0) {
					flagStatus = true;
					break;
				}
			}
			if (!flagStatus) {
				System.out.println(lower + " ");
			}
			lower++;
		}

		// Java Program to Check Armstrong Number
		
		int seqNumbers = 371;
		int actualnumbr = seqNumbers;
		double results = 0;
		
		while(actualnumbr!= 0) {
			int n = actualnumbr%10;
			results = results+Math.pow(n, 3);
			actualnumbr = actualnumbr/10;
		}
		
		if(results == seqNumbers) {
			System.out.println(seqNumbers+" is an armstrong number");
		}else {
			System.out.println(seqNumbers+" is not an armstrong number");
		}
		
		// Java Program to Display Factors of a Number
	       
		int nmbres = 10;
		
		for(int i =1; i<=nmbres;i++) {
			
			if(nmbres%i ==0) {
				System.out.println(i+ " ");
			}
		}
		
		//Java Program to Make a Simple Calculator Using switch...case  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter two numbers:");
		
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		System.out.println("please enter an operator:(+,-,*,/):");
		
		char operator = sc.next().charAt(0);
		
		double resultof = 0;
		
		switch(operator)
		{
		case '+':
			resultof = first+second;
			break;
			
			case '-':
				resultof = first-second;
				break;
				
				case '*':
					resultof = first*second;
					break;
					
					case '/':
						resultof = first/second;
						break;
						
						default:
							System.out.println("please pass the correct operator");
							break;
		}
		
		System.out.println(resultof);
		
		}

}
