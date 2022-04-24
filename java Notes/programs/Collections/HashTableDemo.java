import java.util.*;
class Temp 
{
	int i=0 ;
	Temp( int i )
	{
		this.i=i;		
	}

	public int hashCode()
	{
		return i; // if we the hascode formula the output is also changed according to the formula
	}

	public String toString()
	{
		return i+ "";
	}
}

class HashTableDemo
{
	public static void  main(String[] args)
	{
		Hashtable h=new Hashtable();
		h.put(new Temp(10),"A");
		h.put(new Temp(5),"B");
		h.put(new Temp(3),"K");
		h.put(new Temp(6),"Z");
		h.put(new Temp(1),"T");
		h.put(new Temp(15),"L");
		h.put(new Temp(23),"M");
		//h.put(new Temp(21),null) we will get the nullpointer exception null not allowed as the key or value 
		System.out.println(h);

	}
}