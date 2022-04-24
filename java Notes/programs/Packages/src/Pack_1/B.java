
package Pack_1;
import Pack.*;
public class B {
	final int a=100;
	static int cnt=0;
B()
{
	
	cnt++;
	System.out.println(cnt+" "+a);
}
	
public static void main(String[] args) {
	A a=new A();
	a.msg();
	
	B b=new B();
	B b1=new B();
	B b2=new B();

}
}
