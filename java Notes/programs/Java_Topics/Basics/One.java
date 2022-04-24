package Basics;
import java.util.*;

public class One  {
	final int a;
	static {
		System.out.println("in static");
		
	}
	One()
	{
		System.out.println("default constructor");
		this.a=10;
		System.out.println(a);
	}

	public static void main(String[] args) {
		final int a;
		new One();
		new B1();	
		new A11();
		
	}
}
class A11{
	{
		System.out.println("instance A");
	}
	static{
		System.out.println("static A11");
	}
	A11()
	{
	System.out.println('A');	
	}
	
	int num=10;
	
	
}
class B1 extends A11
{
	int num=20;
	{
		System.out.println("Instance B");
	}
	static
	{
		System.out.println("static B11");
		new B1().Fun();
	}
	B1()
	{
		System.out.println("B");
	}
 void Fun()
	{
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

