package com.java.design_22_template;

public abstract class Template {

    public abstract void print();
    
    public void update() {
        System.out.println("��ʼ��ӡ");
        for (int i = 0; i < 10; i++) {
            print();
        }
    }
}
