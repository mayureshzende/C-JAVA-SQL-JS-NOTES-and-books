import java.util.*;

class GenericDemo
{

	public static void main(String[] args) 
	{
		
		Gen<String> g=new Gen<String>("Mayur");
		g.show();
		System.out.println(g.getObj());


		Gen<Integer> g1=new Gen<Integer>(12);
		g1.show();
		System.out.println(g1.getObj());

		Gen<Float> g2=new Gen<Float>(12.01f);
		g2.show();
		System.out.println(g2.getObj());

	}

}


class Gen<T>
{
	T obj;

	public Gen(T obj)
	{
		this.obj=obj;
	}

	public void show()
	{
		System.out.println("the Object is of type= "+obj.getClass().getName());
	}

	public T getObj()
	{
		return obj;
	}
}