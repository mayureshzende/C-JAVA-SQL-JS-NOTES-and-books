class ArraySquare {
  public static void main(String[] args) {
  	int[] arr = {1,2,3,4,5};
  	square(arr);
  	for(int e: arr) { System.out.println(e);}
  }
  static void square(int[] a) {
  	for(int i=0; i < a.length; i++) {
  	 a[i] = a[i] * a[i];
  	}
  }
}