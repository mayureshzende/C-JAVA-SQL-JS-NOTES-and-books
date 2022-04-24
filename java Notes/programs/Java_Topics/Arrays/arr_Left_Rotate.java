package Arrays;
import java.util.Arrays;

public class arr_Left_Rotate {
public static void main(String[] args) {
	int []arr= {1,2,3,4,5};
	System.out.println(Arrays.toString(arr));
	int first,j;
	for(int i=0;i<3;i++)
	{
		first=arr[0];
	for( j=0;j<arr.length-1;j++)
	{
		arr[j]=arr[j+1];
		
	}
	arr[j]=first;
	}
	System.out.println();
	
	System.out.println("afer the roatation");
	for(int a:arr)
	{
		System.out.print(a+" ");
	}
}
}
