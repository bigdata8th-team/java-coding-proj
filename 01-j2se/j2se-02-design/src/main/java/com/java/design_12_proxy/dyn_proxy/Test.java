package com.java.design_12_proxy.dyn_proxy;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		ISingStar star = new TaiwanSingStar("≤Ã“¿¡÷");
		StarInvokation si = new StarInvokation(star);
		
		ISingStar proxy = (ISingStar)Proxy.newProxyInstance(
				Test.class.getClassLoader(), 
				new Class[]{ISingStar.class}, 
				si);
		
		proxy.dance(100000);
		proxy.eat(100);
		proxy.sing(2000000);
	}
}
