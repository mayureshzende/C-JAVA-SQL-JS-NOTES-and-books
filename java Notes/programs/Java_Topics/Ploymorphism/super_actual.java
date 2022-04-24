package Ploymorphism;
class person
{
	int id;
	String name;
	//person(){}
	person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

class emp extends person
{
	float salary;
	//emp(){}
	emp(int id,String name,float salary)
	{
		super(id,name);//reusing super class constructor properties
		this.salary=salary;
	}
	
	void show()
	{
		System.out.printf("id is %d || name is %s || salary is %f",this.id,this.name,this.salary);
	}
}
public class super_actual {
	public static void main(String[] args) {
		emp e=new emp(1,"mayur",700000);
		e.show();
	}

}
