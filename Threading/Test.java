package Threading;

class Data{
	synchronized void display(String s) throws InterruptedException {
		for(int i=0 ; i<s.length()-1 ; i++) {
			System.out.println(s.charAt(i));
			Thread.currentThread().sleep(1000);
		}
	}
}

class Tread1 extends Thread{
	Data d;
	Tread1(Data d){
		this.d = d;
	}
	public void run() {
		try {
			d.display("Hello World");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Tread2 extends Thread{
	Data d;
	Tread2(Data d){
		this.d = d;
	}
	public void run() {
		try {
			d.display("Welcome Arpit");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



public class Test {

	public static void main(String[] args) {
		Data d = new Data();
		Tread1 t1 = new Tread1(d);
		Tread2 t2 = new Tread2(d);
		t1.start();
		t2.start();
		
	}

}
