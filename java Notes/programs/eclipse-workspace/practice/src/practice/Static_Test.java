package practice;

public class Static_Test {
public static void main(String[] args) {
	System.out.println(A.count);
	A.fun();
	new A();
	A.count=20;
	System.out.println(A.count+A.count);
}
}

class A
{
	static int count=5;
	//static int count=7l;
	static void fun() 
	{
	System.out.println("a.static");	
	}

}
