package Ploymorphism;
class color
{
	String color1="black";
	
	color()
	{
		System.out.println("parent class constructor");
	}
	
	void color1() {
		System.out.println("in paraent black method" );
	}
}

class yellow extends color
{
	String color1="yellow";
yellow()
{
	//super();//callin super class constructor from child class constructor
	System.out.println("in chlid class constructor");//
}
	void color() {
		
		super.color1();//calling parent class method in super keyword
		System.out.println(super.color1);//calling super class color variable
		System.out.println(color1);
	}
	
}
public class super_ex1 {
public static void main(String[] args) {

	yellow y=new yellow();
	y.color();
	
	
}
}
