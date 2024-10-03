package com.multithreadingDemo;

class Thread1 extends Thread{
	public void run() {
		System.out.println("My first thread is running");
	}
}

public class MyThread1 {
	public static void main(String[]args) {
	// Object
	Thread1 t1=new Thread1();
	// start method
	t1.start();
	
	System.out.println("Main thread is running");
    
	}
}
