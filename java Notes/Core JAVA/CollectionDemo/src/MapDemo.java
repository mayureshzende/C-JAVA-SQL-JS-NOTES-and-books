import java.util.*;
import java.util.Map.Entry;
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<Integer,String>();
		map.put(41, "John"); 
		map.put(91, "Fred");
		map.put(5, "Jason");
		map.put(51, "Tiya");
		map.put(10, "Geoff");
		System.out.println(map);
		map.remove(51);
		map.put(41, "Adams");//modification
		String val = map.get(91);//Fred
		System.out.println(val);
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("Geoff"));
		//sort
		Map<Integer,String> tMap = new TreeMap<Integer,String>(map);
		System.out.println(tMap);
		
		//Option1: Traversing using Entries
		Set<Entry<Integer,String>> entries = map.entrySet();
		Iterator<Entry<Integer,String>> it = entries.iterator();
		while(it.hasNext()) {
			Entry e = it.next();
			System.out.println(e.getKey() +"=>" +e.getValue());
		}
		//Option2: Traversing using keys
		Set<Integer> keys = map.keySet();
		Iterator<Integer> it1 = keys.iterator();
		while(it1.hasNext()) {
			int key = it1.next();
			String value = map.get(key);
			System.out.println(key+"=>"+value);
		}
	}
}












