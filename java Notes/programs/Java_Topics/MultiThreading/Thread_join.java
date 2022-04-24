package MultiThreading;
import java.util.*;
public class Thread_join {
public static void main(String[] args) throws InterruptedException
{
	Thread.currentThread().setName("main Thread");
	System.out.println("child thread is creadtwd by Thread "+Thread.currentThread().getName());
	
	//Thread5.t=Thread.currentThread();
	
	
	Thread5 t=new Thread5();
	t.setName("child - 1" );
	System.out.println("child thread is excecuted by Thread "+t.getName());
	t.start();
	t.join();//main method calling the child to complete its execution.
	
	
	//if we add join(5000) then after the time period the main will execute // 1000 ms=1 sec 
	for(int i=0;i<10;i++)
	System.out.println("main");
	
	
}
}

class Thread5 extends Thread
{
	
	static Thread t;
	public void run ()
	{
		
		try {
			//t.join(); this chil calling main mthd to complete its execution
			for(int i=0;i<10;i++)
			{
			System.out.println("child");
			Thread.sleep(1000);
			}	
		}catch(InterruptedException Ie){	 System.out.println("intrrupted");}
}
}