package java.concepts;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class GenerateRandomNumbers {
	
	/*Generate Random Number in Java 
	 * 1. Random Class 
	 * 2. Math.random() 
	 * 3.ThreadLocal Random
	 * 
	 * Use cases: Random Number in email: test1234@gmail.com Phone number etc...

*/
	public static void main(String[] args) {
		
		Random random = new Random();
		for(int i = 0; i<=5 ; i++) {
		System.out.println("random Int:"+random.nextInt());
		System.out.println("random double:"+random.nextDouble());
		System.out.println("random Float:"+random.nextFloat());
		System.out.println("random boolean:"+random.nextBoolean());
		
		}
		
		//2. Math.random() 
		
		System.out.println("-----2. Math.random() -------");
		
		for(int j = 0 ;j<=5; j++) {
			System.out.println(Math.random());
		}
		
		//3.ThreadLocal Random
		
		System.out.println("-------3.ThreadLocal Random------");
		
		for(int k = 0; k<=5; k++) {
			System.out.println(ThreadLocalRandom.current().nextInt());
			System.out.println(ThreadLocalRandom.current().nextDouble());
			System.out.println(ThreadLocalRandom.current().nextFloat());
			System.out.println(ThreadLocalRandom.current().nextBoolean());
			
		}
		
		System.out.println("-------RANGE-------------");
		for(int l = 0;l<=5;l++) {
		//random.nextInt(20); 
		//System.out.println((int)Math.random() * 20);
		System.out.println(ThreadLocalRandom.current().nextInt(0,20));
		}
	}

}
