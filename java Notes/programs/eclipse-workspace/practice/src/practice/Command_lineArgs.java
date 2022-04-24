package practice;

public class Command_lineArgs {
public static void main(String[] args) {
	if(args.length<3 )
	{
		System.out.println("enter three parametres!!!!!");
		System.exit(0);
	}
	int id=Integer.parseInt(args[0]);
	String name=args[1];
	float Marks=Float.parseFloat(args[2]);
	Student1 s1=new Student1(id,name,Marks);
	System.out.println(s1);
	}
}

class Student1
{
	private int Roll_No;
	private String Name;
	private float Marks;
	
	
	Student1(int Roll_No,String Name,float Marks)
	{
	this.Roll_No=Roll_No;
	this.Name=Name;
	this.Marks=Marks;
	}
	
	public String toString()
	{
		return "[ "+"roll_no is ="+this.Roll_No+" Name is= "+this.Name+" Marks is="+this.Marks+" ]"; 
	}
}