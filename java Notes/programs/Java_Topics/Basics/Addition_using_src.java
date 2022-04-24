package Basics;

public class Addition_using_src {
public static void main(String[] args) {
	int a1=10,b1=20;
	
opreation o=new opreation();

o.a=a1;
o.b=b1;

int res=o.add();
System.out.println("addition is"+res);

	
}
}
 class opreation
 {
	 int a,b;
	 
	 int add()
	 {
		 return this.a+this.b;
		 
	 }
	 
 }