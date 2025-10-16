package com.romitpal.java8features;

@FunctionalInterface
public interface Test4 {
	
	//what is functional interface ? 
	// Interface having only one abstract method , and is also called SAM -> single interface method .
	// in order to limit the interface with only one abstract method we use @functionalInterace annotation.
	// And it can have any no of default and static methods.
	
	public String show();
	
//	public int add();
	
	
	default void m1() {
		
		
		
	}
	
    default void m2() {
		
		
		
	}

    static void m3() {
	
	
	
   }

    default void m4() {
	
	
	
   }
	

}
