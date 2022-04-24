package Collections;
import java.util.*;

public class Comparator_Comparable_Demo {

	public static void main(String[] args) {
		Employee e3=new Employee("shaksham",4);
		Employee e1=new Employee("mayur",5);
		Employee e2=new Employee("shreyash",2);
		Employee e4=new Employee("chiku",3);
		Employee e5=new Employee("raja",1);
		
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
	
			
			TreeSet t1=new TreeSet(new MyComparator2());
			t1.add(e1);
			t1.add(e2);
			t1.add(e3);
			t1.add(e4);
			t1.add(e5);
			System.out.println(t1);
		
	}

}

class Employee implements Comparable
{
	int eid;
	String ename;
	Employee(String ename,int eid)
	{
		this.eid=eid;
		this.ename=ename;				
	}
	
	public String toString()
	{
		return eid+ "--" +ename ;
	}
	public int compareTo(Object obj)
	{
		int eid1=this.eid;
		Employee e=(Employee)obj;
		int eid2=e.eid;
		
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return 1;
		else 
			return 0;
	}
	
}


class MyComparator2 implements Comparator
{

	public int compare(Object obj1,Object obj2)
	{
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		String s1=e1.ename;
		String s2=e2.ename;
		
		return s1.compareTo(s2);
	}
}