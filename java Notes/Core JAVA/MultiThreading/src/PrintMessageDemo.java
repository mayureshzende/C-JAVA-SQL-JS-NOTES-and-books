// How to write parameterized thread?
//Hi-10,  Hello-20, Good-morning-15
class PrintMsgThread extends Thread {
	int n;
	String msg;
	PrintMsgThread(int n, String msg) {
		this.n = n; this.msg = msg;
	}
	public void run() {
		for(int i=1; i<=n;i++) {
			System.out.println(msg+":" +i);
		}
	}
}
public class PrintMessageDemo {
	public static void main(String[] args) {
		PrintMsgThread t1 = new PrintMsgThread(10,"Hi");
		PrintMsgThread t2 = new PrintMsgThread(15,"Good-Morning");
		PrintMsgThread t3 = new PrintMsgThread(20,"Hello");
		t1.start();
		t2.start();
		t3.start();
	}
}










