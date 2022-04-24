class DataTypePuzzles {
  public static void main(String[] args) {
  	DataTypePuzzles.fun(8);//int 
  	DataTypePuzzles.fun(8.8);//double
  	DataTypePuzzles.fun(8.8f);//float
  	DataTypePuzzles.fun((short)8);//short
  }

  //Method overloading
  public static void fun(int x) {
  	System.out.println("int");
  }
  public static void fun(short x) {
  	System.out.println("short");
  }
  public static void fun(float x) {
  	System.out.println("float");
  }
  public static void fun(double x) {
  	System.out.println("double");
  }
}


