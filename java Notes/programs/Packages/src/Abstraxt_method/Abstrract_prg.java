package Abstraxt_method;

public class Abstrract_prg {
	static void calculate(Shape1 s)
	{
		System.out.println(s.getName()+" area is = "+s.area());
	}
public static void main(String[] args) {
	calculate(new Square(5.0f));
	calculate(new Rectangle1(3.0f,4.0f));
}
}


abstract class Shape1{
	abstract float area();
	abstract String getName();
}

class Square extends Shape1{
	float s;
	Square(){}
	Square(float s)
	{
		this.s=s;
	}
	 float area()
	{
		return s*s;
	}
	String getName()
	{
		return "Square";
	}
}
class Rectangle1 extends Shape1{
	float l,b;
	Rectangle1() {	}
	Rectangle1(float l,float b) {
	this.l=l;
	this.b=b;
	}
	
	float area()
	{
		return l*b;
	}
	String getName()
	{
		return "Rectangle";
	}
}