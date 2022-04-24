import java.util.*;
class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet h=new HashSet();
		h.add(7);
		h.add("A");
		h.add("Z");
		h.add("B");
		h.add("C");
		
		h.add(null);
		System.out.println(h.add("Z"));
		System.out.println(h);


		LinkedHashSet hs=new LinkedHashSet();
		hs.add(10);
		hs.add(20);
		hs.add("A");
		hs.add(null);
		System.out.println(hs);

	}
}


