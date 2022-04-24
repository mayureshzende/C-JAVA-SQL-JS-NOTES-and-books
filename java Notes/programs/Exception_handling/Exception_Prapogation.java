package Exceptions_prg;
import java.util.*;
public class Exception_Prapogation {
public static void main(String[] args) {
	f1();
}
static void f1() {
	System.out.println("f1 :started");
	try{f2();}
	catch(NullPointerException np)
	{
		System.out.println("string is null");
	}
	System.out.println("f1:ended");
	
			
}
static void f2() {
	System.out.println("f2:started");
	f3();
	System.out.println("f2:ended");
}

static void f3() {
	System.out.println("f3:started");
	String s=null;
System.out.println(s.length());
System.out.println("f3:started");
}

}


