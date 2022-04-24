package MultiThreading;
import java.util.*;

import org.omg.CORBA.NO_RESOURCES;

public class Therad_Priority {
public static void main(String[] args) {
	//Thread.currentThread().setPriority(10);
	System.out.println("main thread mname is "+Thread.currentThread().getName()+ " and priority is "+Thread.currentThread().getPriority());
	
		Thread3 t=new Thread3();
		//t.setPriority(5);
		t.start();
		t.setPriority(t.MIN_PRIORITY);
		
		System.out.println("child thread name is "+t.getName()+" and priority is "+t.getPriority());
		t.setName("thread child 1");
		System.out.println("child thread is renamed to \" "+t.getName() +" \" ");
		
	
	Thread.currentThread().setName("main 1");
	System.out.println("main is thread is renaamed to - \" "+Thread.currentThread().getName() +" \"");	
	
	for(int i=0;i<20;i++)
	System.out.println("main "+i);
	
	}
}

class Thread3 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println("chlid thread="+i);
	}
}