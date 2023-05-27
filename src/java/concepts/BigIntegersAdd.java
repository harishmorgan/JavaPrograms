package java.concepts;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegersAdd {

	public static void main(String[] args) {
		
		BigInteger n1 = new BigInteger("12345678900987654321456654789321987741852963753");
		BigInteger n2 = new BigInteger("12345678900987654321456654789321987741852963753");
		
		BigInteger sum = n1.add(n2);
		System.out.println(sum);
		
		BigInteger mul =n1.multiply(n2);
		System.out.println(mul);
		
		BigDecimal d1 = new BigDecimal("1234.567897418529633214567899517538413247");
		BigDecimal d2 = new BigDecimal("1234.567897418529633214567899517538413247");
		
		BigDecimal addit = d1.add(d2);
		System.out.println(addit);
		
		BigDecimal mulit = d1.multiply(d2);
		System.out.println(mulit);
	}
	

}
