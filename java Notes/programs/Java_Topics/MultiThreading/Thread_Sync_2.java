package MultiThreading;
import java.util.*;

public class Thread_Sync_2 {
public static void main(String[] args) {
	Display1 d=new Display1();
	
	MyThread8 mt=new MyThread8(d);
	MyThread9 mt1=new MyThread9(d);
	
	mt1.start();
	mt.start();

}
}


class Display1
{
	public synchronized void dispalyN()
	{
		for(int i=65;i<=75;i++)
		{
			System.out.print((char)i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				
			}
		}
	}
	
	public synchronized void displayC()
	{
		for(int i=0;i<10;i++)
		{
			System.out.print(i);
		}
	}
}

class MyThread8 extends Thread
{
	Display1 d;
	
	public MyThread8(Display1 d) {
	this.d=d;
	}
	public void run()
	{
		d.dispalyN();
	}
}

class MyThread9 extends Thread
{
	Display1 d;
	
	public MyThread9(Display1 d) {
	this.d=d;
	}
	public void run()
	{
		d.displayC();
	}
}