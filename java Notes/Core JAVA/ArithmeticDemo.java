import java.util.Scanner;

class ArithmeticDemo {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
  	while(true) {
  	  int ch = readChoice();
  	  if (ch == 5) { System.exit(0); }
  	  System.out.println("Enter two numbers: ");
  	  int n1 = sc.nextInt();
  	  int n2 = sc.nextInt();
  	  int res = 0;
  	  switch(ch) {
  	  	case 1:
  	  		res = Arithmetic.add(n1,n2);
  	  		printResult(n1,n2,res,'+');
  	  		break;
  	  	case 2:
  	  		res = Arithmetic.sub(n1,n2);
  	  		printResult(n1,n2,res,'-');
  	  		break;
  	  	case 3:
  	  		res = Arithmetic.mult(n1,n2);
  	  		printResult(n1,n2,res,'*');
  	  		break;
  	  	case 4:
  	  		res = Arithmetic.div(n1,n2);
  	  		printResult(n1,n2,res,'/');
  	  		break;
  	  	default: System.out.println("invalid choice..");
  	  }
  	}
  }

  static void printResult(int n1, int n2, int ans, char op) {
  	System.out.printf("%d %c %d = %d\n",n1,op,n2,ans);
  }

  static int readChoice() {
  	System.out.println("1.Add\n2.Sub\n3.Mult\n4.Div\n5.Exit");
  	System.out.println("Enter choice (1-5): ");
  	return sc.nextInt();
  }
}

class Arithmetic {
  static int add(int a, int b) {return a+b; }
  static int sub(int a, int b) {return a-b; }
  static int mult(int a, int b){return a*b; }
  static int div(int a, int b) {return a/b; }
}