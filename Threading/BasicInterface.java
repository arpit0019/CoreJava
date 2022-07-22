package Threading;
class Threa1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
class Threa2 implements Runnable{
	public void run() {
		for(int i=0;i<7;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
public class BasicInterface {

	public static void main(String[] args) {
		Threa1 th1 = new Threa1();
		Thread t1 = new Thread(th1);
		Threa2 th2 = new Threa2();
		Thread t2 = new Thread(th2);
		
		t1.start();t2.start();
	}

}
