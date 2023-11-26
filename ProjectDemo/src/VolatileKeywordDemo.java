import java.util.Scanner;

public class VolatileKeywordDemo {

	public static void main(String[] args) {
		VolatileThread t = new VolatileThread();
		t.start();
		System.out.println("Press Enter to stop thread");
		new Scanner(System.in).nextLine();
		t.shutDown();
	}

}

class VolatileThread extends Thread{
	
	private volatile boolean running = true;
	
	public void run() {
		while(running) {
			System.out.println("Running");
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public void shutDown() {
		this.running = false;
	}
}
