abstract class Person{
	String name;
	int age;
	static int sq=0;

	Person(String name,int age)
	{
		this.name=name;
		this.age=age;	
		System.out.println("hascode foe parent is ="+this.hashCode()+" excecuted "+ (++sq));	
	}
}

class Student extends Person{
	int roll_no;
	int marks;

	Student(String name,int age,int roll_no,int marks)
	{
		super(name,age);
		this.roll_no=roll_no;
		this.marks=marks;
		System.out.println("hashCode for Child is = "+this.hashCode()+ " excecuted " + (++sq));
	}

	public String toString()
	{
		return "["+name+" -- "+age+" -- " + roll_no  + " -- " + age + "]";
	}
}
class AbstractConstructor
{

	public static void main(String[] args)
	{
		Student s=new Student("mayur",23,7,89);
		System.out.println(s);
		System.out.println(" hashCode for object is ="+s.hashCode());
	}
}