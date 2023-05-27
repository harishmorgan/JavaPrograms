package java.concepts;

public class MissingElement {
	
	public static int getFindMissingNumber(int num[], int totalCount ) {
		
		int expectedSum = totalCount * ((totalCount+1)/2);
		int actualSum = 0;
		
		for(int i : num) {
			actualSum +=i;
		}
		return expectedSum-actualSum;
		
	}

	public static void main(String[] args) {
		
		int num[] = {1,2,3,5};
		int result = getFindMissingNumber(num,5);
		System.out.println(result); // 4
		

	}

}
