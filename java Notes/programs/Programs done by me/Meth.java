import java.io.*;

class Stud{
	int id;
	String name;
	void insertRecord(int n,String s)
	{
		id=n;
		name=s;
	}

	void printInfo()
	{
		System.out.println(id +"\n"+name );
	}
}

public class Meth{
	public static void main(String args[])
	{
		Stud s=new Stud();
		s.insertRecord(1,"mayu");
		s.printInfo();
	}
}
