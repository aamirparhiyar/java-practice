
public class DeadLockDemo {

	public static void main(String[] args) {
		DeadLock d = new DeadLock();
		d.m1();

	}

}
class DeadLock extends Thread{
	A a = new A();
	B b = new B();
	
	public void m1() {
		this.start();
		a.d1(b);
	}

	@Override
	public void run() {
		b.d2(a);
	}
	
}
class A{
	
	public synchronized void d1(B b) {
		System.out.println("T1 execution of d1()");
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("T1 trying to call last()");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside A");
	}
}

class B{
	
	public synchronized void d2(A a) {
		System.out.println("T2 execution of d2()");
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("T2 trying to call last()");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside B");
	}
}
