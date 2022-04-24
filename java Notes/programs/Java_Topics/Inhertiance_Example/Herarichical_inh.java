package Inhertiance_Example;
class fruits
{
	void prop()
	{
		System.out.println("all fruits are heathly");
	}
}
class mango extends fruits
{
	void bestFruit()
	{
		System.out.println("yellow and best");
	}
}
class oramge extends fruits
{
	void soar()
	{
		System.out.println("orange and soar");
	}
}
public class Herarichical_inh {
public static void main(String[] args) {
	oramge o=new oramge();
	o.soar();
	o.prop();
	mango m=new mango();
	m.bestFruit();
	m.prop();
	
}
}
