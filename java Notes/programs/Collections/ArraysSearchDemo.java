import java.util.*;

class ArraysSearchDemo
{
	public static void main(String[] args)
	{
		Integer[] I={10,2,1,4,3,5};

		System.out.println("before sorting  "+ Arrays.toString(I));

		Arrays.sort(I);
		System.out.println("after sorting ");
		for(int i:I)
			System.out.print(" "+i );


		System.out.println("\n" +" element found at " + Arrays.binarySearch(I,10));
	}
}