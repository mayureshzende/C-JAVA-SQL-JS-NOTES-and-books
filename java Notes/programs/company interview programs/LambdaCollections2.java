//package com.java.3 

import java.util.*;

class Employee {
	String name ;
	int eno; 

	Employee(String name , int eno ){
		this.name = name ;
		this.eno = eno ; 
	}

	public String toString (){
		return eno +" -- " + name ;  
	}
}

class LambdaCollections2 {
	public static void main(String[] args ){

		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee("mayur" ,1 ));
		al.add(new Employee("dada" ,100 ));
		al.add(new Employee("aur" ,11 ));
		al.add(new Employee("y" ,132 ));
		System.out.println(al);

		// Comparator<Employee> c= (e1 , e2 ) -> (e1.eno < e2.eno ) ? -1 : (e1.eno>e2.eno) ? +1 : 0 ;
		Comparator<Employee> c = (e1,e2) -> (e1.name.compareTo(e2.name));
		Collections.sort(al,c);

		System.out.println(al);

	}
}