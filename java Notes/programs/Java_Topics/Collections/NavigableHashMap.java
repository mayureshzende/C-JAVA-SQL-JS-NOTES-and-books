package Collections;
import java.util.*;

public class NavigableHashMap {
public static void main(String[] args) {
	
	TreeMap<String,String> h=new TreeMap<String,String>();
	h.put("c","cat");
	h.put("d","dog");
	h.put("a","apple");
	h.put("g","gun");
	
	System.out.println(h);
	
	System.out.println(h.floorKey("c"));
	System.out.println(h.lowerKey("e"));
	System.out.println(h.ceilingKey("e"));
	System.out.println(h.higherKey("e"));
	System.out.println(h.pollFirstEntry());
	System.out.println(h.pollLastEntry());
	
	System.out.println(h.descendingMap());
	
	System.out.println(h);
}
}
