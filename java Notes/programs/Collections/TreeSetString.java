import java.util.*;

class TreeSetString
{
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add(new StringBuffer("MM"));
		t.add(new StringBuffer("KK"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("A"));
		t.add("MAYUR");
		System.out.println(t); // [ A, Z , KK ,MM ,MAYUR]
	}
}

interface My 
{
	public int compare(Object obj1,Object obj2);
} 

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		int l1=s1.length();
		int l2=s2.length();

		if(l1<l2)
		return -1;
		else if(l1>l2)
			return +1;
		else
		return s1.compareTo(s2);
	}
}