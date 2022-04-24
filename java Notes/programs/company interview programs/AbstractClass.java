//package com.abstract 

abstract class Shape{
	abstract float getArea();
	abstract String getName();
}

class Square extends Shape {
	float side;
	Square(float side){
		this.side = side;
	}
	float getArea(){
		return side*side;
	}
	String getName(){
		return " area of Square";
	}

}

class AbstractClass{
	static void getShape(Shape s){
		System.out.println(s.getName() + " is " + s.getArea());
	}
	public static void main(String[] args){
		getShape(new Square(5));
	}
}


/*
A{
	A(){
		System.out.println("a constructor");
	}

	abstract void f1();

	void f2(){
		System.out.println("A f2 mwthod");
	}
}

class B extends A {
	B(){
		System.out.println("b constructor ");
	}

	void f1(){
		System.out.println("b f1 method");
	}
}

public static void main(String[] args){
		A a=new B();
		a.f1();
		a.f2();

*/