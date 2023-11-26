
public class ThreadWithRunnable {

	public static void main(String[] args) {
		MR r = new MR();
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		
		//case 1
		//t1.start();
		//case 2
		//t1.run();
		//case 3
		//t2.start();
		//case 4
		//t2.run();
		//case 5
		//r.start();
		//case 6
		r.run();
	}

}

class MR implements Runnable{

	@Override
	public void run() {
		System.out.println("MR Thread");
		
	}
	
}
