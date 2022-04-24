package MultiThreading;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Thrad_Yield {
public static void main(String[] args) throws InterruptedException {
	
	//Thread.currentThread().setPriority(10);
	/** yield()  it gives the chance to other same priority thread. */
	
	Thread4 t=new Thread4();
	//t.setPriority(10);
	t.start();

	
	for(int i=0;i<15;i++)
		System.out.println("main ");
		
	}
}


class Thread4 extends Thread
{
	public void run()
	{
		Thread.yield();
		System.out.println("wating for 1 sec");
	
		for(int i=0;i<10;i++)
			{
				
			System.out.println("chlid thread");
			}
	}
}