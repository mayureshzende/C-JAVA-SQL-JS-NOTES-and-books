class MyThread implements Runnable
{
	public void run()
	{

		System.out.println(" in run mthod" );
	}
}


class ThreadImplements 
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		Thread t1=new Thread();
		Thread t2=new Thread(t);

		//t1.start(); // no op as the call is to the 
		//t1.run();  // no op  has empty implementation in the thread class
		
			t2.start(); // new thread and o/p is from the run()
			System.out.println(" the t2.start start method excecuted by " + t2.getName() ); 
			
		//	t2.run(); //  no new thread direct the run method of the MyThread class 
			System.out.println(" the t2.run  method excecuted by " + t2.getName()); 

		//	t.run();
		//	t.start();

			//t1.run();	


	}

}