import java.util.*;

class SortedSetDemo
{
	public static void main(String[] args)
	{
		SortedSet s=new TreeSet();
		s.add("Z");
		s.add("H");
		s.add("A");
		s.add("K");
		System.out.println(" first element is "+ s.first());
		System.out.println(" lasst element is "+ s.last());

		System.out.println(" the head list is less than < K " + s.headSet("K"));
		System.out.println(" the tail list is greater than equal to >= H " + s.tailSet("H"));
		System.out.println(s);
	}
}