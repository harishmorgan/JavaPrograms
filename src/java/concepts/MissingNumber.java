package java.concepts;

public class MissingNumber {

	public static void main(String[] args) {
		
		// How to find Missing Number In Array 
		
		int a[] = {1,2,3,4,6,7,8,9,10};
		int sum = 0;
		for(int i =0; i<a.length;i++)
		{
			sum = sum +a[i];
		}
		System.out.println(sum);
		
		int sum1 = 0;
		for(int j = 1; j<=10;j++)
		{
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		
		System.out.println("missing number is :::"+(sum1-sum));
	}

}
