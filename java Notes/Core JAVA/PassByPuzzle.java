class PassByPuzzle {
	int x;
	PassByPuzzle(int x) {this.x = x;}
	public static void main(String[] args) {
	  int x = 10;
	  PassByPuzzle obj = new PassByPuzzle(10);
	  fun(x,obj);
	  System.out.println("x="+x+",obj.x="+obj.x);//10 1000
	}

	static void fun(int x, PassByPuzzle obj) {
		x = x * x;
		obj.x = obj.x * x;
	}
}