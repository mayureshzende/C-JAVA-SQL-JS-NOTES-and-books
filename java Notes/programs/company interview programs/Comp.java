//package com.compare
import java.util.*;
class Employee implements Comparable {

	int id; 
	String name; 
	
	Employee(int id , String name){
		this.id = id ;
		this.name = name ;
	}

	public String toString(){
		return "{ id " + id  + " name is " + name +" }" ; 
	}
	public int compareTo(Object obj1){
		Employee e = (Employee)obj1;
		int e1=this.id;
		int e2= e.id ;

		if(e1 < e2 ){
			return +1 ;
		}else if(e1 > e2 ){
			return -1 ;
		}else {
			return 0 ;
		}

	}
}

class Comp{
	public static void main(String[] args){
		Employee e1 =new Employee(1,"mayur ");
		Employee e2 = new Employee(3,"Kass");
		Employee e3 =new Employee(4,"shir");
		Employee e4 = new Employee(2,"star");

		TreeSet t= new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);

		System.out.println(t); 

		TreeSet t2 = new TreeSet(new MyComparator());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);

		System.out.println(t2);
	}
}

class MyComparator implements Comparator {
	public int compare(Object obj1 , Object obj2){

		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;

		String s1 = (String)e1.name;
		String s2= (String)e2.name;


		return s2.compareTo(s1);
	}
}