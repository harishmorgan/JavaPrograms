package java.concepts;

public class IsNumber {
	
	public static boolean isCorrectPhnNumber(String correctNumber) {
//		return correctNumber.matches("[0-9] {10}");
		return correctNumber.matches("//d{10}");
	}
	
	public static boolean isCorrectNumber(String corrctNumber) {
		return corrctNumber.matches("^(-?\\d+\\.)?-?\\d+$");
	}
	
//	public static boolean isNumber(String number) {
//		try {
//		Long.parseLong(number);
//		System.out.println("this a valid Number:" +number);
//		
//		} catch(NumberFormatException e) {
//			System.out.println("this not a valid Number:" +number);
//			return false;
//			
//		}
//		return true;
//	}
		
		
		public static boolean isValidPhnNumber(String phNumber) {
			
			if(phNumber.length() == 10 && isCorrectNumber(phNumber)) {
				System.out.println("It is a valid phone Number:" +phNumber);
				return true;
			}
				System.out.println("Not a valid phone Number:" +phNumber);
				return false;
	}
		
public static boolean isValidCCNumber(String ccNumber) {
			
			if(ccNumber.length() == 16 && isCorrectNumber(ccNumber)) {
				System.out.println("It is a valid credit card Number:" +ccNumber);
				return true;
			}
				System.out.println("Not a valid credit card Number:" +ccNumber);
				return false;
	}

	public static void main(String[] args) {
		
		// Check given String is a valid number in Java
		
		//System.out.println(isNumber("12345"));
		System.out.println(isValidPhnNumber("9550078890"));
		System.out.println(isValidCCNumber("1234512345123456"));
		System.out.println(isCorrectPhnNumber("0000000000"));
		System.out.println(isCorrectNumber("100.12"));
		System.out.println(isCorrectNumber("-100.12"));
		System.out.println(isCorrectNumber("-120"));
		System.out.println(isCorrectNumber("120A"));
		System.out.println(isCorrectNumber("-120A"));
		System.out.println(isCorrectNumber("-9550078890"));
		System.out.println(isCorrectNumber("9550078890"));
		
		
	}

}
