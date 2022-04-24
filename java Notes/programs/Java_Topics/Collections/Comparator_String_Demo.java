package Collections;
import java.util.*;

public class Comparator_String_Demo {

	public static void main(String[] args) 
	{

		TreeSet t=new TreeSet(new MyComparatorString());
		t.add("Mayur");
		t.add("Abay");
		t.add("Saksham");
		t.add("Shreyash");
				
		System.out.println(t);
	}
}


class MyComparatorString implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();
		return -s1.compareTo(s2);
	}
}