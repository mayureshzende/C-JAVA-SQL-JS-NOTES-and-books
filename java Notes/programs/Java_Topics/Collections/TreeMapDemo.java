package Collections;
import java.io.PipedInputStream;
import java.util.*;
public class TreeMapDemo {
public static void main(String[] args) {
	
	TreeMap t=new TreeMap(new MyComp()); //{chiku=102, mayur=100, saksham=104} based on the customized sorting order
	t.put( "mayur",100);
	t.put("chiku",102);
	t.put("saksham",104);
		
	//t.put("fff",102); //  java.lang.ClassCastException: 
	// t.put(null,104); //java.lang.NullPointerException
	
	System.out.println(t); //{100=mayur, 102=saksham, 103=chiku} default sorting orders of keys
 
}
}

class MyComp implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s1.compareTo(s2);
	}
}