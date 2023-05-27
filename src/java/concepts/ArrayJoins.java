package java.concepts;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

public class ArrayJoins {

	public static void main(String[] args) {
		
		/* Join Two Arrays using  Java  8 and Google Guava Library */
		
		String[] batsmen = {
				"Tendulkar",
				"Ganguly",
				"Dravid",
				"Kaife",
				"Yuvaraj",
				"kapildev",
				"lara"};

		String[] bowlers = {"shoiab",
				"Muaralitharan",
				"pathan",
				"harbhajan" };
		
		//using  Java  8
				
		 Stream<String>  btsmen = Arrays.stream(batsmen);
		 Stream<String>  blsmen = Arrays.stream(bowlers);
		 
		 String fullTeam[] = Stream.concat(btsmen, blsmen).toArray(size -> new String[size]);
		 for(String india : fullTeam) {
			 System.out.println(india);
		 }
		 
		 //using  Google Guava Library
		 //for objectArrays
		 System.out.println("---***using  Google Guava Library***---");
		String IndiaTeam[] = ObjectArrays.concat(batsmen, bowlers, String.class);
		
		for(String myTeam : IndiaTeam ) {
			System.out.println(myTeam);
		}
		
		//for primitive Arrays
		
		 System.out.println("---***using primitive Arrays***---");
		
		int n[] = {1,2,3,4,5};
		int t[] = {6,7,8,9,0};
		int r[] = {10,11,12,13};
		
		int young[] = Ints.concat(n,t,r);
		
		for(int tiger : young) {
			System.out.println(tiger);
		}
		
	}

}

