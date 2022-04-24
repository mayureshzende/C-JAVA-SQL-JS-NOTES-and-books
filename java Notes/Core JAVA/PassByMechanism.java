//Pass by mechanism for primitive type

class PassByMechanism {
  public static void main(String[] args) {
  	int i = 5;
  	change(i);
  	System.out.println(i);
  }

  static void change(int i) {
  	i = i * i;
  }
}