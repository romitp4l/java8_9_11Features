package com.romitpal.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1  {

//	@Override
//	public void display() {
//		// TODO Auto-generated method stub
//		
//		System.out.println(" in Example 1 display method ");
//		
//	}
//	
	
	// way to access the dafault methods of the interface class
	
//	public void abc() {
//		
//		// InterfaceName.super.methodName();
//		
//		// we are doing this because we are accessing a non static method 
//		// from main method that is static in nature.
//		
//		Test.super.subtract();
//		
//		
//		
//	}
	
	// static methods of the interfaces can't be overridden
	
	static void add() {
		System.out.println(" in the add method of Example 1");
	}
	
	
	public static void main(String[] args) {
		
		// To access static method present in the interface
		// InterfaceName.staticMethodName()
		
		Test.add();
		
		
		
		
		Example1 e1 = new Example1();
	//	e1.abc();
		
		
		
		// what is the importance of static interface methods
	
		//ArrayList is non-synchronized
		
		List<Integer>  l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		
		// to make l arraylist synchronized
		//Collection - Interface 
		//Collections - Class
		Collections.synchronizedList(l);
		
		
		
		// Lambda Corresponds to an interface and specifically abstract method 
		//present in interface
		
		String s = "Romit";
		int  i = 10;
		
//		Test t = ()-> {
//			System.out.println("in Example 1 display method ");
//		};
		
		// for single statement in if/else block we don't need curly braces  similiarly here
		
		
		
		//Test t = ()-> System.out.println("in Example 1 display method implimentation ");
		
		Test t = () ->{
			int y = 10;
			System.out.println("Inside display method implimentation in Example 1 class . "+y);
		};
		
		t.display();
		
		
	}
	

}
