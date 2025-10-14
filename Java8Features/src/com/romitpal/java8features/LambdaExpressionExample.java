package com.romitpal.java8features;

public class LambdaExpressionExample {
	public static void main(String[] args) {
		// we need not to implement Test2 interface to access its method.
		// we will use lambda expression.
		
		String x ="Romit";
		
//		Test2 r = (t) -> {
//			System.out.println(t);
//			return t;
//		};
		
		//or we can write it directly as 
		
	//	Test2 r = (t) -> t;
		
		Test2 r = (t) ->
		{
			int c = 10;
			double z = 10.0;
			System.out.println(t);
			// as return type is int  and multiple line statement so we have to specifically need to use return keyword
			return t;
		};
		
		System.out.println(r.show(20));
		
		
		Test3 t3 =(f) ->{
			
			System.out.println(f);
			
		};
		
		t3.show("Romit Pal");
		
		
		Test4 t4 =() ->{
			return "Java features class From Test4 interface implemented in LambdaExpressionExample class";
			
		};
		
		System.out.println(t4.show());
		
		
	}

}
