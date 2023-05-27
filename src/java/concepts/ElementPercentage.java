package java.concepts;

import java.text.DecimalFormat;

public class ElementPercentage {
	
	public static void getCharPercentage(String str) {
		
		int len = str.length();
		int UpperCaseCount = 0;
		int LowerCaseCount = 0;
		int digitsCount =0;
		int SpecCharCaseCount = 0;
		
		for(int i =0; i<len; i++) {
		char c = str.charAt(i);
		
		if(Character.isUpperCase(c)) {
			UpperCaseCount++;
		}
		else if(Character.isLowerCase(c)) {
			LowerCaseCount++;
		}
		else if(Character.isDigit(c)) {
			digitsCount++;
			
		} else{
			
			SpecCharCaseCount++;
		}
		}
		
		double uppercasecount = UpperCaseCount*100.0/len;
		double lowercasecount = LowerCaseCount*100.0/len;
		double digitscount    = digitsCount*100.0/len;
		double specialcasecount = SpecCharCaseCount*100.0/len;
		
		System.out.println("In given string str:"+str);
		
		DecimalFormat formatter = new DecimalFormat("##.##");
		
		System.out.println("uppercasecountpercentage---->:"+uppercasecount);
		System.out.println("lowercasecountpercentage---->:"+lowercasecount);
		System.out.println("digitscountpercentage---->:"+digitscount);
		System.out.println("specialcasecountpercentage---->:"+specialcasecount);
		
		System.out.println(uppercasecount+lowercasecount+digitscount+specialcasecount);
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		getCharPercentage("Naveen");
		 
		System.out.println("scenario-->1");
		
		getCharPercentage("Naveen Automation Labs");
		
		System.out.println("scenario-->2");
		
		getCharPercentage("Naveen Automation Labs 1234");
		
		System.out.println("scenario-->3");
		
		getCharPercentage("Naveen Automation Labs 1234 !@#$%^&");
		
		getCharPercentage("N");
		getCharPercentage("n");
		getCharPercentage("1");
		getCharPercentage("$");
		
		getCharPercentage(" ");
		
		
		

	}

}
