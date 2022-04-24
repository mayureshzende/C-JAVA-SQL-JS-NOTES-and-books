import java.util.*;

class ArrayReverse
{
	public static void main(String[] args)
	{
		int[] arr={5, 4, 3, 2, 1};
		for( int i : arr)
		{
			System.out.print( i+ " ");
		}

		System.out.println();
		reverse(arr);
		

		for( int i : arr)
		{
			System.out.print(i+ " ");
		} 
	}

	public static void reverse(int[] arr)
	{
		for( int i=0 ,  j = arr.length-1 ; i<j ; i++ , j--)
		{
			int temp = arr [i];
			arr[ i ] = arr [j] ;
			arr[ j ] = temp;
		}
	}
}

//(int i=0,j=a.length-1; i < j ; i++,j--)