package java.concepts;

import java.util.Arrays;

public class LargestAndSmallestNumbers {

	public static void main(String[] args) {
		
		// Largest & Smallest Numbers
		
		int num[] = {-10,24,-20,55,456};
		int largest = num[0];
		int smallest = num[0];
		
		for(int i =1; i<num.length;i++) {
			if(num[i]<largest) {
				largest = num[i];
				
			} else if(num[i]>smallest) {
				smallest = num[i];
			}
		}
		
		System.out.println("given array is: "+Arrays.toString(num));
		System.out.println("largest number is:"+largest);
		System.out.println("smallest number is:"+smallest);
		

	}

}
