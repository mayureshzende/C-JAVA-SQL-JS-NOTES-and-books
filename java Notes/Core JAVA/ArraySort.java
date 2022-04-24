import java.util.Arrays;

class ArraySort {
  public static void main(String[] args) {
  	int[] arr = {4, 12, 9, 1, 10, 8, 5};
  	//Arrays.sort(arr);
  	int[] sorted = sort(arr);
  	System.out.println(Arrays.toString(sorted));
  }

  static int[] sort(int[] a) {
  	for(int i=0 ; i < a.length; i++) {
  		for(int j=i+1; j < a.length; j++) {
  		  //a[j] < a[i]=Ascending
  		  //a[j] > a[i]=Descending
  		  if(a[j] < a[i]) {
  		  	//swap logic
  		  	int t = a[i];
  		  	a[i] = a[j];
  		  	a[j] = t;
  		  }
  		}
  	}
  	return a;
  }
}