import java.util.*;
class ListIteratorDemo
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();

		l.add("mayu");
		//l.add("chiku");
		l.add( "mayure");
		l.add("zende");
		System.out.println(l);
		
		ListIterator ltr=l.listIterator();	

		while(ltr.hasNext())
		{
			String s=(String)ltr.next();
			if(s.equals("mayure"))
			{
				ltr.remove();
			}
			else if(s.equals("mayu"))
			{	

				ltr.set("mayuresh");
			}
			else if(s.equals("chiku"))
			{
				ltr.add("saksham");
			}
			

		}

		System.out.println(l);


	}	
}