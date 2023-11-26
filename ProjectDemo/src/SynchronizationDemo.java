
public class SynchronizationDemo {

	public static void main(String[] args) {
		Wish w = new Wish();
		WishThread t1 = new WishThread(w, "Ali");
		WishThread t2 = new WishThread(w, "Qaim");
		t1.start();
		t2.start();
	}

}

class Wish{
	public synchronized void wish(String name) {
		for (int i = 0; i < 3; i++) {
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class WishThread extends Thread{

	String name;
	Wish w;
	WishThread(Wish w, String name){
		this.w = w;
		this.name = name;
	}
	
	@Override
	public void run() {
		w.wish(name);
	}
	
}
