import java.util.*;

class IdentityHashMapDemo
{
	public static void main(String[] args)
	{ 
		IdentityHashMap h=new IdentityHashMap();
		Integer i=new Integer(10);
		Integer i1= new Integer(10);
		h.put(i,"mayur");
		h.put(i1,"shreyash");

		//h.put(1,"mayuresh");
		System.out.println(h);
	}
}