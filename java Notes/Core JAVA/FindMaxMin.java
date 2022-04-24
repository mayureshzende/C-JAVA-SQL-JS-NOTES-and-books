class FindMaxMin {
 public static void main(String[] args) {
 	int[] arr = {6, 19, 3, 15, 7, 14};
 	int max = findMax(arr);
 	int min = findMin(arr);
 	System.out.printf("Max=%d, Min=%d\n",max,min);
 }
 static int findMax(int[] a) {
 	int max = a[0];
 	for(int i=1; i<a.length; i++) {
 	 if(a[i] > max) { max = a[i]; }
 	}
 	return max;
 }
  static int findMin(int[] a) {
  	int min = a[0];
 	for(int i=1; i<a.length; i++) {
 	 if(a[i] < min) { min = a[i]; }
 	}
 	return min;

  }
}












