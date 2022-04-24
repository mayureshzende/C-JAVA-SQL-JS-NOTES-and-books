import java.util.*;

class Test
{
	public static void main(String[] args)
	{



		TreeSet t=new TreeSet();
		t.add(10);
		t.add(20);

		System.out.println(t);

		Object[] arr=t.toArray();

		for(Object i: arr)
		{
			System.out.println(i);
		}
	}
}
        // List<Integer> al = new ArrayList<Integer>(); 
        // al.add(10); 
        // al.add(20); 
        // al.add(30); 
        // al.add(40); 
  
        // Integer[] arr = new Integer[al.size()]; 
        // arr = al.toArray(arr); 
  
        // for (Integer x : arr) 
        //     System.out.print(x + " ");

	// 	int[] arr1={1,2,3};
	// 	ArrayList l=new ArrayList();

	// 	for( int j=0 ; j<arr1.length ; j++)
	// 	{ 
	// 	l.add(new Integer(arr1[j]));
	// }
	// System.out.println(l);


// class A 
// {
// 	int a;
// 	A(){
// 		System.out.println(" parent hasCode is called 1 "+ this.hashCode());
// 	}
// 	A(int a)
// 	{
		
// 		this.a=a;
// 	} 

// 	public void m1()
// 	{
		
// 		System.out.println(" in parent m1 " + a);
// 	}

// 	public void m3()
// 	{
// 		System.out.println(" in parent m3 "+ a);
// 	}
// }

// class B extends A
// {
// 	int a;
// 	B(){
// 		System.out.println(" child hasCode is called 2 "+ this.hashCode());
// 	}
// 	B(int a)
// 	{
		
// 		this.a=a;
// 	}
// 	public void m1()
// 	{
		
// 		System.out.println(" in chlid m1 " + a);
// 	}	

// 	public void m2()
// 	{
// 		System.out.println(" in chlid m2 " + a);
// 	}
// }

// class Test
// {
// 	public static void main(String[] args)
// 	{
// 		A a=new B();
// 	//	B b=new B(2);



// 		System.out.println( " child hashcode is "+ a.hashCode()) ;
		
// 		a.m1();
// 		//a.m3();
// 		//b.m1();
// 		//b.m2();

// 	}
// }