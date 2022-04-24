import java.util.*;

class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();

		l.addFirst("Z");
		l.add(1,"A");
		l.add(2,"M");
		l.add("A");
		l.add(null);

		System.out.println(l.getFirst());
		System.out.println(l.getLast());

		List l1=Collections.synchronizedList(l);

		System.out.println(l);

		System.out.println(l.size());

		Object[] o=l.toArray();

		for( int i=0;i< o.length ; i++ )
		{
			System.out.print(" " +o[i]);
		}
	}
}