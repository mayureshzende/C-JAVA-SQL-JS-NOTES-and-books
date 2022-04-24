// package com.lambda.java 
import java.util.*;
import java.util.function.*;
class Employee {
	String name; 
	int eno; 

	Employee(String name , int eno ){
		this.name = name ;
		this.eno = eno;
	}

	public String toString(){
		return name + " -- " + eno ;
 	}
}

class LambdaPredicate{
	public static void main(String[] args ){
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("mayur", 1000 )) ;
		al.add(new Employee("ram", 4000 )) ;
		al.add(new Employee("urerew", 2000 )) ;
		al.add(new Employee("yur", 3000 )) ;
		al.add(new Employee("maar", 6000 )) ;
		al.add(new Employee("ma", 5000 )) ;
		System.out.println(al);

		Predicate<Employee> p = e -> e.eno > 3000 ;
		for(Employee e1 : al ){
			if( p.test(e1)){
				System.out.println(e1.name + " -- " + e1.eno);
			}
		}


	}
}