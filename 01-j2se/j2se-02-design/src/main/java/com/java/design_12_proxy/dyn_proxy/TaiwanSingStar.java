package com.java.design_12_proxy.dyn_proxy;

public class TaiwanSingStar implements ISingStar {

	private String name;
	
	public TaiwanSingStar(String name) {
		this.name = name;
	}
	
	@Override
	public void sing(int price) {
		System.out.println(name + "���ڳ���");
	}

	@Override
	public void eat(int price) {
		System.out.println(name + "���ڳԷ�");
	}

	@Override
	public void dance(int price) {
		System.out.println(name + "��������");
	}

}
