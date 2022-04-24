package basic_programs;

public class Recursion_fibonacci {
	static int count=5,n1=0,n2=1,n3;

	public static void fib(int count)
	{
		
		if(count >0)
		{
			
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.print(" " +n3);	
				fib(count-1);
				
		}
	
	}
	
	public static void main(String[] args) {
		
	System.out.print(n1+" "+n2);
	Recursion_fibonacci.fib(count-2);
	
	}
	
}
