

public class ThreadDemo {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(8);
		System.out.println("Main thread = " + Thread.currentThread().getPriority());
	
		MyThread t1 = new MyThread();
		Thread t = new Thread(t1);
		System.out.println("Child Thread = " + t.getPriority());
		t.start();
		t.setName("MY Thread");
		//t1.start();
		System.out.println("Main Thread : " + Thread.currentThread().getState());
		//t1.start();
	}

}

 class MyThread extends Thread
 {

		/*
		 * public void start() { super.start(); System.out.println("child start"); }
		 */
	public void run() {
		System.out.println("child thread : " + Thread.currentThread().getState());
		//int num = 10/0;
	}
	 
 }
