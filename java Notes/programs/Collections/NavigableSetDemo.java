import java.util.*;

class NavigableSetDemo
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(1000);
		t.add(3000);
		t.add(5000);
		t.add(2000);
		t.add(4000);

		System.out.println(t);

		System.out.println(" the floor() returns <= (either/ before) 3000-> "+ t.floor(3000));
		System.out.println(" the lower() returns < last/highest element before 3000-> "+ t.lower(3000));
		System.out.println(" the ceiling() returns >= (either/after) 3000->  "+ t.ceiling(3000));
		System.out.println(" the higher() return > first/lower element after 3000-> "+ t.higher(3000));
		System.out.println(" the removal of first element is " + t.pollFirst());
		System.out.println(" the removal of last element is  "+ t.pollLast());
		System.out.println(" the ser in descending order "+t.descendingSet());
		for(Object o:t)
		System.out.println(o);

	}
}