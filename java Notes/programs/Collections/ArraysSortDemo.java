import java.util.*;

class ArraysSortDemo
{
	public static void main(String[] args)
	{
		int[] a={3,2,1,6,4,5};


		Arrays.sort(a);
		for(int i:a)
		System.out.println(i);


		String[] s={"Z","A","X"};

		// List l=Arrays.asList(s);
		// ArrayList al=new ArrayList();
		// al.add(l);
		// System.out.println(al.getClass().getName());
		Arrays.sort(s,new MyComparator());
		for(String s1:s)
		System.out.println(s1);

	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String I1=(String)obj1;
		String I2=obj2.toString();

		return I2.compareTo(I1);
	}
}