package java.concepts;

public class LeaderElements {

	public static void findLeaderElements(int num[]) {
		
		if(num.length==0) { //empty array elements
			return;
		}
		
		if(num.length==1) { //single element
			System.out.println(num[0]);
			return;
		}
		
		int max = num[num.length -1]; // prints last element which is a leader element
		
		System.out.print(max+" ");
		
		for(int i = num.length -2; i>=0; i-- ) { //  takes the last element 
			
			if(num[i]>max) { // compares second element in list with max element which is the last 
				System.out.print(num[i]+" "); // print that elememnt
				max = num[i];
				
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int num[] = {96,3,6,8,66,90,7};	
		
		findLeaderElements(num); //7 90 96
		
		int num1[] = {96,3,6,8,66,90,7,7};	
		
		System.out.println();
		
		findLeaderElements(num1); 
		
		int num2[] = {9,11,10,8,14,3,3};
		System.out.println();
		
		findLeaderElements(num2); 
		
		int num3[] = {9};
		System.out.println();
		
		findLeaderElements(num3); 
		
		int num4[] = {};
		System.out.println();
		
		findLeaderElements(num4); 
		
		int num5[] = {9,9,9,9,9,9};
		System.out.println();
		
		findLeaderElements(num5); 

	}

}
