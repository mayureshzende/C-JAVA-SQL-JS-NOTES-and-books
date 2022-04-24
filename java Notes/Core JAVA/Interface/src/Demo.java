interface X { void f1(); void f2(); void f3(); }
abstract class Y implements X {
	public void f2() { }
	abstract void f4();
}

abstract interface B1 { }

public class Demo extends Y implements X {
		public void f1() {}
		public void f3() {}
		void f4() {}
}
