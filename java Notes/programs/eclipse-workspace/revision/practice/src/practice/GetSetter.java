package practice;
class Student{
	private int RollNo;
	private String Name;
	private float Marks;
	
	
	
	public int getRollNo() 
	{
		return RollNo;
	}
	public void setRollNo(int rollNo) 
	{
		this.RollNo = rollNo;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		this.Name = name;
	}
	public float getMarks() 
	{
		return Marks;
	}
	public void setMarks(float marks) 
	{
		this.Marks = marks;
	}
	
	
	public void Showdetails() 
	{
	System.out.printf("ROllNo=%d NAME=%s Marks=%f",this.RollNo,this.Name,this.Marks);
	}
	
}
public class GetSetter {
	
	public static void main(String[] args) {
		Student s=new Student();
		s.setRollNo(1);
		s.setName("mayur");
		s.setMarks(77.22f);
		
		s.Showdetails();
		
	}

}
