package java.concepts;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//Using Algorithm
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt(); //1234
//		int rev = 0;
//		while(num!=0) {
//			rev = rev*10 + num%10;
//			num = num/10;
//		}
//		System.out.println("Reverse Number is:" +rev);
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse Number is:" +rev);
		
		StringBuilder sbf = new StringBuilder();
		sbf.append(num);
		sbf.reverse();
		System.out.println("Reverse Number is:" +rev);
		

	}

}
