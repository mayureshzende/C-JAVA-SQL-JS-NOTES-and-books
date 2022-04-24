// package com.lambda.one
import java.util.*;
interface inf{
	public void m1();
} 

class A implements inf{
	public void m1(){
		System.out.println("Hello ");
	}
}
class Lambda{
	public static void main(String[] args) {
			inf i= () -> { System.out.println("hey !!!!!!!!!!");};
			i.m1();

	}
}


/*
@functionalInterface 
interface A {
	public void m1();
}

@FunctionalInterface
Interface b extends A{} // valid declartion avaiable through inhertance 

@FunctionalInterface
interface b extends A(){ public void m1(); } // invaild 

interface b extends A { 
can write any number of abstract method and default and static methods 
}



*/
