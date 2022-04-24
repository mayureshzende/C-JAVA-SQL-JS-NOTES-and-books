import java.util.*;

class CollectionsSearchDemo

{
	public static void main(String[] args)
	{
		 ArrayList a=new ArrayList();
		 a.add("A");
		 a.add("Z");
		 a.add("L");
		 a.add("M");

		 System.out.println(a);
		 Collections.sort(a,new MyComparator()); // without the Mycomparator() default natural sorting order
		 System.out.println(a);	

		 System.out.println(Collections.binarySearch(a,"Z",new MyComparator()));
		 System.out.println(Collections.binarySearch(a,"J",new MyComparator())); // without the MyComparator the unexpected Result if found index and not found insertion point

	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();

		return s2.compareTo(s1);
	}
}