package Basics;
import java.util.*;

public class To_Strings {

	public static void main(String[] args) {
		A1 a=new A1();
		A1 a1=new A1(3);
	System.out.println(a);
	System.out.println(a1);
	}
}

class A1
{
	int a=1;
	A1()
	{
		
	}
	
	A1(int a)
	{
		this.a=a;
	}
	public String toString() {
		return ("A="+this.a);
	}
}
