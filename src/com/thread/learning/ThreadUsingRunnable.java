package com.thread.learning;

public class ThreadUsingRunnable {

	public static void main(String[] args) {
		Thread t = new Thread(new Runable());
		t.start();
		for(int i = 1; i<=5; i++) {
			System.out.println("Main Class");
			try {
				Thread.sleep(750);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}

class Runable implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <=5; i++) {
			System.out.println("Thread Class");
			try {
				Thread.sleep(650);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
