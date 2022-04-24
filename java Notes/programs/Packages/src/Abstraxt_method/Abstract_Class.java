package Abstraxt_method;

abstract class Shape{
	
	Shape()
	{
		System.out.println("shape constructor");
	}
	abstract void draw();
	void shape()
	{
		System.out.println("shape is drawn");
	}
}

class Rectangle extends Shape{
	static {
		System.out.println("rectnangle static");
	}
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape{
		
	static{
		System.out.println("cricle static consructor");
		
	}
	void draw()
	{
		System.out.println("drawing circle");
	}
}


public class Abstract_Class {
public static void main(String[] args) {
	Shape s;
	s=new Circle();
	s.shape();
	s.draw();
	s=new Rectangle();
	//s.draw();
}
}
