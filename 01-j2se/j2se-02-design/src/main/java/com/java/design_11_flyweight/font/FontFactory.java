package com.java.design_11_flyweight.font;

import java.util.Hashtable;

public class FontFactory {
	// Hashtable��Hashmap��������ǰ�����̰߳�ȫ�ġ�
	private Hashtable<String, Font> charHashtable = new Hashtable<>();
	
	public FontFactory() {
		
	}
	
	public Font getFlyweight(String s) {
		if (charHashtable.get(s) != null) {
			return (Font)charHashtable.get(s);
		} else {
			Font tmp = new ConcreteFont(s);
			charHashtable.put(s, tmp);
			return tmp;
		}
	}
}
