class ThreadNames
{
	public static void main(String[] args)
	{

		System.out.println(" the main thread name before is  \" " + Thread.currentThread().getName() + " \" ");
		Thread.currentThread().setName(" mayuresh ");
		System.out.println(" the main thread is renamed to \"  " + Thread.currentThread().getName() + " \" ");

		MyThread t1=new MyThread();
		// Thread t1=new Thread(m); 
		// t1.start();

		t1.start();
		System.out.println(" child thread name is  \" " + t1.getName() + " \" ");

	//	t1.setName(" child of main - 0");
	//	System.out.println(" child thread renamed to \" " + t1.getName() + " \" ");

	}
}


class MyThread extends Thread
{
	public void run()
	{
		System.out.println(" child method ");

		System.out.println(" the child thread is excecuted by \"  " + Thread.currentThread().getName() + " \" ");
	}
}