
public class CheckedAndUnCheckedDemo {
	public static void main(String[] args) {
		f1();//No error- Not mandatory to handle unchecked exceptions
		f2();//compiler error:Mandatory to handle ClassNotFoundException
	}
	static void f1() throws NullPointerException {}
	static void f2() throws ClassNotFoundException {}
}
