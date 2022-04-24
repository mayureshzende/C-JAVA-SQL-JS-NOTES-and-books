import java.util.*;


class ContainsDemo
{
	public static void main(String[] args ) 
	{
		int[] i=new int[11];

		for(int s=1;s<=10 ; s++)
		i[s]=s;
		
		ArrayList<Integer> al=new ArrayList<Integer>(i.length);
		for(int a=0;a < i.length ; a++ )
		{
		al.add(i[a]);
		}
		System.out.println(al);

		ArrayList<Integer> a1=new ArrayList<Integer>();
		//a1.addAll(al);

		a1.add(10);
		a1.add(1);
		a1.add(2);
		System.out.println(a1.contains(10));

		System.out.println(a1);
	}
}