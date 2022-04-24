package pkg2;
import pkg1.A;
public class D extends A {
	public static void main(String[] args) {
		 D obj = new D();
		 System.out.println("protected:" + obj.c);
		 System.out.println("public:" + obj.d);

	}
}
