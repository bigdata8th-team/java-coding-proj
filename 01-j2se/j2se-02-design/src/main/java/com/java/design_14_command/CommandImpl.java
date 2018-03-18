package com.java.design_14_command;

public class CommandImpl extends Command {

	public CommandImpl(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.receive();
	}

}
