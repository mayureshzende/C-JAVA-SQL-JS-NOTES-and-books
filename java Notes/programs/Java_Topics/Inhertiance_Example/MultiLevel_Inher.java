package Inhertiance_Example;

//
class babydog extends dog
{
	void weep()
	{
		System.out.println("weep");
	}
}
public class MultiLevel_Inher {
public static void main(String[] args) {
	babydog b=new babydog();
	b.weep();
	b.barking();
	b.eat();

	
}
}
