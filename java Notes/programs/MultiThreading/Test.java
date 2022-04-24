
	
class MyThread extends Thread 
{
int sum = 0 ;

	public void run()
	{
		synchronized(this){
			System.out.println("  2  child  is doing " );
		for( int i=0 ; i< 20 ; i++ )
		{			
			sum += i ;
		}
		System.out.println(" 3 i m done ");
		this.notify();
		}
	}
}
class Test
{
	public static void main(String[] args) throws InterruptedException
	{ 
		// MyThread.T=Thread.currentThread();
	
		MyThread m=new MyThread();
m.start();
		synchronized(m)
		{
			System.out.println("1  i m main ");
			m.wait();	
			System.out.println("4 i have recived the chlid");
		}

		System.out.println("the total is " + m.sum);


		// MyThread2 m2 = new MyThread2(d);
		// m2.start();

		// System.out.println(m.getName());

		// System.out.println("the main thread is " + Thread.currentThread().isDaemon()+"daemon" );
		// m.setDaemon(true);
	
		// m.start();
		
		// // m.join();

		// for( int i =0 ;i< 10 ; i++ )
		// {
		// 	System.out.println("main");
		// } 


}
}	