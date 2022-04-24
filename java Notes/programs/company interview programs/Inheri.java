//package com.inheritance 
 class A {
	int i = 10 ;
	  A()
	{
		System.out.println( this.hashCode() + " a " );
	}
	void fun(){
		System.out.println("parent fun ");
	}
}

class B {//extends A {
	int i= 0 ;
	B(){
		System.out.println( this.hashCode() + " b ");
	}
	void fun(){
		System.out.println("child fun");
	}

	 void test(){
		System.out.println("child test");
	}
}

private class Inheri {
	public static void main(String[] args){
		//A i=new A();
		//i.fun();
		// i.test();

		private Inheri(){
			System.out.println("inheri private ");
		}

		Inheri i = new Inheri();

		// System.out.println(i.hashCode() + " inheri ");

		// System.out.println(i.i);

	}
}