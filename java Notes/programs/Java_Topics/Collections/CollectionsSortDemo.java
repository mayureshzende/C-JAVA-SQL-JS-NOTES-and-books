package Collections;
import java.util.*;

public class CollectionsSortDemo {
public static void main(String[] args) {
	
	ArrayList l=new ArrayList(); //default natural sorting order 
	l.add("z");
	l.add("a");
	l.add("k");
	l.add("b");
	
	System.out.println("Before asorting:"+ l);
	Collections.sort(l);
	System.out.println("After sorting "+ l);

	Collections.sort(l, new MyCompCD()); //for customize sorting
	System.out.println("after customize sorting ="+l);
	
	
	
}
}


class MyCompCD implements Comparator
{
	public int compare(Object obj,Object obj2)
	{
		String s1=obj.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}