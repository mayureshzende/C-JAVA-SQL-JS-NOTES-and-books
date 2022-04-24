package pkg1;

public class A {
  private int a=1;
  int b=2;
  protected int c=3;
  public int d=4;
  
  public static void main(String[] args) {
	 A obj = new A();
	 System.out.println("private:" + obj.a);
	 System.out.println("default:" + obj.b);
	 System.out.println("protected:" + obj.c);
	 System.out.println("public:" + obj.d);

  }
}
