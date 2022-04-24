import java.util.*;

class Employee implements Comparable
{
	int eid;
	String name;

	Employee(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}

	public String toString()
	{
		return " "+eid + " == "+ name + " ";
	}

		public  int compareTo(Object obj)
		{
			int eid=this.eid;
			Employee e=(Employee)obj;
			int eid2=e.eid;

			if(eid<eid2)
			return -1;
			else if(eid > eid2)
			return +1;
			else
			return 0;	
		}
}

class Employee2 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		String s1=e1.name;
		String s2=e2.name;

		return s1.compareTo(s2);

	}
}

class CompComp
{
	public static void main(String[] args)
	{
		Employee e1=new Employee(11,"mayur");
		Employee e2=new Employee(7,"chiku");
		Employee e3=new Employee(2,"saksham");
		Employee e4=new Employee(11,"mayur");

		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);

		System.out.println(" "+ t);


		TreeSet t1=new TreeSet(new Employee2());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);

		System.out.println(" "+ t1);
	}
}

