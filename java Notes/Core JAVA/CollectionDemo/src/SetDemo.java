import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(19);//int -> Integer => AutoBoxing
		set.add(14);
		set.add(4);
		set.add(19);//duplicate (not allowed)
		set.add(2);
		set.add(10);
		System.out.println(set.size());
		System.out.println(set);
		set.remove(4);//pass object
		System.out.println("2 present: " +set.contains(2));
		//Sorting
		Set<Integer> sSet = new TreeSet<Integer>(set);
		System.out.println(sSet);
		
		//Traversing using for-each loop
		for(Integer i : set) {
			System.out.println(i);
		}
		//Traversing using Iterator
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}













