package abstractclassdemos;

abstract class A {
	A() { System.out.println("A:constructor");}
	abstract void f1();
	void f2() { System.out.println("A:non-abstract");}
}
class B extends A {
	 B() { System.out.println("B:constructor");}

	 void f1() {
		 System.out.println("B:f1");
	 }
}
public class Demo {
	public static void main(String[] args) {
		A obj = new B();
		obj.f1();
		obj.f2();
	}
}



