package com.romitpal.java8features;

public class Example2 implements Test {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println(" in Example 2 display method");
		
		
	}
	
	@Override
	public void subtract() {
			System.out.println(" Example 2 class overridden subtract method ");
	}
	
	public void bd() {
		Test.super.subtract();
	}
	 
	
	public static void main(String[] args) {
		Example2 e2 = new Example2();
		e2.subtract();
		e2.bd();
		
	}
	

}
