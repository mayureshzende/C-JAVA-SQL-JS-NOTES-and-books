class Sample
{
	public static void main(String[] args )
	{
		float f1=-10.0f;
		float f2= 0.0f;

		System.out.println(" divisiobn of the float is "+ (f1/f2));


		double d1=0;
		double d2=0;

		System.out.println(" division of double is "+ (d1/d2));

		int i1=10;
		int i2=0,i3=0;

		try {
		System.out.println(" division of integer by zero is "+ (i1/i2));
	}catch(ArithmeticException ae)
	{
		System.out.println(" divide by zero ");
	}

	try{
		System.out.println(" division of integer  zero by zero " + (i2/i3));
	}
	catch(ArithmeticException ex)
	{
		System.out.println(" the zero is divided by itself");
	}
	finally
	{
		System.out.println(" the finally is executed");
	}

		// System.out.println("  NaN == NaN is " + NaN == NaN );
		// System.out.println( "  NaN != NaN " + NaN != 10);
		// System.out.println( " NaN == 10  " + NaN == 10);
		// System.out.println( " NaN != 10  " + NaN != 10);


	}
}