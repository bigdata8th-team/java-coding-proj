package com.java.design_04_singleton;

public class Singleton {
	private static Singleton sing;
	
	private Singleton() {
		
	}
	
	// ��ֹͬ������
	public static synchronized Singleton getInstance() {
		if (sing == null) {
			sing = new Singleton();
		}
		
		return sing;
	}
}
