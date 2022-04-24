package Collections;
import java.util.*;
public class Comparator_Lngth_Demo {
public static void main(String[] args) {
	
	TreeSet t=new TreeSet(new MyComaparator2());
	t.add("A");
	t.add(new StringBuffer("ABC"));
	t.add("AA");
	t.add(new StringBuffer("ZZZ"));
	t.add("ABCD");
	t.add(new StringBuffer("A"));
	System.out.println(t);
	
}
}


class MyComaparator2 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		int l1=s1.length();
		int l2=s2.length();
		
		if(l1<l2)
			return -1;
		else if (l1>l2)
			return 1;
		else
			return s1.compareTo(s2);
		
	}
}