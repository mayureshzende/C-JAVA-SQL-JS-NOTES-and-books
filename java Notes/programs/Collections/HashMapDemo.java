import java.util.*;

class HashMapDemo
{
	public static void main(String[] args)
	{
		System.out.println(null==null);
		HashMap h=new HashMap();
		//h.put(null,"test");
		h.put("mayuresh","zende");
		h.put(10,"cr");
		h.put(2,"chiku");
		h.put(1,"mayur");

		h.put(3,"saksham");
		h.put("m",1);
		h.put("m","cr");

		System.out.println(h);

		Set s=h.keySet();
		System.out.println(s);

		Collection c=h.values();
		System.out.println(c);

		Set s1=h.entrySet();
		System.out.println(s1);

		System.out.println(" after setting the new value for 1 = "+ h.put(1,"mayuresh") );
		System.out.println(h);

		System.out.println(" the size is "+ h.size());


		Iterator itr=s1.iterator();

		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey() + " -- " + m.getValue());
			if(m.getValue().equals("chiku"))
			{
				m.setValue("shreyash");
			}
		}
		System.out.println(h);
	}
}