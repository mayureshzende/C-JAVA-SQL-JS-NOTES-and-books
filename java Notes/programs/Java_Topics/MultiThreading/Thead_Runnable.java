package MultiThreading;
import java.util.*;
public class Thead_Runnable {
	public static void main(String[] args) {
		
	Thread_Run tr=new Thread_Run();
	//tr.start(); //complie time error no such method in runnable
	tr.run(); //direct call to the call method
	
	Thread t1=new Thread();
	t1.start();//no output as it has the empty implementation of thread class
		
	System.out.println(" - - - -");
	Thread t2=new Thread(tr);
	t2.start(); //class the run method of parent class runnable
	//t2.run();
	
	for(int i=0;i<10;i++)
	System.out.println("in main class");
	
	}
}


class Thread_Run implements Runnable
{

	public void run()
	{
		System.out.println("in run of runnable");
	}
}
