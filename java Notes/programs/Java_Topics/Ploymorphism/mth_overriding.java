package Ploymorphism;
class animal 
{
	animal()
	{
		System.out.println("animal constructor");
	}
	void detail()
	{
		System.out.println("all animals");
	}
	
}

class dog extends animal
{
	
	dog()
	{
		System.out.println("in dog constructor");
	}
//	void detail()
//	{
//		System.out.println("it dog animal");
//	}
}

class cat extends animal
{
	cat()
	{
		System.out.println("in cat constructor");
	}
	void detail()
	{
		System.out.println("in cat category");
	}
}
public class mth_overriding {
public static void main(String[] args) {
	dog d=new dog();
	d.detail();
	
	cat c=new cat();
	c.detail();
}
}
