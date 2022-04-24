package Arrays;
import java.util.*;

public class UserDefine_Arr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	
	Student[] s=new Student[n];
	System.out.println("enter the details in formate 1)roll_no 2) Name 3) Marks");
	for(int i=0;i<n;i++)
	{
		int r=sc.nextInt();
		String name=sc.next();
		float marks=sc.nextFloat();
		s[i]=new Student(r,name,marks);
	}
	
		System.out.println(Arrays.deepToString(s));
	sc.close();
}
}

class Student
{
	private int roll_NO;
	private String name;
	private float marks;
	
	Student(){}
	Student(int roll_no,String name,float marks)
	{
		this.roll_NO=roll_no;
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
		return "["+this.roll_NO+" "+this.name+" "+this.marks+" "+"]";
	}
	
}
