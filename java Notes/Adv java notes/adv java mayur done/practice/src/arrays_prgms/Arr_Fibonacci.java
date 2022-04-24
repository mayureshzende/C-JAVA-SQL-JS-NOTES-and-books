package arrays_prgms;
import java.util.*;
public class Arr_Fibonacci {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("\n enter the limit for fibonacci+");
	 int n=sc.nextInt();
	 
	 long[] fibo=getFibo(n);
	 
	 System.out.println(" series is ="+Arrays.toString(fibo));
	}
public static long[] getFibo(int n) {
	long [] f=new long[n];
	f[0]=f[1]=1;
	for(int i=2;i<f.length;i++) {
		f[i]=f[i-2]+f[i-1];
	}
return f;
}
}
