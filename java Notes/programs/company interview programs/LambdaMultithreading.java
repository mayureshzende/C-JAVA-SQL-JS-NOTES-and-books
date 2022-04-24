// package com.lambada.two 

// class MyRunnable implements Runnable {
	
// 	public void run(){
// 		for( int i = 0 ; i < 10 ; i++ ){
// 			System.out.println("child hello ");
// 		}
// 	}
// }


class LambdaMultithreading
{
	public static void main(String[] args ){


		//MyRunnable r = new MyRunnable();
		Runnable r = () -> {
			for( int i = 0 ; i< 15 ; i++ ){
				System.out.println("child ");
			} 
		};

		Thread t = new Thread(r);

		t.start();

		for(int i = 0 ; i< 10 ; i++ ){
			System.out.println("main thread ");
		}
	}
}