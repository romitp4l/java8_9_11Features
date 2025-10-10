package com.romitpal.java8features;

public interface Test {
	// we can write default and static methods in java 8 interface
	
	
	
	public void display();
	
	// public abstract void display();
	// Both are same as interface only contains abstract methods if you 
	// don't provide the body.
	
	
	
	// The default method in java8 will provide backward compatibility.
	
    default void subtract() {
    	System.out.println(" Inside  Test interface default method ");
    }
	
    
	static void add() {
		System.out.println(" in add method ");
	}
	
//	default void show() {
//		System.out.println(" in the show method");
//	}
//	

	
	
	

	

}
