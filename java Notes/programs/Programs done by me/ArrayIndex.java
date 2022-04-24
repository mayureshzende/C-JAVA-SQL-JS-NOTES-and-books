import java.util.*;
class ArrayIndex
{
	public static void main(String[] args)
	{
		int[] arr={10, 2, 1, 3, 4, 55, 20};
		int no=101;

		int ind= 0;//lcheck(arr,no);

		int remove=3;
		int add=7;

		for( int i = arr.length-1 ; i > remove ; i-- )
		{
			arr[i]=arr[i-1];
		}
		arr[remove]=add;


		System.out.println(Arrays.toString(arr));
		if( ind >= 0 )
		{
			System.out.println(" is at index " + ind);
		}
		else
		{
			System.out.println(" element is not found ");
		}
				
		
				//
			
	}

	public static int check(int[] arr, int no )
	{
		for(int i=0 ; i < arr.length ; i++ )
		{
			
		if( no == arr[i])
			{
				return i;
			}
		}	
		return -1;
	}
}