package com.java.design_11_flyweight.font;

public class ConcreteFont implements Font {
	private String color;
	private int size;
	private String str;
	
	public ConcreteFont(String s) {
		str = s;
	}
	
	@Override
	public void setFont(String color, int size) {
		this.color = color;
		this.size = size;
	}

	@Override
	public void getFont() {
		System.out.println("String:" + str + "color:" + color + "size:" + size);
	}

}
