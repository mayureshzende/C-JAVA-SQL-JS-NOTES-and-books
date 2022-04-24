package MultiThreading;
import java.util.*;

public class Thread_Wait_Notify {
public static void main(String[] args) throws InterruptedException 
	{
		Wn1 t=new Wn1();
		t.start();				// t.slwwwp(0,1); t.join();
		synchronized(t)
		{
			System.out.println("main is waiting for child to notify");
			t.wait();
		}
		System.out.println("main got the notification");
		System.out.println(t.total);
 	}

}
class Wn1 extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("child has started the exceution");
		for(int i=1;i<=100;i++)
		{
			total +=i;
		}
		System.out.println("child has notified the maiin method");
		this.notify();
		
		}
	}
	
}