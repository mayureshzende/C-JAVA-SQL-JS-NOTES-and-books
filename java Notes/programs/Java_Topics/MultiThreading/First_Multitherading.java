
//import java.util.*;
public class First_Multitherading {
public static void main(String[] args) {
	
	myThread mt=new myThread();
	mt.start();
	//mt.run();
	for(int i=0;i<10;i++)
	{
		System.out.println("in main class"+i);
	}
	
}
}


class myThread extends Thread
{
//	public void start()
//	{
//		System.out.println("in thrread start ");
//	super.start();
//	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("in thread class 1 - "+i);
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("int thread class 2 - "+i);
		}

	}
}
	
	
