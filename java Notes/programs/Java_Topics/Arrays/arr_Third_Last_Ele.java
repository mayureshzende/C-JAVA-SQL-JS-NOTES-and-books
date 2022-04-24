package Arrays;
import java.util.Arrays;

public class arr_Third_Last_Ele {

	static int third_Last(int[] a,int n,int i1)
	{
		int e;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		e=a[n-i1];
		return e;
	}

	public static void main(String[] args) {
		int[] arr= {2,1,4,3,5};
		int i=3;
		System.out.println(third_Last(arr,arr.length,i));
	}
	
}
