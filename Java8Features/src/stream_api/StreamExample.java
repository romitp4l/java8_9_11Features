package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		
		// what is collection data structure ?
		// LinkedList , Stack and Queue , ArrayList -> Data Structures 
		
		// Stream -> Stream is used to perform the operation on the collection object.
		
		// How to create stream ?
		
		// First way.
		
		//Stream<String> st = Stream.of("Hi","romit","love");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(123,"Romit",199900000));
		empList.add(new Employee(124,"Ashish",1000004));
		empList.add(new Employee(125,"Karthik",1000400));
		empList.add(new Employee(126,"Aditya",100000));
		empList.add(new Employee(127,"Shubham",13050000));
		empList.add(new Employee(128,"Rahul",103000));
		empList.add(new Employee(129,"Anuj",103300));
		empList.add(new Employee(130,"Munna",104000));
		empList.add(new Employee(131,"Mahtab",120000));
		
		//Write a program to print employee name whose name is starting with k , without java 8
		for(int i = 0 ; i < empList.size(); i++) {
			if(empList.get(i).getEmpName().startsWith("K")) {
				System.out.println(empList.get(i).getEmpName());
			}
		}
		
		
		// using stream (java 8)
		System.out.println("Implimentation using stream :");
		
		empList.stream().filter((r) -> r.getEmpName().startsWith("K")).forEach((t) -> System.out.println(t.getEmpName()));
		
		
		
		//There are two types of stream methods. 
		// 1.Intermediate ops : don't provide output.  filter,map
		// 2.Terminal ops : provides output.
		
		//Write a program to collect emp names into a separate List from empList.
		
		
		List<String> empNameListUsingStream = empList.stream().map((t) -> t.getEmpName()).collect(Collectors.toList());
		
		System.out.println(empNameListUsingStream);
		
		
	}
	
	
	
}

