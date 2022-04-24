class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for( int i= 0 ; i< 10 ; i ++ )
			{
				System.out.println(" i am sleeping ");
			Thread.sleep(500);
			}
		}catch(InterruptedException ie)
			{
				System.out.println(" i got Interrupted "); 
			}
		
	}
}

class ThreadSleepDemo
{
	public static void main(String[] args) {
		
		MyThread m1=new MyThread();
		m1.start();

		m1.interrupt();

		System.out.println(" prg executed");
	}
}