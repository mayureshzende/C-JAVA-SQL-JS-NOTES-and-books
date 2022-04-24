package MultiThreading;
import java.util.*;

public class Thread_Impple_Run {

	public static void main(String[] args) {
	
	Thread1 t1=new Thread1();
	Thread t=new Thread(t1);
	//t1.run();
	t.start();
	t.setName("child name is set");
	System.out.println(t.getName());
	for(int i=0;i<20;i++)
	System.out.println("main");
	Thread.currentThread().setName("MAyruesh thread");
	System.out.println("thread name is"+Thread.currentThread().getName());
}
}


class Thread1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println("chlid");
	}
}