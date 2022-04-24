//static variable and static functions
//We don't need object of class to access static members

class StaticTest {
  public static void main(String[] args) {
  	System.out.println(A.count);
  	A.fun();
  }
}

class A {
  public static int count = 5;
  public static void fun() {
  	System.out.println("A:static");
  }
}