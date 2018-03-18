package base_12_classlib;

import java.math.BigDecimal;

public class Classlib_06_BigDecimal {
	public static void main(String[] args) {
		//0.7/10	0.09-0.05	3.74*10
		System.out.println("0.09+0.01:" + (0.09+0.01));
		System.out.println("0.09-0.05:" + (0.09-0.05));
		System.out.println("3.74*10:" + (3.74*10));
		System.out.println("0.7/10:" + (0.7/10));
		BigDecimal b1 = new BigDecimal("0.09");
		BigDecimal b2 = new BigDecimal("0.01");
		BigDecimal b3 = new BigDecimal("0.7");
		BigDecimal b4 = new BigDecimal("10");
		BigDecimal b5 = new BigDecimal("0.05");
		BigDecimal b6 = new BigDecimal("3.74");
		System.out.println("¼Ó");
		System.out.println("0.09+0.01:" + (0.09+0.01));
		System.out.println(b1.add(b2));//b1+b2
		System.out.println("¼õ");
		System.out.println("0.7/10:" + (0.7/10));
		System.out.println(b3.divide(b4));//b3/b4
		System.out.println("³Ë");
		System.out.println("3.74*10:" + (3.74*10));
		System.out.println(b6.multiply(b4));//b6*b4
		System.out.println("³ý");
		System.out.println("0.09-0.05:" + (0.09-0.05));
		System.out.println(b1.subtract(b5));//b1-b5
		
	}
}
