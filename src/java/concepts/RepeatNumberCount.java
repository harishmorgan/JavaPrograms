package java.concepts;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatNumberCount {

	public static void getDigitCount(long num) {
		
		if(String.valueOf(num).length() ==1) {
			System.out.println(num+":"+1);
			return;
		}

		HashMap<Long, Integer> digitCount = new HashMap<Long, Integer>();

		while (num != 0) {

			long lastDigit = num % 10;

			if (digitCount.containsKey(lastDigit)) {
				digitCount.put(lastDigit, digitCount.get(lastDigit) + 1);
			} else {
				digitCount.put(lastDigit, 1);
			}
			num = num/10;
			
		}

		Set<Long> keys = digitCount.keySet();

		for (Long key : keys) {
			System.out.println(" " + key + ":" + digitCount.get(key));
		}

	}

	public static void main(String[] args) {

		getDigitCount(1234);
		getDigitCount(1111);
		getDigitCount(5);
		getDigitCount(-123);
		getDigitCount(12345678911L);
		
		//2.
		
		 long number = -121;

	        if (number < 0) number = number*-1; 

	        Long.toString(number).chars().boxed()
	                .collect(Collectors.groupingBy(x ->Character.getNumericValue(x),Collectors.counting()))
	                .forEach((x,y) -> System.out.println(x+" : "+y));

	}

}
