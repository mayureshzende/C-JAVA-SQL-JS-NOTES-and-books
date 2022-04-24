// package com.Lambda.4

import java.util.*; 

interface I {
	default void m1(){
		System.out.println(" default methood "); 
	}
}

class LambdaDefaultMth implements I {

	public void m1(){
		System.out.println("overrided the default method form the interface ");
	}
	public static void main(String[] args ){
		I t=new LambdaDefaultMth();
		t.m1();
	}
}