package Arrays;
import java.util.Arrays;

public class arr_KeepOddElements 
{
	static int[] arr_oddEle(int[] a)
	{
		//for(int i=0,j=arr.length-1;j>=0;j--,i++) 
		int o[]=new int[a.length];
		for(int i=0;i<a.length;i +=2)
			o[i]=a[i];
//		for(int i=0,j=1;j<a.length;i++,j++)
//		{
//			if(i%2==1)
//			{
//				o[i]=a[i];
//				//continue;
//			}
//		}
		return o;
		
	}
public static void main(String[] args) {
	
	int []arr= {1,2,3,4,5};
	System.out.println("Original array is");
	
	for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]+" ");
	System.out.println();
	
	System.out.println("only keeping odd elements");
	//int[] oddArr=arr_oddEle(arr);
	
	//for(int a:oddArr)
		for(int i=0;i<arr.length;i =i+2)
		System.out.print(arr[i]+" ");
}
	
	
}
