package Collections;

import java.util.*;
public class PriorityQueueDemo2 {
public static void main(String[] args) {
	
	PriorityQueue q=new PriorityQueue(15,new MyCompar());
	q.offer("D");
	q.offer("A");
	q.offer("G");
	q.offer("Z");
	q.offer("M");
	q.offer("C");
	q.offer("V");
	q.offer("A");
	System.out.println(q);
	
}
}

class MyCompar implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s1.compareTo(s2);
	}
}
