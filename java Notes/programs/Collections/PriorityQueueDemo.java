import java.util.*;

class PriorityQueueDemo
{
	public static void main(String[] args)
	{
		PriorityQueue p=new PriorityQueue(15 , new MyComparator());
		//System.out.println(p.poll());
		//System.out.println(p.remove());
		// for( int i=0 ; i<= 10 ;i++)
		// {
		// 	p.offer(i);
		// } 

		p.offer("Z");
		p.offer("M");
		p.offer("A");
		p.offer("B");
		p.offer("L");

		//System.out.println(p);
//		System.out.println(p.poll());
		//System.out.println(p.remove());
		System.out.println(p); // [ Z ,M,L,B,A]
	}
}

class MyComparator implements Comparator 
{
	public int compare(Object obj1 , Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();

		return s2.compareTo(s1);
	}
}