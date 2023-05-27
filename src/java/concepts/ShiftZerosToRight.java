package java.concepts;

public class ShiftZerosToRight {
	
	private static int[] shiftZeroToRight(int[] a) {
		
		if(a.length ==1) {
			return a;
		}
		
		int newArray[] = new int[a.length];
		int counter = 0;
		for(int number: a) { //non zero numbers
			if(number !=0) {
				newArray [counter] = number;
				counter++;
			}
		}
		return newArray;
		
	}

	public static void main(String[] args) {
		
		// Shift All Zero Elements to Right Side of the Array
		
		int[] i = new int[] {1,0,2,0,3,0,0,0};
		
		System.out.println(shiftZeroToRight(i));
		
		i = new int[] {0,1,0,2,0,3,0,0,0};
		
		System.out.println(shiftZeroToRight(i));
		
		i = new int[] {1,2,3,0,};
		
		System.out.println(shiftZeroToRight(i));
		
		i = new int[] {1,2,3};
		
		System.out.println(shiftZeroToRight(i));
		
		i = new int[] {0,0,0};
		
		System.out.println(shiftZeroToRight(i));
		
		i = new int[] {0};
		
		System.out.println(shiftZeroToRight(i));
		
		i = new int[] {1};
		
		System.out.println(shiftZeroToRight(i));
		
		

	}

}
