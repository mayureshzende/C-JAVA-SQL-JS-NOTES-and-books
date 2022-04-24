public class Demo1 {
	public static void main(String[] args) {
		System.out.println("start");
		f1();
		System.out.println("end");
	}
	static void f1() { f2(); }
	static void f2() { f3(); }
	static void f3() { 	int arr[] = new int[3];	System.out.println(arr[10]); }
}
