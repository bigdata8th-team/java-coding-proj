package com.java.design_14_command;

public abstract class Command {
	protected Receiver receiver;
    
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }
    
    public abstract void execute();

}
