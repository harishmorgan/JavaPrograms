package java.concepts;

import java.util.Arrays;
import java.util.BitSet;
import java.util.stream.IntStream;

public class PrintNumbers {

	public static void main(String[] args) {

		// Print from to 1 to 100 without using any Loop and Recursion

		// 1. Arrays fill

		Object num[] = new Object[100];

		Arrays.fill(num, new Object() {

			int count = 0;

			@Override
			public String toString() {
				return Integer.toString(++count);

			}

		});

		System.out.println(Arrays.toString(num));

		// 2.BitSet :

		String set = new BitSet() {
			{
				set(1, 101);
			}
		}.toString();

		System.out.append(set, 1, set.length());

		// 3.

		BitSet bs = new BitSet(100);
		bs.set(1,101);
		System.out.println(bs);
		
		//4.
		IntStream.iterate(1, i->i+1).limit(100).forEach(System.out::println);

	}
}
