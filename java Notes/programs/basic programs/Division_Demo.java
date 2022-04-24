class Division_Demo
{
public static void main(String[] args)
{
		System.out.println(" the divison prg using the handle Exceptions");

		int n1=0,n2=0;
		int ans=0;

		try{
			 n1=Integer.parseInt(args[0]);
			n2=Integer.parseInt(args[1]);
			ans=n1/n2;
		}catch(ArrayIndexOutOfBoundsException arrayEx)
		{
			System.out.println(" enter the 2 numberes");
			System.exit(0);
		}
		catch(ArithmeticException ArthEx )
		{
			System.out.println(" the divide by zero error" );


		}
		
		catch(NumberFormatException NumberEx)
		{
			System.out.println(" pass numbers");
		}
		catch(Throwable e)
		{
			//	System.out.println(" Exception ");
			System.out.println( e.printStackTrace());
		}
		finally
		{
			System.out.println(" prg exceuted");
		}
		
		System.out.println(" the division is  "+ ans);
}


}