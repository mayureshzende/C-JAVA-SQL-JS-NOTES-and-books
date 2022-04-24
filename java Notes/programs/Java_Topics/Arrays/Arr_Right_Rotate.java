package Arrays;
import java.util.*;
public class Arr_Right_Rotate {
public static void main(String[] args) {
	int []arr= {1,2,3,4,5};
	System.out.println("array is "+Arrays.toString(arr));
	
	for(int i=0;i<3;i++)
	{
		int j,last;
		last=arr[arr.length-1];
		for(j=arr.length-1;j>0;j--)
		{
			arr[j]=arr[j-1];
		}
		arr[j]=last;
		System.out.println(arr[j]);
	}
	System.out.println("after right rotation");
	for(int a:arr)
		System.out.print(a+" ");
}
}
