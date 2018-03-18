package com.java.design_07_bridge;

/*
 * Abstraction
 * 定义抽象类的接口。
 * 维护一个指向Implementor类型对象的指针
 */
public abstract class Person {
	private Clothing clothing;
    
    private String type;

    public Clothing getClothing() {
        return clothing;
    }

    public void setClothing(Clothing clothing) {
        this.clothing = clothing;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return this.type;
    }
    
    public abstract void dress();

}
