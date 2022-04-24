import java.util.*;
import java.util.regex.*;

class P
{
	int x;
	P()
	{	
		//System.out.println(this.hashCode());
	}

	P(int x)
	{
		this.x=x;
	}

	public String toString()
	{
		return " "+x;
	}
}

// class C extends P
// {
// 	C()
// 	{
// 		System.out.println(this.hashCode());
// 	}

// }

class Gen<T>
{
	T obj;

	Gen(T obj)
	{
		this.obj=obj;
	}
	public void show()
	{
		System.out.println(" the object of type "+obj.getClass().getName());
	}
	public T getObj()
	{
		return obj;
	}
}

public class Test{

	public static void main(String[] args)
	{
		String x="abc";
	Pattern p=Pattern.compile("^abc"); // pattern is a compile version of Regular expression of the object passed and to crerate the object use complie() 
Matcher m=p.matcher("abbbcccaaa");	

System.out.println();	


	Scanner sc=new Scanner(System.in);

	Gen<String> g=new Gen<String>("mayur");
	g.show();
	System.out.println(g.getObj());

	//int i=sc.nextInt();
	Gen<Integer> g1=new Gen<Integer>(10);
	g1.show();
	System.out.println(g1.getObj());

// HashSet t=new HashSet();
// 	t.add(1);
// 	t.add(null);
// 	t.add(0);
// 	t.add(3);
// 	t.add(4);

// 	System.out.println(t);

	// System.out.println(t.first());
	// System.out.println(t.last());
	// System.out.println(t.tailSet(4));
	// System.out.println(t.headSet(4));	
	// int[][] arr=new int[2][3];

	
	// 	for(int i=0 ; i< arr.length ;i++)
	// 	{
	// 		for(int j=0;j < arr[i].length;j++)
	// 		{
	// 			arr[i][j]=sc.nextInt();
	// 		}
	
	// 	}
	// 	for(int i=0;i<arr.length;i++)
	// 	{
	// 		for(int j=0;j<arr[i].length;j++)
	// 		{
	// 			System.out.print(" "+arr[i][j]);
	// 		}
	// 		System.out.println();
	//	}
	//System.out.println(Arrays.toString(arr));


	
	}
}

