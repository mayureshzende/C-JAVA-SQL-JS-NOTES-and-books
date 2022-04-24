class MyThread extends Thread
{
	int total=0;

	public void run()
	{
		synchronized(this)
		{
			System.out.println( " 2 the child is doing the total ");
			for( int i=1 ;i <= 1_00 ; i++ )
			{
				total +=i ;
			}
			System.out.println(" 3 the child has Notified the parent") ;
			this.notify();
		}	
	}
}

class WaitNotifyDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread t=new MyThread();
		t.start();
		
		//Thread.sleep(0,1); //it would go into the deadlock situtation  as the child will get the excecuted and notify before the main() call wait
		synchronized(t)
		{
		System.out.println(" 1 waiting for the child method to do the total ");			
		t.wait();

		System.out.println( " 4 the notificationn is recived");

		}
		System.out.println(t.total);
	}
}