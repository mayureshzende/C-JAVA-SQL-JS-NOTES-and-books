package Collections;
import java.util.*;
public class HashMapDemo {
public static void main(String[] args) {
	
	HashMap m=new HashMap();
	m.put("mayur",101);
	m.put("chiku",102);
	m.put("saksham",103);
	System.out.println(m);
	System.out.println(m.put("chiku",105)+" put to replace and return old object"); //put to replace and return old object	
	System.out.println(m);
	System.out.println("===============================");
	
	Set s=m.keySet();
	System.out.println(s); // gets all keys for map
	System.out.println("===============================");
	
	Collection c=m.values();
	System.out.println(c); // get the valus of Map
	System.out.println("===============================");
	
	Set s1=m.entrySet();
	System.out.println("entries are"+s1); //gets the entry i.e [k=v,k=v]
	System.out.println("===============================");
	
	Iterator itr=s1.iterator();	
	while(itr.hasNext())
	{
		Map.Entry m1=(Map.Entry)itr.next();
		System.out.println(m1.getKey()+"--"+m1.getValue());
		if(m1.getKey().equals("saksham"))
		{
			m1.setValue(106);
		}
	}
	System.out.println("===============================");
	System.out.println(m);

}

}
