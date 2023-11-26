
public class ThreadJoidDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//MyThreadJoin.mt = Thread.currentThread();
		MyThreadJoin t = new MyThreadJoin();
		t.start();
		t.interrupt();
		//t.join(10000);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			//Thread.sleep(2000);
		}
	}

}

class MyThreadJoin extends Thread{
	//static Thread mt;
	@Override
	public void run() {
		/*
		 * try { mt.join(); //Thread.sleep(2000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
				//Thread.sleep(2000);
			}
		} catch (Exception ie) {
			// TODO: handle exception
			ie.printStackTrace();
		}
	}
	
}
