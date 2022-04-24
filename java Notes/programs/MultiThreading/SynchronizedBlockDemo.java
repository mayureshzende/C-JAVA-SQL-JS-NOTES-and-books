class Display
{
	public void wish(String name)
	{
		synchronized(this)
		{
			for(int i=0 ;i < 10 ; i++ )
			{
				System.out.print(" Hello ");	
				try{			
						Thread.sleep(500);
						System.out.println(name);		
					}catch(InterruptedException ie) { }
			}
		}		
	}
}

class MyThread extends Thread 
{
	Display d;
	String name;

	MyThread(Display d , String name)
	{
		this.d=d;
		this.name=name;
	}

	public void run()
	{
		d.wish(name);
	}

}

class SynchronizedBlockDemo
{
	public static void main(String[] args)
	{
		Display d=new Display();
		//Display d1=new Display();

		MyThread m1=new MyThread(d,"mayur");
		MyThread m2=new MyThread(d,"chiku");
		m1.start();
		m2.start();
	}
}