//package com.inhertiance

class Ele{
	{
		System.out.println("ele instance");
	}

	static{
		System.out.println("ele static ");
	}

	Ele()
	{
		System.out.println("ele consturctor");
	}
}


class Tv extends Ele {
	{
		System.out.println("tv instance");
	}

	static{
		System.out.println("tv static ");
	}

	Tv(){
		System.out.println("tc consturctor");
	}

}

class Inst{

	{
		System.out.println(" inst ints");
	}
	Inst(){
		System.out.println("inst const");
	}

	static{
		System.out.println("static inst");
		fun();
	}

	static void fun(){
		System.out.println("fun invoke by static() in inst"); 
	}

	public static void main(String[] args){
		System.out.println("main mth");
		Tv t = new Tv();
	}
}