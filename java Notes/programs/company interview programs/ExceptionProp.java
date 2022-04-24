//package com.exceptiom

class ExceptionProp{
	public static void main(String[] args){

		System.out.println("main start");
		f1();
		System.out.println("main end");
	}
	static void f1(){
		System.out.println("f1 start");
		try{
		f2();
	}catch(NullPointerException ne ){}
		System.out.println("f1 end");
	}
	

	static void f2(){
		System.out.println("f2 start ");

		f3();

		System.out.println("f2 end");
	}
	static void f3() {
		System.out.println("f3 start ") ; 
		String s=null ;
		try{
			System.out.println(s.length());
		}catch(NumberFormatException n){};
		System.out.println("f3 end");
	}
}