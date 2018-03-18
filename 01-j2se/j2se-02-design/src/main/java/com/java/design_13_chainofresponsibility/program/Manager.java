package com.java.design_13_chainofresponsibility.program;

public class Manager implements Chain {

	private Chain nextChain = null;
	private String responsibility = "Get Project";
	@Override
	public void addChain(Chain c) {
		nextChain = c;
	}

	@Override
	public void sendToChain(String mesg) {
		if (mesg.equals(responsibility)) {
			System.out.println("A manager ----> get a project");
		} else {
			if (nextChain != null) {
				nextChain.sendToChain(mesg);
			}
		}
	}

	@Override
	public Chain getChain() {
		return nextChain;
	}

}
