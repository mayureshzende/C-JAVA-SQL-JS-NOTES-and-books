class VarArgDemo {
	public static void main(String[] args){
		System.out.println(add(4,6));
		System.out.println(add(4,5,6));
		System.out.println(add(1,3,4,5,5,6));
	}

	static int add(int ...a) {
	   int sum = 0;
	   for(int i=0;i<a.length;i++) {
	   	sum = sum + a[i];
	   }
	   return sum;
	}
	static int add(int a, int b) { 
		return a+b;
	}

}