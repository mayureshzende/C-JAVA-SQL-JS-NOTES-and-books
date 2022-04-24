import java.util.Arrays;
class ReverseArrayInNewCopy {
  public static void main(String[] args) {
  	int [] arr = {1,2,3,4,5};
  	int[] res = reverse(arr);
  	System.out.println("Original:"+Arrays.toString(arr));
  	System.out.println("Reverse:"+Arrays.toString(res));
  }

  static int[] reverse(int[] a) {
  	int[] b = new int[a.length];
  	for(int i=0,j=a.length-1; i<a.length; i++,j--) {
  		b[j] = a[i];//copying data in reverse order
  	}
  	return b;
  }
}

