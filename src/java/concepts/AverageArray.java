package java.concepts;

import java.util.Arrays;
import java.util.OptionalDouble;

import com.google.common.math.DoubleMath;

public class AverageArray {

	public static void main(String[] args) {
		
		// Calculate average of array using Simple Loop, Java 8 and Google Guava Library
		
		// Simple Loop
		
		int num[] = {1,2,3,4,5,6,7,9,8,7};
		int total = 0;
		
		for(int e : num) {
			
			total = total+e;
		}
		
		System.out.println("total is:" +total); //total is:52
		
		System.out.println("average is:"+(total/num.length)); //average is:5
		
		// Java 8 streams
		
		OptionalDouble  avg = Arrays.stream(num).average();
		
		System.out.println("Average of the Numbers is :"+avg.getAsDouble()); //Average of the Numbers is :5.2
		
		//Google Guava
		
		System.out.println("---using Google Guava---");
		double AvgNumbers = DoubleMath.mean(num);
		
		System.out.println(AvgNumbers); //5.2


	}

}
