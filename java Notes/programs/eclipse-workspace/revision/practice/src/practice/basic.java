package practice;

import java.io.*;

public class basic {
	public static void main(String[] args) {

		
	int a=10,b=20;
	basic b1=new basic();
	int res=b1.add(a,b);
	
	//System.out.println("res"+res);
	//System.out.printf(a + "+" + b + "=" + res);
	System.out.printf("%d + %d = %d",a,b,res);
		//hi.sayhi();
	}
	
	 int add(int a,int b) 
	{
	return a+b;	
	}
}	

   class hi
	{
		public static void main(String[] args) 
		{
			
			System.out.println("2 nd ");
			
		}
		static void sayhi()
		{
			System.out.println(" 2 fun call");
		}
			
	}


