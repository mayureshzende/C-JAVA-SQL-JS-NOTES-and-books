class Operation {
  int num1;//instance varaible
  int num2;//instance varaible

  int add() { return this.num1 + this.num2; }
  int sub() { return this.num1 - this.num2; }
  int mult() { return this.num1 * this.num2; }
  int div() { return this.num1 / this.num2; }
}

class Arithmetic {
  public static void main(String[] args) {
  	int x = 10, y = 20;
  	Operation op1 = new Operation();
  	op1.num1 = x;
  	op1.num2 = y;
  	int res1 = op1.mult();
  	System.out.printf("%d * %d = %d\n",x,y,res1);
  }
}
