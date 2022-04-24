import java.util.*;

class TreeMapDemo
{
	public static void main(String[] args)
	{
		TreeMap t=new TreeMap(new MyComparator());
		t.put(1,"mayur");
		t.put(2,"chiku");
		t.put(4,"saksham");
		t.put(6,"tay");
		t.put(3,"test");

		System.out.println(t);
	}
}


class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2 )
	{
		// Map.Entry s1=(Map.Entry)obj1;
		// Map.Entry s2=(Map.Entry)obj2;
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;

		return -I1.compareTo(I2);
	}
}