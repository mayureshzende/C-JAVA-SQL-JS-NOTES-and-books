package pkg1;

public class B {
	public static void main(String[] args) {
		 A obj = new A();
		 System.out.println("default:" + obj.b);
		 System.out.println("protected:" + obj.c);
		 System.out.println("public:" + obj.d);
	}
}
