package arrays_prgms;
import java.util.Arrays;
public class Arr_NewCpy
{
	public static void main(String[] args) 
	{
		
		int a[]={6,1,2,4,5};
		Arr_NewCpy ar=new Arr_NewCpy();
		int[] res=ar.sqr(a);
		System.out.println("orignal array ="+Arrays.toString(a));
		System.out.println("new arraya is ="+Arrays.toString(res));
	}
	
	public  int[] sqr(int[] a) {
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i]*a[i];
		}
		return b;
	}
	
}
