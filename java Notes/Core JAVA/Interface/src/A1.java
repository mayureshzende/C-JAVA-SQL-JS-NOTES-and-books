public interface A1 {
	int a = 10;//public static final
	void f1();//public abstract
	void f2();
}
class B implements A1 {
	public void f1() { System.out.println("f1");}
	public void f2() {  System.out.println("f2");}
}
class Test {
	public static void main(String[] args) {
		A1 obj = new B();
		obj.f1();
		obj.f2();
		System.out.println(A1.a);
	}
}