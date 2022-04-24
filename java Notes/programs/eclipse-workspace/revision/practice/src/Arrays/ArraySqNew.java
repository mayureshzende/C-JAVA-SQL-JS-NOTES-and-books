package Arrays;
import java.util.Arrays;
public class ArraySqNew {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int[]  res=sq(a);
		System.out.println("original"+Arrays.toString(a));
		System.out.println("sq"+Arrays.toString(res));
		
		
	}
	
	static int[] sq(int[] a)
	{
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i]*a[i];
		}
	return b;	
	}
}
