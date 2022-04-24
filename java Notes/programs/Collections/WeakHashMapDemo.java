import java.util.*;

class WeakHashMapDemo
{
	public static void main(String[] args ) throws InterruptedException 
	{
		Map h=new WeakHashMap();
		Temp t=new Temp();
		h.put(t,"mayur");
		System.out.println(h);

		t=null;
		System.gc();
		Thread.sleep(500);
		System.out.println(h);
	}
}

class Temp 
{
	public String toString()
	{
		return "temp";
	}

	public void finalize()
	{
		System.out.println(" the finalize is called as gc dominates against tbe WeakHashMap ");
	}
}