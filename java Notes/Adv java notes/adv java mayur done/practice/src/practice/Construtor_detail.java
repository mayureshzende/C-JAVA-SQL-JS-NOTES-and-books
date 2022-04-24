package practice;

public class Construtor_detail {
public static void main(String[] args) {
Student s1=new Student(7,"MAYUR",77.88f);
Student s2=new Student(8,"alex",67.98f);

System.out.println(s1);
System.out.println(s2);

}
}

class Student{
	private int Roll_no;
	private String Name;
	private float Marks;
	
	Student(int Roll_no,String Name,float Marks)
	{
		this.Roll_no=Roll_no;
		this.Name=Name;
		this.Marks=Marks;
	}
	public String toString() 
	{
		return "\n [ "+"Roll_No="+this.Roll_no+" Name="+this.Name+" Marks="+this.Marks+" ]";
	}
}