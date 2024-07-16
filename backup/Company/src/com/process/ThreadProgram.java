package com.process;

public class ThreadProgram {

	public static void main(String[] args) {
		new newThread();
	}

	public static double aa(byte x, double y) {
		return (long) x / y * 3;
	}

}

class newThread implements Runnable {
	Thread t;

	newThread() {
		t = new Thread(this, "My Thread");
		t.start();
	}

	@Override
	public void run() {
		System.out.println(t.getName());
	}
}
