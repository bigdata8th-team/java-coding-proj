package com.java.design_12_proxy.dyn_proxy;

public class TaiwanSingStar implements ISingStar {

	private String name;
	
	public TaiwanSingStar(String name) {
		this.name = name;
	}
	
	@Override
	public void sing(int price) {
		System.out.println(name + "正在唱歌");
	}

	@Override
	public void eat(int price) {
		System.out.println(name + "正在吃饭");
	}

	@Override
	public void dance(int price) {
		System.out.println(name + "正在跳舞");
	}

}
