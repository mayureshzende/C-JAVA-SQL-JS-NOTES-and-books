package abstractclassdemos;

abstract class X {
	abstract void f1();
	abstract void f2();
	abstract void f3();
	void f4() { System.out.println("X:f4");}
}
abstract class Y extends X {
	void f2() { System.out.println("Y:f2");}
	void f3() { System.out.println("Y:f3");}
}
class Z extends Y {
	void f1() { System.out.println("Z:f1"); }
}
public class Demo1 {
	public static void main(String[] args) {
		Y obj = new Z();
		obj.f1();
		obj.f2();
		obj.f3();
		obj.f4();
	}
}
