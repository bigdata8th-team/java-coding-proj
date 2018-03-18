package com.java.design_06_adapter;

/*
 * Adapter
      ��Adaptee�Ľӿ���Target�ӿڽ�������
 */
public class Adapter implements Target {

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

	@Override
	public void adapteeMethod() {
		adaptee.AdapteeMethod();
	}

	@Override
	public void adapterMethod() {
		System.out.println("Adapter method!");
	}

}
