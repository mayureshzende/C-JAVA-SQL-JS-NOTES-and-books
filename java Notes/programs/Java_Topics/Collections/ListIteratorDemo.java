package Collections;
import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("mayur");
		al.add("zende");
		al.add("chiku");
		al.add("saksham");
	System.out.println(al);
		ListIterator itr=al.listIterator();
		
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("zende"))
			{
				itr.remove();
			}
			else if(s.equals("chiku"))
			{
				itr.set("shreyas");
			}
			else if(s.equals("saksham"))
			{
				itr.add("sakshi");
			}
			
		}
		System.out.println(al);
}
}
