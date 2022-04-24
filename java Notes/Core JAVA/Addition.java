class Addition {
 public static void main(String[] args) {
 	int a = 10, b=20; //local variables
 	int res = Addition.add(a,b);//10 + 20 = 30
 	System.out.println(a+" + "+b+" = "+res);
 	System.out.printf("%d + %d = %d\n",a,b,res);
 }

 static int add(int a, int b) {
 	return a + b;
 }
}

