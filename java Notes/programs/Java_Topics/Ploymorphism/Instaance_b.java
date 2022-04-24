package Ploymorphism;
class inst
{
	int speed;
	inst()
	{
		System.out.println("default cons");
	}
//	{
//		speed=100;
//		System.out.println("instance block");
//	}
		void show()
	{
		System.err.println(speed);
	}
}
class in1 extends inst
{
	in1()
	{
		//super();
		System.out.println("child class constructor");
	}
	{
		System.out.println("child class instance");
	}
}
public class Instaance_b {
public static void main(String[] args) {
//inst n=new inst();
//	n.show();
	in1 n1=new in1();

	
}
}
