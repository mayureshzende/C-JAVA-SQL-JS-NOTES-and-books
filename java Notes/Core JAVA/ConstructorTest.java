class A {
  A() {
  	System.out.println("2");
  }
  A(int x) {
  	System.out.println("3");
  }
}

class ConstructorTest {
  ConstructorTest() {
  	System.out.println("1");
  }
  public static void main(String[] args) {
  	new A();//object without name
  	A obj2 = new A(5);
  	A obj3 = new A();
  }
}