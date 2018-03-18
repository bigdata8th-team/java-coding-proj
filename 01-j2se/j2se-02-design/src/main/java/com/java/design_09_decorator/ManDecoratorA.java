package com.java.design_09_decorator;

public class ManDecoratorA extends Decorator {
	public void eat() {
        super.eat();
        reEat();
        System.out.println("ManDecoratorA¿‡");
    }

    public void reEat() {
        System.out.println("‘Ÿ≥‘“ª∂Ÿ∑π");
    }

}
