//package com.inheritance

class A {
	A(){}
	
	int x=10 ;
	public void fun(){
		System.out.println(" in class a ");
	}
}
class B extends A {
	B(){}
	int x =20;
	public void fun(){
		System.out.println("on class b");
	}

	void d(){
		System.out.println("d");
	}
}

class overloading{
	public static void main(String[] args){
		A a=new A();
		B b=new B();
		a.fun();
		b.fun();
		System.out.println("a x is "+a.x + " b x is "+ b.x);


		A ob1 = new B();
		ob1.fun();
		ob1.d();
		System.out.println(" asda " + ob1.x);
	}
}