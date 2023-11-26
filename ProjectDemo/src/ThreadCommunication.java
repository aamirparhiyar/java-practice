
public class ThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		Thread.sleep(1000);
		synchronized(b) {
			System.out.println("Main Thread Calling Wait method");
			b.wait(1000/2);
			System.out.println("Main Thread got notification");
			System.out.println(b.total);
		}
		

	}

}

class ThreadB extends Thread{
	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child Thread starts calculation");
			for(int i = 1; i<=100; i++) {
				total += i;
			}
			System.out.println("Child Thread try to notify Main Thread");
			this.notify();
		}
	}
	
}
