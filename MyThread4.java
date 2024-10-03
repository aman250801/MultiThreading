package com.multithreadingDemo;
class Thread4 extends Thread{
	public void run() {
		for(int i=1; i<5; i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Currently thread working:-"+Thread.currentThread().getName());
			System.out.println(i);
		}
	}
}

public class MyThread4 {
	public static void main(String[] args) {
		
	
	Thread4 t1 = new Thread4();
	Thread4 t2= new Thread4();
	Thread4 t3 = new Thread4();
	
	t1.start();
	try {
		t1.join();
	}catch(InterruptedException e) {

		e.printStackTrace();
	}
	t2.start();
	try {
		t2.join();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	t3.start();
	try {
		t2.join();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}


}
}
