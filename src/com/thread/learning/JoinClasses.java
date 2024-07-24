package com.thread.learning;

public class JoinClasses {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1());
		t1.start();
		try {
			t1.join();
			for (int i = 1; i <= 5; i++) {
				System.out.println("Main Class");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Thread1 implements Runnable {
	@Override
	public void run() {
		Thread t2 = new Thread(new Thread2());
		t2.start();
		try {
			t2.join();
			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread1 Class");
				Thread.sleep(650);
			}
		} catch (Exception e) {
		}
	}
}

class Thread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread2 Class");
		}
	}
}
