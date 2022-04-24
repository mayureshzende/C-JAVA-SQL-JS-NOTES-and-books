package Inhertiance_Example;
class animal{
	void eat()
	{
		System.out.println("eating in single inher");
	}
}
class dog extends animal{
	void barking()
	{
		System.out.println("barking in single inher");
	}
}
public class Single_Inh {
public static void main(String[] args) {
	dog d=new dog();
	d.barking();
	d.eat();

}
}
