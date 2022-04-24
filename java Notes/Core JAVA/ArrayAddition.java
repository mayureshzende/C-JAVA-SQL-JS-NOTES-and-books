class ArrayAddition {
  public static void main(String[] args) {
  	int[] arr = {1,2,3,4,5};
  	int res = getSumOfElements(arr);
  	System.out.println("Result: " + res);
  }

  static int getSumOfElements(int[] a) {
  	int sum = 0;
  	for(int e : a) {
  		sum += e;//sum = sum + e
  	}
  	return sum;
  }
}