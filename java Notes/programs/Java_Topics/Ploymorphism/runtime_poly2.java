package Ploymorphism;

import java.util.Scanner;

class animal1
{
	void det()	{ System.out.println("in paraent animal");	}
}
class dog1 extends animal1{ void det() { System.out.println("dog barks"); } }
class cat1 extends animal1{ void det() { System.out.println("cat meow");}}

public class runtime_poly2 {
public static void main(String[] args) {
	animal1 a;
	a=new cat1();
	a.det();
	a=new dog1();
	a.det();
	System.out.println(Byte.MAX_VALUE);
	if(-1500000 >=Long.MIN_VALUE && -150>=Integer.MIN_VALUE ){	System.out.println(" yess " + Integer.MIN_VALUE);}
	System.out.println(Long.MIN_VALUE);	
	System.out.println(Long.MIN_VALUE);
	
    Scanner sc=new Scanner(System.in);
String  s0="mayur";
double d=10.0;
String s1="zende";
float ma=(int)20/100.0f;
System.out.println(s0+" "+s1+" "+ma);
    String s=sc.nextLine();
    int no=1;
    sc.nextDouble();
    while(sc.hasNext())
{
System.out.println(no+ " " +sc.nextLine() );
no++;
}   
	
	sc.close();
}
}
