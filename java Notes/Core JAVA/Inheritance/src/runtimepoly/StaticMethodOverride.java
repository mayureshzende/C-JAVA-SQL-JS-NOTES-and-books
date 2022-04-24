package runtimepoly;
//Static, private methods can not be overridden

class One {
	public static void fun() {
		System.out.println("One");
		One obj = new Two();
		obj.f();
	}
	private void f() { System.out.println("One:private");}
}



class Two extends One {
	public static void fun() {
		System.out.println("Two");
	}
	private void f() { System.out.println("Two:private");}
}



public class StaticMethodOverride {
	public static void main(String[] args) {
		One obj = new Two();
		obj.fun();//One.fun()
	}
}




















