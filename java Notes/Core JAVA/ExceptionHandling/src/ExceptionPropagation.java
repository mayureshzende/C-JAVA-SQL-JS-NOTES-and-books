
public class ExceptionPropagation {
	public static void main(String[] args) {
		System.out.println("start-main");
		f1();
		System.out.println("end-main");
	}
	static void f1() {
		System.out.println("start-f1");
		try { 
			f2();
		}catch(NullPointerException e) { System.out.println("Excepiton handled");}
		System.out.println("end-f1");
	}
	static void f2() {
		System.out.println("start-f2");
		f3();
		System.out.println("end-f2");
	}
	static void f3() {
		System.out.println("start-f3");
		String s = null;
		System.out.println(s.length());//NullPointerException
		System.out.println("end-f3");
	}

}
