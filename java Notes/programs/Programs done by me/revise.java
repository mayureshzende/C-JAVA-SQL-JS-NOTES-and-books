import java.util.*;

class revise
{
	public static void main(String[] args) throws InterruptedException
	{

		// Display d=new Display();

		MyThread m1=new MyThread();
		m1.start();
		Thread.currentThread().sleep(1);
		synchronized(m1){
			System.out.println("1 the chlid we do the total ");
			m1.wait();

			System.out.println("4 i have recived the notification ");
		}

		System.out.println("the total is " + m1.total);


		// Display d1=new Display();
		// // MyThread m3=new MyThread(d,"resh");
		// m3.start();

		// MyThread2 m2=new MyThread2(d);
		// m2.start();
	
	}
}	

class MyThread extends Thread {
int total = 0; 
	public void run(){
		
		synchronized(this){
			System.out.println(" 2 i am calculating ");
			for(int i =1 ; i<= 1_00 ; i++ ){
				total  += i ;
			}

		System.out.println(" 3 i am done and passs to main ");
		 this.notify();
		}
			}
}

// class MyThread2 extends Thread {
// 	Display d;

// 	MyThread2(Display d)
// 	{
// 		this.d=d;
// 	}

// 	public void run(){
// 		// d.disC();
// 	}
// }

// class Display 
// {
// 	public void wish(String name){

// 		synchronized(this){
// 			for(int i=0 ; i< 5 ; i++)
// 			{
// 			System.out.print("hi - ");
// 			try{
// 				Thread.sleep(500);
// 			}catch(InterruptedException e){}
// 			System.out.println(name);
// 			}
// 		}
// 	}

	// public  synchronized void disC()
	// {
	// 	for(int i = 97 ; i< 107 ; i++ )
	// 	{  	
	// 		try{
	// 		System.out.println( (char)i );
	// 		Thread.sleep(500);
	// 		}catch(InterruptedException e){}
	// 	}
	// }
// }



// 		System.out.println(Arrays.toString(s));
// 		System.out.println("Topper is "+ topper(s));

// 		System.out.println(sum(1, 2, 3, 4));

// 	}
// 	static int sum(int... a)
// 	{
// 		int sum=0;
// 		for( int i=0 ; i<a.length ; i++)
// 		{
// 			sum += a[i];
// 		}
// 		return sum;
// 	}
// 	public static Stud topper(Stud[] s)
// 	{
// 		Stud top= s[0];
// 		for(int i= 0; i < s.length ; i++ )
// 		{
// 			if( s[ i ].roll > top.roll  )
// 			{
// 				top = s [ i ];
// 			}
// 		}
// 		return top;
// 	}
// }

// class Stud
// {

// 	int roll;
// 	private String name;

// 	Stud(){}

// 	Stud(int roll, String name)
// 	{
// 		this.roll = roll ;
// 		this.name = name ;
// 	}

// 	public String toString()
// 	{
// 		return "[ roll no is " + this.roll + " name is "+ this.name +"] \n";
// 	}

// }

	// 	Scanner sc=new Scanner(System.in);

	// 	int[] c={10};
	// 	int[] arr = new int[3];

	// 	arr[0] = 'a';
	// 	int[] a = c; 
	// 	System.out.println(arr[1]);
	// 	System.out.println(arr[0]);
	// System.out.println(arr[2]);
	// System.out.println(a[0]);
	// System.out.println(arr.getClass().getName());