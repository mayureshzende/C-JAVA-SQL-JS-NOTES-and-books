class ToStringDemo {
  public static void main(String[] args) {
    A obj1 = new A();
    A obj2 = new A(7);
    //Convert object into String
    System.out.println(obj1);//x=0
    System.out.println(obj2);//x=7
  }
}

class A {
  int x;
  A() {}
  A(int x) { this.x = x; }
  public String toString() {
  	return "[x=" + this.x +"]";
  }
}