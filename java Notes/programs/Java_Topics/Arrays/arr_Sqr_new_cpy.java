package Arrays;
import java.util.Arrays;

public class arr_Sqr_new_cpy 
{
	static void sqr(int[] a)
	{
	//int[] arr=new int[a.length];
		System.out.println("original array is");
		for(int j=0;j<a.length;j++)
		{
		System.out.println(a[j]);
		}
	System.out.println("squared array is");
		for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]*a[i]);
		
	}
		
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		sqr(a);
		
	}
	
}
