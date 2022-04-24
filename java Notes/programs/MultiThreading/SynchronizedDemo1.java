class Display
{
	public synchronized void displayn()
	{
		for ( int i= 1 ; i<= 10 ; i++ )
		
		{
			System.out.print( i );
			try{
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		} 
	}
	

	public synchronized void displayc()
	{
		for( int i=65 ; i <= 75 ; i++ )
		{
			System.out.print( (char)i );
			try
			{
				Thread.sleep(500);
			}catch( InterruptedException ie)
			{}
		}
	}
}

class MyThread extends Thread
{

	Display d;

	MyThread(Display d)
	{
		this.d=d;
	}

	public void run()
	{
		d.displayn();	
	}
}

class MyThread2 extends Thread 
{
	Display d;
	MyThread2(Display d)
	{
		this.d=d;
	}


	public void run()
	{
		d.displayc();
	}
}


class SynchronizedDemo1
{
	public static void main(String[] args)
	{
		Display d=new Display();
				// Display d1=new Display();
		
		MyThread m1=new MyThread(d);

		MyThread2 m2=new MyThread2(d);



		m1.start();

		m2.start();
	

	}
}