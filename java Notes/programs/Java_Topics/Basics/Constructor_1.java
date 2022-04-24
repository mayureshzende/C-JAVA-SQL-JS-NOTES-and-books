package Basics;
import java.util.*;

public class Constructor_1 
{
	public static void main(String[] args) 
	{
		//Constructor_1 c=new Constructor_1();
		new A7();
		new A7(1);
		A7 a=new A7();
		new Constructor_1();
	}
	public Constructor_1()
	{
		System.out.println("default constructor");
	}
}
class A7
{
	public static void main(String[] args) {
		
		}
	A7()
	{
			System.out.println(" A ");
	}
	A7(int a)
	{
		this();
		System.out.println("2");
	}
}
