//n=4 1 1 2 3
//n=8 1 1 2 3 5 8 13 21
import java.util.*;
class FibonnaciSeries {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	System.out.println("Enter n: ");
  	int n = sc.nextInt();
  	long[] fibo = getFiboSeries(n);
  	System.out.println(Arrays.toString(fibo));
  }

  static long[] getFiboSeries(int n) {
  	long[] f = new long[n];
  	f[0]=f[1]=1;
  	for(int i=2; i < f.length; i++) {
  		f[i] = f[i-1] + f[i-2];
  	}
  	return f;
  }
}





