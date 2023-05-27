package java.concepts;

public class StringToInteger {
	
	public static int stringToInteger(String str) {
		
		int num = 0;
		int len = str.length(); // 4
		
		for(int i =0; i<len;i++) {
			
			//formula
			num = num*10+((int)str.charAt(i)-48); // 0+1 = 1; 10+2 =12 ; 120+3 =123; 1230+4 = 1234
			
		}
		return num;
		
	}
	
	public static int convertToInteger(String str) {
		
		if(str.length()==1) {
			return (int)str.charAt(0) -48;
		}
		
		char ch[] = str.toCharArray();
		int sum = 0;
		int zeroAsc = (int) '0';
		for(int j = 0;j<ch.length;j++) {
		int asci =	(int)ch[j];
			sum = sum*10+(asci-zeroAsc);
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		String str = "1234";
		
		String s = "1";
		
		System.out.println(stringToInteger(str)+10); //1244
		
		System.out.println(convertToInteger(str)+10); //1244
		
		System.out.println(convertToInteger(s)+10);
		

	}

}
