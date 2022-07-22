package Threading;

class MyData{
	
	 void display(int n) throws InterruptedException {
		int x=0;
		for(int i=0 ; i<n ; i++) {
			x = x+i;
		}
		System.out.println(Thread.currentThread().getName()+"  " + x);
}
}

	class MyThread1 extends Thread{
		MyData d;
		int y;
		MyThread1(MyData d){
			this.d=d;
		}
		public void setValue(int y) { this.y=y;}
		
		public void run() {
			try {
				d.display(y);
			} catch (InterruptedException e) {}
		}
	}
	

	
	
	
public class Problem {

	public static void main(String[] args) throws InterruptedException {
		MyData d = new MyData();
		MyThread1 t1 = new MyThread1(d);
		MyThread1 t2 = new MyThread1(d);
		MyThread1 t3 = new MyThread1(d);
		
		t1.setValue(10);
		t2.setValue(10);
		t3.setValue(10);
		
		t1.setName("Thread A -");
		t2.setName("Thread B -");
		t3.setName("Thread C -");
		
		t1.start();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
	}

}
