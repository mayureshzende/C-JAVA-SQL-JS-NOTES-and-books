import java.util.*;

class Samp{
	int id;
	String name;
	float salary;


	void insert(int n,String s,float f)
	{
		id=n;
		name=s;
		salary=f;
	}

	void display()
	{
		System.out.println(id +" "+" " +name + " "+ salary);
	}
}


public class Employee
{
	public static void main(String args[])
	{
		Samp s=new Samp();

		Samp s1=new Samp(),s2=new Samp();
		s1.insert(1,"sak",99999);
		s1.display();
		s2.insert(2,"kau",9090);
		s2.display();

		s.insert(3,"mayur",899999.0f);
		s.display();
	}
}