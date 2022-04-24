package MultiThreading;

import java.util.*;

public class Thread_Sync_1 {
public static void main(String[] args) {
	
	Display d=new Display();
	
	MyThread7 t1=new MyThread7(d,"mayur");
	MyThread7 t2=new MyThread7(d,"kholi");
	MyThread7 t3=new MyThread7(d,"dhoni");
	
	t1.start();
	t2.start();
	t3.start();
	
}
}
class Display
{
	public synchronized void wish(String name)
	
	{
			for(int i=0;i<5;i++)
			{
				System.out.print("Hi - ");
			
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException e)
			{ }
			System.out.println(name);
			}
	}
}
class MyThread7 extends Thread
{
	Display d;
	String name;
	
	MyThread7(Display d,String name)
	{
		this.d=d;
		this.name=name;
		
	}
	
	public void run()
	{
		d.wish(name);
	}
}