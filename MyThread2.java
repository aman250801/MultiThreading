package com.multithreadingDemo;
class Thread2 implements Runnable{
	public void run() {
		System.out.println("I am using runnable interface");
		for(int i=1; i<=10; i++) {
		   if(i%2==0) {
			   System.out.println(i);
			   //sleep
			   try {
				   Thread.sleep(1500);
			   }catch(InterruptedException e) {
				   e.printStackTrace();
			   }
			   System.out.println(Thread.currentThread().getName());
		   }
		}
	}
}

public class MyThread2 {
	public static void main(String[] args) {
		// object
		Thread2 runnable=new Thread2();
		// object thread
		Thread th=new Thread(runnable);
		th.start();
		System.out.println("main thread running");
		
	}

}
