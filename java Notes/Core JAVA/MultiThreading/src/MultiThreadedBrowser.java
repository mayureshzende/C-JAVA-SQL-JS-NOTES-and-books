class DownloadThread extends Thread {
	public void run() {
		System.out.println("***Downloading is handled by: " + 
				Thread.currentThread().getName());

		for(int i=1; i<=100;i++) {
			System.out.println("Downloading : " + i + "%");
		}
	}
}
class PrintingThread implements Runnable {
	public void run() {
		System.out.println("***Printing is handled by: " + 
				Thread.currentThread().getName());
		for(int i=1; i<=100;i++) {
			System.out.println("Printing : " + i + "%");
		}
	}
}
public class MultiThreadedBrowser {
	public static void main(String[] args) {
		DownloadThread t1 = new DownloadThread();
		t1.setName("Download-Thread");
		t1.start();
		Thread t2 = new Thread(new PrintingThread());
		t2.setName("Print-Thread");
		t2.start();
		
		System.out.println("***Browsing is handled by: " + 
					Thread.currentThread().getName());

		for(int i=1; i<=100;i++) {
			System.out.println("Browsing : " + i + "%");
		}
	}
}










