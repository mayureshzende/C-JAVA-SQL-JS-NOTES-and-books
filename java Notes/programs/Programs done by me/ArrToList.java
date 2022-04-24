import java.util.*;


class ArrToList
{
	public static void main(String[] args)
	{
		Integer[] arr={1, 2, 4, 5, 6, 7};


		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		// for(int i=0; i<arr.length; i++)
		// al.add(arr[i]);

		System.out.println(al);

		al.add(10);
		al.add(20);


		Object[] arr1=al.toArray();

		for(Object i:arr1)
		{
			System.out.print(i+" ");
		}

	}	
}