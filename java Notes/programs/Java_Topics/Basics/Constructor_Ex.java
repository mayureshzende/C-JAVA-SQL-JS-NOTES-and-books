package Basics;

public class Constructor_Ex {
	int a1,b1;
	static String name="iit" ;
	Constructor_Ex()
	{
		
	}
	Constructor_Ex(int a,int b)
	{
		this.a1=a;
		this.b1=b;
	}
//	public Constructor_Ex(Constructor_Ex e) {
//		a1=e.a1;
//		b1=e.b1;
//		}

	void display()
	{
	System.out.println(a1+" "+b1+" "+name);
	}
	
	public static void main(String[] args) 
	{
		Constructor_Ex c=new Constructor_Ex(1,3);
		Constructor_Ex c2=new Constructor_Ex();
		c.display();
	//	c2.display();
		c2.a1=c.a1;
		c2.display();
	}
}
