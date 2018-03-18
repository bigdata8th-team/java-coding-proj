package com.java.design_11_flyweight.font;

public class Test {
	public static void main(String[] args) {
		FontFactory myFontFactory = new FontFactory();
		
		Font f1 = myFontFactory.getFlyweight("aa");
		Font f2 = myFontFactory.getFlyweight("bb");
		Font f3 = myFontFactory.getFlyweight("aa");

		f1.getFont();
		f2.getFont();
		f3.getFont();
	}
}
