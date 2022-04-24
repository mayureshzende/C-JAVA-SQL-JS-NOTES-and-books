class Demo1 {
  public static void main(String args[]) {
  	A obj1 = new A( );
		A obj2 = new A(8);
		System.out.println(obj1.x);
		System.out.println(obj2.x);
  }	
}

class A {
  int x;
  A( ) { 
    System.out.println("default");
  }
  
  A(int x) {
     System.out.println("para");
     this.x = x;
  }
}






