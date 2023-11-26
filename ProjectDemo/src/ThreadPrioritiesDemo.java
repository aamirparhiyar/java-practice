
public class ThreadPrioritiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadOne t = new MyThreadOne();
		//t.setPriority(10);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}

class MyThreadOne extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			//Thread.yield();
		}
	}
}
