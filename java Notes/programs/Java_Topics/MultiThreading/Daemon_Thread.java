package MultiThreading;

public class Daemon_Thread {
public static void main(String[] args) {
	
	System.out.println(Thread.currentThread().isDaemon());
	//Thread .currentThread().setDaemon(true); Re Illegal Thread state Exception
	
	
	Thread_d t=new Thread_d();
	//System.out.println(t.isDaemon());
	//t.setDaemon(true);
	t.start();
	//System.out.println(t.isDaemon());
	
	
	System.out.println("main ended");
}
}


class Thread_d extends Thread
{
	public void run()
	{
		for(int i=0;i<25;i++)
		{
			System.out.println("chlid "+i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e)
{}
		
		}
	}
}