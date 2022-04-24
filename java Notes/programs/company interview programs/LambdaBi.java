//package com.lambda.Bi
import java.util.*;
import java.util.function.*;
class Employee {
	int eno;
	String name; 

	Employee(int eno, String name ){
		this.eno = eno;
		 this.name = name;
	}
}

// class Employee {
// 	int sal ;
// 	 Employee(int sal ){
// 	 	this.sal = sal ; 
// 	 }
// }
class LambdaBi{
	public static void main(String[] args){
		ArrayList<Employee> al = new ArrayList<Employee>();

		BiFunction<Integer,String,Employee> f = (eno,name) -> new Employee(eno,name);
		 BiConsumer<Employee,Double> c= (e,d) -> e.eno += d ;  
		
		 	BiPredicate<Integer,Integer> p = (a,b) -> ((a+b)%2==0) ;
		 	System.out.println(p.test(10,25)+" ---------");
		al.add(f.apply(1,"mayur"));
		al.add(f.apply(2,"yur"));
		al.add(f.apply(3,"r"));
		al.add(f.apply(4,"ur"));

		 for(Employee e : al ){
		 	c.accept(e,10.0);
		 }


		for(Employee e : al) {
			System.out.println(e.eno );
				System.out.println(e.name);
			System.out.println();
		}

	}
}