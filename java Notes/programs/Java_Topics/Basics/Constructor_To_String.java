package Basics;
import java.util.*;

public class Constructor_To_String {
public static void main(String[] args) {
	
	Stud s=new Stud(1,"mayur");
	Stud s1=new Stud(2,"mayuresh");
	System.out.println(s);
	System.out.println(s1);

}
}

class Stud
{
	private int Roll_no;
	private String Name;

	Stud()
	{	}
Stud(int r,String n)
{
	this.Roll_no=r;
	this.Name=n;
}

public String toString()
{
	return "[ ROll_no= "+ Roll_no +" | Name = "+ Name + " ] ";
}
}
