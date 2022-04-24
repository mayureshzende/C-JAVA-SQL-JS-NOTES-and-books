import java.util.*;

class ArrayListDemo 
{
	static int count= 0;	
	public static void main(String[] args)
	{


		ArrayList a=new ArrayList();
		System.out.println("at "+ ++count+"   " +a.size());	
		a.add(" A ");
		a.add(null);
		a.add(7);
		a.add(1);
		a.add(1,"10");
		a.set(1,"mayur");
		// a.remove();
		System.out.println("at "+ ++count+"   " +a);

		a.remove(1);

		System.out.println("at "+ ++count+"   " +a);

		a.set(1," B ");
		a.add(7);
		System.out.println("at "+ ++count+"   " +a);
		System.out.println(a.size());

		ArrayList a1=new ArrayList();
		a1.add("a1");
		a1.add("M");
		a1.addAll(1,a);

		System.out.println("at "+ ++count+"   " +a1);

		

		a1.add(9);
		a1.add("S");
		System.out.println("at "+ ++count+"   " +a1);
		

		
		System.out.println(a1.isEmpty());
		a1.set(3," M");	
		System.out.println("at "+ ++count+"   " +a1);
		a.retainAll(a1);

		System.out.println(" after retaining " + a);

	}
}