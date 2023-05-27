package java.concepts;

public class ReverseAstring {

	public static void main(String[] args) {
		
		//1.
		String str = "selenium";
		String rev = "";
		
		int leng = str.length();
		
		for(int i =leng-1 ; i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		
		//2.
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//3.

	}

}
