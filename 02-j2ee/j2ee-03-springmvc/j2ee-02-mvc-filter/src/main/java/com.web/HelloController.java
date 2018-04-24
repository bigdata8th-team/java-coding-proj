package com.web;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/demo")
public class HelloController implements Serializable {
	
	@Resource
	private Service1 service;
        
	 @ExceptionHandler
	    public String handleException(Exception e, 
	        HttpServletRequest request, HttpServletResponse response) 
	        throws Exception {
	        if(e instanceof NumberFormatException) {
	            request.setAttribute("message", "«Î ‰»Î ˝◊÷");
	            return "jsp/message";
	        }else if(e instanceof IOException) {
	            request.setAttribute("message", e.getMessage());
	            return "jsp/message";
	        }else {
	            //throw e;
	        	request.setAttribute("message", e.getMessage());
	        	return "jsp/message";
	        }
	    }
		
    @RequestMapping("/hello.do")
    public String hello() {
        System.out.println("hello");
        Integer.valueOf("abc");
        return "jsp/hello";
    }
    
    @RequestMapping("/hi.do")
    public String hi() {
        System.out.println("hi");
        String name = "abc";
        name.charAt(9);
        return "jsp/hello";
    }
    
    @RequestMapping("/nihao.do")
    public String nihao(String name) {
    	System.out.println(name);
        System.out.println("ƒ„∫√");
        return "jsp/hello";
    }
    
    @RequestMapping("/exception1.do")
    public String exception1() throws IOException {
    	System.out.println("exception1.do");
    	service.test1();
    	return "jsp/hello";
    }
    
    @RequestMapping("/exception2.do")
    public String exception2(){
    	System.out.println("exception2.do");
    	service.test2();
    	return "jsp/hello";
    }       
}