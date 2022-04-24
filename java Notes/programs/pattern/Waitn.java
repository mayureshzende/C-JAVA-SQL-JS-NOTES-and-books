//package com.multi 

class mythread extends Thread {
	 int total = 0; 
	public void run(){		
		synchronized(this){
			System.out.println("2 child got con ");
		for(int i = 0 ; i <=  10 ; i++ ){
			total += i ;
			
		}
		System.out.println("3 child has notified parent ");
		this.notify();
		}
	}
}

class waitn
{
	public static void main(String[] args)throws InterruptedException {
		

		mythread m= new mythread();
		m.start();

		synchronized(m ){
			System.out.println("1 main is calling child");
			m.wait();
			System.out.println("4 got notification");
		}

		System.out.println(m.total);
		// for(int i =0 ; i< 10 ;i++)
		// System.out.println(i);
	}
}