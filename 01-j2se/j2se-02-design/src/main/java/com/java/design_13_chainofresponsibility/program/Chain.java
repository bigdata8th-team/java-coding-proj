package com.java.design_13_chainofresponsibility.program;

public interface Chain {
	public void addChain(Chain c);
	public void sendToChain(String mesg);
	public Chain getChain();
}
