
package Basics;

class a{
	a(){}
	a(int a)
	{
		System.out.println(a+"in para");
	}
}

class b extends a{
	b(){
	super(1);
	System.out.println("in b class ");
	}
	
}


public class Const_chaning {

	public static void main(String[] args) {
		b a=new b();
	}
	
}
