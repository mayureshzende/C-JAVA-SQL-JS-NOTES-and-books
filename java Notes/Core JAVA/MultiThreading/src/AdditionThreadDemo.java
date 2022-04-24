import java.util.Arrays;

class AdditionThread extends Thread {
	int[] a;//input of thread
	int sum = 0;//output of thread
	AdditionThread(int[] a) { this.a = a; }
	public void run() {
		for(int i=0; i<10;i++) {
			this.sum += a[i];
		}
		System.out.println(Thread.currentThread().getName()+":"+sum);
	}
}

public class AdditionThreadDemo {
	public static void main(String[] args) {
		int[] arr = new int[100];//1-100
		for(int i=1;i<=100;i++) {
			arr[i-1] = i;
		}
		AdditionThread[] t = new AdditionThread[10];
		for(int i=0; i < 10; i++) {
		 int[] subArr = Arrays.copyOfRange(arr,i*10,i*10+10);
		 t[i] = new AdditionThread(subArr);
		 t[i].start();
		 try { t[i].join(); } catch(InterruptedException e) {}
		}
		System.out.println("All addition threads are completed!!!");
		int total = 0;
		for(int i=0;i<10;i++) {
			total = total + t[i].sum;
		}
		System.out.println(total);//5050
	}
}












