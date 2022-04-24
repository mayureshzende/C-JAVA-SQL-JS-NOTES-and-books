class Download extends Thread
{
	String msg;
	Download()
	{}

	Download(String msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		for(int i=0;i<20;i++ )
		{
				System.out.println(" downloading... " + i + " % is excecuting by  the "+ Thread.currentThread().getName() + " by owner" + msg);
		}
	}
} 


class Music implements Runnable
{
	int no;
	String name;
	Music(){}
	Music(int no, String name)
	{
		this.no=no;
		this.name=name;
	}	
	public void run()
	{
		System.out.println(" the chlid music has prioirty " + Thread.currentThread().getPriority());
		for( int i =0 ; i < 30 ; i++ )
		{
			System.out.println(" music is playing by the thread" + Thread.currentThread().getName() + " the progress is " + no + " song name is " + name );
		}
	}
}


class MultithreadedBrowser
{
	public static void main(String[] args)
	{
		Download d=new Download(" mayur");
		d.start();
		d.yield();
		d.setName(" downloading Thread");
		d.setPriority(Thread.MAX_PRIORITY);


		//Music m=new Music( 2 ," Won ");
		Thread t1=new Thread(new Music( 7 ," Won "));
		t1.start();	
		t1.setName(" music Thread");
		t1.setPriority(Thread.MIN_PRIORITY);

		System.out.println(" the main thread has the prioity " + Thread.currentThread().getPriority());
		System.out.println(" the prg is finished");


	}
}