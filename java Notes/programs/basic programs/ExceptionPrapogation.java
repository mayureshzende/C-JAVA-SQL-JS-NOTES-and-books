class ExceptionPrapogation
{
	public static void main(String[] args) {
		

		System.out.println(" start main");
		f1();
		System.out.println("end main");

	}


	static void f1(){
		try {
			System.out.println(" f1 started");
			f2();			
		}catch(NullPointerException nullEx)
		{
			System.out.println(" exception handled");
			nullEx.printStackTrace();
			System.out.println(" f1 ended");
		}
	}

	static void f2()
	{
		try 
		{
			System.out.println(" f2 started");
			f3();
		}catch(ArithmeticException athex)
		{
			System.out.println(" ArthmeticException handled");
			System.out.println(" f2 ended");
		}
	}

	static void f3()
	{
		System.out.println(" start f3");
			String s=null;
			System.out.println(s.length());
			System.out.println(" end f3");
		
	}
}