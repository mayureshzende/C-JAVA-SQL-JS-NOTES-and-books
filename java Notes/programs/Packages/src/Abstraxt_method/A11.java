package Abstraxt_method;
import java.util.*;
interface Abc{
	void f() ;
	static void f2() {
		System.out.println("static in interface A");
	}
	//int a=10;
	
}
interface B 
{
	void f1();
	
	
}
abstract class B1 implements B
{
	public void f1()
	{
		System.out.println("IN Inerfcae B");
	}	
}
class A11 extends B1 implements Abc{

	

public static void main(String[] args) {
	A11 a=new A11();
	a.f();
	a.f1();
//	a.f2();
	
}
public	void f()
{
	System.out.println("in A class");
}
}