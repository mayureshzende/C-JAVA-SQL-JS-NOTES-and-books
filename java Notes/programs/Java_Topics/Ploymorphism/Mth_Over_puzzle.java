package Ploymorphism;
import java.util.*;

class green {
	public static void f()
	{
		System.out.println(" in parent");
	}
	
	
	public static void fun() {
		System.out.println("in parent fun");
	}
}
class lightgreen extends green{
	public static void f()
	{
		System.out.println("in child method");
	}
	public static void fun()
	{
		System.out.println("in child fun");
	}
	
	
}



public class Mth_Over_puzzle {
public static void main(String[] args) {
	lightgreen g=new lightgreen();
	System.out.println(g instanceof green);
	System.out.println(g instanceof Object);
	
	
	
}
}
