package com.web;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class Service1 {
	public void test1() throws IOException{
		throw new IOException("ioException");
	}
	public void test2(){
		throw new RuntimeException("err");
	}
}
