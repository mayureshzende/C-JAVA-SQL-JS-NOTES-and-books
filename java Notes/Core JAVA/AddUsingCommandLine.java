class AddUsingCommandLine {
  public static void main(String[] args) {
  	if(args.length < 2) {
  	 System.out.println("Pass two numbers");
  	 System.exit(0);
  	}
  	int num1 = Integer.parseInt(args[0]);
  	int num2 = Integer.parseInt(args[1]);
  	int res = num1 + num2;
  	System.out.printf("%d + %d = %d\n",num1,num2,res);
  	int res1 = num1 % num2;
  	System.out.printf("%d %% %d = %d",num1,num2,res1);
  	// System.out.println(num1 + "%" + num2 +"=" + res1);
  }
}






