package com.java.design_09_decorator;

public class Decorator implements Person {

	protected Person person;
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public void eat() {
        person.eat();
    }


}
