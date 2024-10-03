package com.multithreadingDemo;
class Thread3 extends Thread{
	Thread3(String name, int priority){
		//set priority
		super(name);
		setPriority(priority);
	}
	//excution
	public void run() {
		for(int i=1; i<5; i++) {
			System.out.println(getName()+"Numbers:-"+" "+i);
		}
	}
}

public class MyThread3 {
	public static void main(String[] args) {
		Thread3 t1 =new Thread3("High priority thread:-",Thread.MAX_PRIORITY);
		Thread3 t2 =new Thread3("Mid priority thread:-",Thread.NORM_PRIORITY);
		Thread3 t3 =new Thread3("Low priority thread:-",Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	
	
	}

}
