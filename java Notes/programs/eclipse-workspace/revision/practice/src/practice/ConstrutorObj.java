package practice;

import java.util.zip.Adler32;

public class ConstrutorObj 
{

	public static void main(String[] args) 
	{
		
 A A=new A();
	
A	A2=new A(8);
	
	
	System.out.println(A.x);
	System.out.println(A2.x);
	
	}
}


class  A
{
	int x;
	A()
	{
		System.out.println("default");
	}
	
	A(int a)
	{
		System.out.println("para");
		this.x=a;
	
	}
	
}