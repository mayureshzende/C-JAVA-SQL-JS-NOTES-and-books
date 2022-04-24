class SelfConstructorCall {
 public static void main(String[] args) {
 	new A();//1
 	System.out.println("***");
 	new A(3);// 1 2
 	System.out.println("***");

 	new A(5,6);// 1 2 3
 }	
}

class A {
 A() {
 	System.out.println("1");
 }
 A(int x) {
 	this();
 	System.out.println("2");
 }
 A(int x, int y) {
 	this(x);
 	System.out.println("3");
 }
}



