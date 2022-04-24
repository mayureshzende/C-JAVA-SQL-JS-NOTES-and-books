public class SingleThreadedBrowser {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=100;i++) {
			System.out.println("Browsing : " + i + "%");
		}
		for(int i=1; i<=100;i++) {
			System.out.println("Printing : " + i + "%");
		}
		for(int i=1; i<=100;i++) {
			System.out.println("Downloading : " + i + "%");
		}
	}
}
