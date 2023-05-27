package java.concepts;

public class ReverseString {

	public static void main(String[] args) {
		//using for loop
		String str = "VIJAYA";
		String rev = " ";
//		int len = str.length();
//		for(int i = len -1 ; i>=0; i--) {
//			rev = rev +str.charAt(i);
//			System.out.println("Reversed string is:" +rev);
//		}
		
		char a[] = str.toCharArray();
		int leng = a.length;
		for(int i = leng-1; i>=0; i--) {
			rev = rev+a[i];
			System.out.println("Reversed string is:" +rev);
		}

	}

}
