import java.util.*;

class CollectionsSortDemo
{
	public static void main(String[] arr)
	{
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("M");
		l.add("B");
		l.add("Y");
		l.add("L");
		l.add("A");
		System.out.println(l);
			System.out.println(" before sorting " + l);
		Collections.sort(l,new MyComparator()); //if new Mycomparator() is removed then default natural sorting order 
		System.out.println(" after sorting in descending " + l);

		Collections.reverse(l);
		System.out.println(" after applying the rverser() " +  l);
		
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1 ,Object obj2)
	{
		String s1=obj1.toString();
		String s2=(String)obj2;

		return s2.compareTo(s1);
	}
}