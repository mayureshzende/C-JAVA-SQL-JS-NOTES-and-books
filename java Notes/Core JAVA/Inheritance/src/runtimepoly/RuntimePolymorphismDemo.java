package runtimepoly;
//For compilation left-side type(reference) is considered and 
//For execution right-side type is considered

class A {
	void f1() { System.out.println("A:f1");}
}
class B extends A {
	void f2() { System.out.println("B:f2");}
}
class C extends B {
     void f1() { System.out.println("c:f1");}
	void f2() { System.out.println("C:f2");}
	void f3() { System.out.println("C:f3");}
}

public class RuntimePolymorphismDemo {
	public static void main(String[] args) {
		//Compilation with B, Run with C
		B obj2 = new C();
		obj2.f1();//A:f1
		obj2.f2();//C:f2
		//obj2.f3();-compilation error
	}
}
//tomorrow:
//coffee puzzle, static method test, object slicing, instanceof, 
//abstarct class, interface, package
//Exception Handling,Multitherading,Collection 







