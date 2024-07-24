package com.thread.learning;

public class ThreadLearn {

	public static void main(String[] args) {
		Main t = new Main();
		t.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Class");
			try {
				Thread.sleep(650);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Main extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread Class");
			try {
				Thread.sleep(650);
			} catch (Exception e) {
			}
		}
	}
}