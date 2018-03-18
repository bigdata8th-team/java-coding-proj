package com.java.design_21_strategy;

public class NewCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		// TODO Auto-generated method stub
		return standardPrice * 0.9;
	}

}
