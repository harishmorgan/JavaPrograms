package java.concepts;

public class Practice004 {
	//34 = 31+3 ,5+29,11+23,17+17

public static boolean primeNumbers(int num) {
		
		boolean isPrime = true;
		
		for(int i =2 ; i<=num/2;i++) {
			if(num%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
		
	}
	public static void main(String[] args) {
		
		//System.out.println(primeNumbers(34));
		
		int num =34;
		
		boolean flag = false;
		
		for(int i =2 ; i<=num/2;i++) {
			if(primeNumbers(i)) {
				if(primeNumbers(num-i)) {
					System.out.println(num+ " = "+i+ " + "+(num-i));
					flag = true;
				}
			}
				
			}
		
if(!flag) {
	System.out.println(num+ " cannot be expressed as the sum of two prime numbers ");
}
	}

}
