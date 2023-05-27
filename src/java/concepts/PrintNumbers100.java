package java.concepts;

public class PrintNumbers100 {

	public static void main(String[] args) {
		
		int one = 'A'/'A'; //gives 1 as remainder
		String s1 = "..........";
		
		for(int i =one;i<=(s1.length() *s1.length()); i++) {
			System.out.println(i);
		}
		
		//2.
		//a=97,b=98,c=99,d=100
		
		System.out.println("-----second method--->");
		
		for(int i =one;i<='d'; i++) {
			System.out.println(i);
		}

	}

}
