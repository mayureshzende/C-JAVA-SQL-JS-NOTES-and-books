import java.util.Arrays;
class ArraySquareInNewCopy {
 public static void main(String[] args) {
 	int[] arr = {1,2,3,4,5};
  	int[] result = square(arr);
  	System.out.println("Original:" + Arrays.toString(arr));
  	System.out.println("Output:" + Arrays.toString(result));

 }
 static int[] square(int[] a) {
 	int[] b = new int[a.length];
  	for(int i=0; i < a.length; i++) {
  	  b[i] = a[i] * a[i];
  	}
  	return b;
  }

}