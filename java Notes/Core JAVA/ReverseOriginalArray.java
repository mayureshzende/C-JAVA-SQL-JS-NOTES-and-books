import java.util.*;
class ReverseOriginalArray {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter size of an array");
   int n = sc.nextInt();
   int[] arr = new int[n];
   System.out.println("Enter " + n +" elements(n1 n2 ..n)");
   for(int i=0 ; i < n; i++) {
   	arr[i] = sc.nextInt();
   }
   reverse(arr);
   System.out.println(Arrays.toString(arr));
 }
 public static void reverse(int[] a) {
 	for(int i=0,j=a.length-1; i < j ; i++,j--) {
 		//swap 
 		int t = a[i];
 		a[i] = a[j];
 		a[j] = t;
 	}
 }
}













