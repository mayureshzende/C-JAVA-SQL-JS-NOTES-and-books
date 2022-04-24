package Collections;
import java.util.*;

public class Comparator_StringBuffer_Demo {
public static void main(String[] args) {
	
	TreeSet t=new TreeSet(new MyComparatorDemo1());
	t.add(new StringBuffer("B"));
	t.add(new StringBuffer("A"));	
	t.add(new StringBuffer("Z"));
	t.add(new StringBuffer("K"));
	t.add(10);
	System.out.println(t);
}
}

class MyComparatorDemo1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		
		return s1.compareTo(s2);
	}
}
