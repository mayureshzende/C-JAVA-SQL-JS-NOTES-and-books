package Basics;

class Student{
	private int Roll_No;
	private String Name;
	private float marks;
	
	public int getRoll_No()
	{
		return Roll_No;
	}
	public void setRoll_No(int roll_No) 
	{
		Roll_No = roll_No;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	public float getMarks() 
	{
		return marks;
	}
	public void setMarks(float marks) 
	{
		this.marks = marks;
	}

	public void show_marks()
	{
		System.out.println("{ \n Roll No is= "+Roll_No+"\n Name is "+ Name+"\n marks are= "+marks+" \n } ");
	}
}
public class Getter_Setter 
{
	public static void main(String[] args) 
	{
	Student s=new Student();
	s.setRoll_No(1);
	s.setName("mayur");
	s.setMarks(89.00f);
	s.show_marks();

//	Student s1=new Student();
	s.setRoll_No(2);
	s.setName("mayuresh");
	s.setMarks(89.07f);
	s.show_marks();
	
	for(int i=0;i<3;i++)
	{
		s.setRoll_No(2+i);
		s.setMarks(89.07f+4);

		s.show_marks();
	}
	}
}
