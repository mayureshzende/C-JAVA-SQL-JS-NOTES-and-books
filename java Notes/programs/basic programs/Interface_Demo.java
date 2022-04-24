
interface A{
	int a=10;
	void f1();
}


interface B{

	void f2();
}

class Test implements A,B
{
	public void f1()
	{
		System.out.println(" in implemented class function f1 ");
	}

	public void f2()
	{
		System.out.println(" in the implemented class function f2");
	}
}

class Interface_Demo{

	public static void main(String[] args) {
		
		Test t=new Test();
		t.f1();
		t.f2();
		System.out.println(t.a);
	}
	
}