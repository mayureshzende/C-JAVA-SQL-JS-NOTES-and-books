package Collections;
import java.util.*;

public class WeakHashMapDemo  {
public static void main(String[] args) throws InterruptedException {
	
	Temp t=new Temp();
	WeakHashMap m=new WeakHashMap(); // if we use the HashMap instead of the WeakHashMap then the GC will  not clear the the Object and the 
 	m.put(t,"mayur");
	System.out.println(m);
	t=null;
	System.gc();
	Thread.sleep(2000);
	System.out.println(m);
	
}
}


class Temp 
{
	public String toString()
	{
		return "Temp";
	}
	public void finalize()
	{
		System.out.println("finalize is clearing the object");
	}
	
}