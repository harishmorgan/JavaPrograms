package java.concepts;

public class ArmStrongNumber {

	/*
	 * Check given number is an Armstrong Number / narcissistic Number pluperfect
	 * digital invariant (PRODI) Number/ plus perfect number
	 * 
	 */

	public static boolean isArmStrong(int number) {
		if (number < 0) {
			return false;
		}
		if (number >= 0 && number <= 9) {
			return true;
		}

		int power = power(number); // whatever the number we give it will takes the last digit as power
		int copyNumber = number; // to maintain a copy of number which we can be used for comparison
		int sum = 0; // to calculate the sum of the numbers

		while (copyNumber != 0) {
			int lastDigit = copyNumber % 10;
//			int factorial = 1;
//
//			for (int i = 0; i < power; i++) {
//				factorial = factorial * lastDigit;
//			}
//			sum = sum + factorial;
			
			//Inbuilt function
			
			sum  = (int) (sum+Math.pow(lastDigit, power));
			copyNumber = copyNumber / 10;
		}
		if (sum == number) {
			return true;
		}

		return false;

	}

	private static int power(int num) {
		int n = 0;
		while (num != 0) {
			n++;
			num = num / 10;
		}
		return n;
	}

	public static void main(String[] args) {

		System.out.println(isArmStrong(9));
		System.out.println(isArmStrong(153));
		System.out.println(isArmStrong(12));
		System.out.println(isArmStrong(-1));
		System.out.println(isArmStrong(4444));
		System.out.println(isArmStrong(1534));
		System.out.println(isArmStrong(100));
		

	}

}
