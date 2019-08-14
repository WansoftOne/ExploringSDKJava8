package com.wansoft.thread;

public class MyThread extends Thread{
	/**
	 * THE CLASS THREAD IMPLEMENTS RUNNABLE
	 * THE START METHOD FROM THREAD INVOKE RUN METHOD.
	 */
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("My thread says:");
			Thread.sleep(1000);
			System.out.println("decrypting the message...");
			Thread.sleep(3500);
			System.out.println("Have a good nigth and a great day");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
