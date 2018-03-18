package com.java.design_06_adapter;

/*
 * Adapter
      对Adaptee的接口与Target接口进行适配
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
