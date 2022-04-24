package Ploymorphism;
class a
{

	final int a=2;
 final void shw()
	{
		System.out.println(a);
	}
}
class b extends a{
	final int m;
b()
	{
		m=10;
		System.out.println(m);
	}
	
}

public class Final_ex {
	static final int n;
	static {n=7;}
public static void main(String[] args) {
	new  b().shw();
System.out.println(n);
}
}
