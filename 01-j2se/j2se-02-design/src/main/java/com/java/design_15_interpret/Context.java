package com.java.design_15_interpret;

import java.util.ArrayList;

public class Context {
	private String content;
	private ArrayList<Expression> list = new ArrayList<Expression>();
	
	public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void add(Expression eps) {
        list.add(eps);
    }
    
    public ArrayList<Expression> getList() {
        return list;
    }

}
