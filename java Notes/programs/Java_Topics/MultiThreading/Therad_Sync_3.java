package MultiThreading;
import java.util.*;

public class Therad_Sync_3 {
public static void main(String[] args) {
	
	D3 d=new D3();
	D3 d1=new D3(); /// 2 briyani plate  2dogs if we excecute on object lock so irregular output and on class level lock regular output
	MyThread31 mt=new MyThread31(d,"mayur");
	MyThread31  mt1=new MyThread31(d1, "zende");
	mt.start();
	mt1.start();
	
}
}

class D3
{
	public  void wish(String name)
  {
		synchronized(D3.class)//if we give "this" then irregular output, will get for it as it is acquiring object lock but need class lock also can write static syn 	
	{		
		for(int i=0;i<5;i++)
		{
		System.out.print("Good morining: ");
		try
		{
			Thread.sleep(2000);
		}catch(InterruptedException e){} //InterruptedException
			System.out.println(name);
		}
	}
  }
}

class MyThread31 extends Thread
{
	D3 d;
	String name;
	
	MyThread31(D3 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}