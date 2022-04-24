class Display
{
	public synchronized void wish(String name)
	{
		for( int i =0 ; i< 10 ; i++ )
		{
			System.out.print(" Hi ");
			try
			{
					Thread.sleep(500);
					System.out.println(name);
			}catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}	
}

class MyThread extends Thread
{
	Display d;
	String name;

	MyThread (Display d, String name)
	{
		this.d=d;
		this.name=name;
	}

	public void run()
	{	
		
		d.wish(name);		
	}
}
class SynchronizedDemo
{
	public static void main(String[] args)
	{
		Display d=new Display();
		Display d1=new Display();
	//	System.out.println(" the hashcode of D is  " + d.hashCode());
	//	System.out.println( " the hashcode of d1 is " + m1.hashCode());
		MyThread m1=new MyThread(d," mayur");	
	
		MyThread m2=new MyThread(d," chiku ");
		m1.start();
	
		m2.start();


	}

}