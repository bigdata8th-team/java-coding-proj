package com.java.design_04_singleton;

public class Singleton {
	private static Singleton sing;
	
	private Singleton() {
		
	}
	
	// 防止同步问题
	public static synchronized Singleton getInstance() {
		if (sing == null) {
			sing = new Singleton();
		}
		
		return sing;
	}
}
