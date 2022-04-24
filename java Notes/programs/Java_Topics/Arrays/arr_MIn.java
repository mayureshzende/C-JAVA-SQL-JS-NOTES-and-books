package Arrays;
import java.util.Arrays;


public class arr_MIn {

	static void Min(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min) 
			{
				min=arr[i];
				
			}
		}
		System.out.println("min of array is " +min );
	}
	
	public static void main(String[] args) {
		
		int[] arr= {10,201,20,8,120,3};
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		Min(arr);
	}
	
	
}
