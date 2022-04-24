package MultiThreading;
import java.util.*;
public class Thread_Sleep_Interrupt {
public static void main(String[] args) throws InterruptedException {
	
	Thread6 t=new Thread6();
	t.start();
	t.interrupt();
for(int i=0;i<10;i++)
	System.out.println("main end"+i);
	
}
}


class Thread6 extends Thread{
	
	public void run()
	{
		try {
			for(int i=0;i<10;i++)
					{
				System.out.println("child thread");
				Thread.sleep(2000);
					}
				
			}
		catch(InterruptedException e)
		{
			System.out.println("Intrrupted");
		}
	}
}