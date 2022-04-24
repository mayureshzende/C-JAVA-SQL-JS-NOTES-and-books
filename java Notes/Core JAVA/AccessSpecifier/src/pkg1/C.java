package pkg1;

public class C extends A {
	public static void main(String[] args) {
		 C obj = new C();
		 System.out.println("default:" + obj.b);
		 System.out.println("protected:" + obj.c);
		 System.out.println("public:" + obj.d);

	}
}
