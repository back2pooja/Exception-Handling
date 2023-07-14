package com.pj.exception;
//business method
public class Addition {
	public int add(int a ,int b) throws NegativeNumberException{
		if(a<0 || b<0)
		throw new NegativeNumberException("Do not pass negative number");
		return a+b;
	}
	

}
