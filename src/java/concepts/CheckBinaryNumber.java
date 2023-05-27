package java.concepts;

public class CheckBinaryNumber {

	static void isBinaryNumber(int number) {
		boolean isBinary = true;

		int copyNumber = number;

		while (copyNumber != 0) {
			int rem = copyNumber % 10;
			if (rem > 1) {
				isBinary = false;
				break;
			} else {
				copyNumber = copyNumber / 10;
			}
		}

		if (isBinary) {

			System.out.println(number + " is a binary number");
		} else {

			System.out.println(number + " is not a binary number");
		}

	}
	
	public static void isBin(int number) {
		if(String.valueOf (number) .matches("([0-1])+")) {
		System.out.println(number +" is a binary number");
		}

		else {
			System.out.println(number +" is not a binary number");
		}
	}
	
	public static void isBinNum(int number) {
		try {
		Integer.parseInt(String.valueOf(number), 2);
		System.out.println(number +" is a binary number");
		} catch (Exception e) {
		System.out.println(number +"is not a binary number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isBinaryNumber(101110);
		isBinaryNumber(2500);
		
		isBin(2314);
		isBin(1);
		isBin(01);
		
		isBinNum(565656);
		
		

	}

}
