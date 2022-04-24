import java.util.*;


// class Sample
// {
// // 	public synchronized void show()
// // 	{
// // 			int n=0;
// // 		Vector a=new Vector();

// // 		a.add("A");
// // 		a.add("B");
// // 		a.add("c");
// // 		System.out.println(++n);
	
// // 			System.out.println(a);

// // 			for(int i=0 ; i < 5 ; i++ )
// // 			{
// // 				System.out.println(" " +i);
// // 			try{
// // 		Thread.sleep(1000);
// // 			}catch(InterruptedException e){}
				
// // 	}			}
// // }
// // class MyThread extends Thread
// // {
// // 	Sample s;
// // 		MyThread(Sample s)
// // 		{
// // 			this .s=s;
// // 		}
// // 	public void run()
// // 	{
// // 		s.show();
	
// // 	}
// // }

class ColTest

{
	public static void main(String[] args)
	{
		// Sample s=new Sample();

		// MyThread m=new MyThread(s);
		// MyThread m1=new MyThread(s);

		// m.start();
		// m1.start();

	String[] s={" mayur ", " zende"};

		for( String i : s)
		{
			System.out.println(i);
		} 

		List<String> a=Arrays.asList(s);
		System.out.println(a);


	}
}