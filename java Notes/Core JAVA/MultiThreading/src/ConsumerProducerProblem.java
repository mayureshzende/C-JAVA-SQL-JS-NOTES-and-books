class PenProductionThread extends Thread {
	Object obj;
	PenProductionThread(Object o) { this.obj = o;}
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("Pen : "+ i + " is ready");
			try { Thread.sleep(5000); } catch(InterruptedException e) {}
			synchronized(obj) {
				obj.notify();
			}
		}
	}
}
class PenColoringTherad extends Thread {
	Object obj;
	PenColoringTherad(Object o) { this.obj = o;}
	public void run() {
		for(int i=1; i<=100; i++) {
			synchronized(obj) {
				try { obj.wait(); } catch (InterruptedException e1) {}
			}
			System.out.println("Pen : "+ i + " is colored");
			try { Thread.sleep(2500); } catch(InterruptedException e) {}
		}
	}
}
public class ConsumerProducerProblem {
	public static void main(String[] args) {
		Object pen = new Object();
		new PenColoringTherad(pen).start();
		new PenProductionThread(pen).start();
	}
}







