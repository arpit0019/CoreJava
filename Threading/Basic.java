package Threading;

class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<7;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}




public class Basic {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();

	}

}
