import java.util.*;
import java.lang.*;

class ArrayRearrange
{
	public static void main(String[] args)
	{
		int[] arr={-1, -1, 6, 1, 9, 
                    3, 2, -1, 4,-1};
		System.out.println(" original array is "+Arrays.toString(arr));	 

		fix(arr);

		for( int i : arr)
		{
			System.out.println(i+ " "); 
		}
	}

	public static void fix(int[] arr)
	{
		HashSet<Integer> h=new HashSet<Integer>();

		for(int i=0 ; i< arr.length ; i++)
		{
			h.add(arr[i]);
		}


		for( int i = 0 ; i < arr.length ; i++  )
		{
			if( h.contains(i)  )
			{
				arr[ i ] = i ;
			} 
			else 
			{
				arr [  i ] = -1;
			}
		} 
	}
}