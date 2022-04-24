class MyThread extends Thread  
{
	static Thread mt;
	public void run() 
	{
		
		try{
			mt.join(); // here we have to give chance to main thread first so chlid calls join method // the method calling join has to wait for the called method to finish
			for( int i= 0 ; i< 10 ; i++ )
		{
			System.out.println(" chlid  thread");
			Thread.sleep(500);		
		}
		}
		catch(InterruptedException Ie)
		{
			System.out.println(" intrrupted");
		}
		
	}
}

class ThreadJoinDemo
{
	public static void main(String[] args ) throws InterruptedException
	{
		//Thread.currentThread().join(1000);
		MyThread.mt=Thread.currentThread(); // we asssing the main thread to the chlid mt variable so it call wait for main thread to wait
		MyThread m1=new MyThread();
		m1.start();
		// m1.join();

		for( int i = 0 ; i < 10 ; i++)
		{
			System.out.println(" the main thread "+ i);
			Thread.sleep(500);
		}
	}
}