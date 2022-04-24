class MyThread extends Thread{
	public void run()
	{
		Thread.yield();
		for(int i=0; i< 10 ; i++ )
		{
			System.out.println(" i is " + i);
		}
	}
	// public void start()
	// {
	// 	//super.start();
	// 	System.out.println(" start overloaded");
	// }
}

class MultiThreadingDemo
{
	public static void main(String[] args) {
		
		MyThread m1=new MyThread();
		m1.setPriority(3);
		m1.start();
		
	//	Thread.currentThread().yield();

		for(int i = 0 ; i < 10 ; i++  )
		{
			System.out.println(" main is started  " + i);
		}

		//m1.start(); illegalthread state exception 


	}
}