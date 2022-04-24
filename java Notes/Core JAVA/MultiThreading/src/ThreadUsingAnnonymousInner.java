class ThreadUsingAnnonymousInner {
	public static void main(String[] args) {
		Object obj = new Object();
		//new Thread(new Runnable() {}).start();

		new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=10;i++) {
					if(i == 5) {
						synchronized(obj) {
							try { obj.wait();}catch(InterruptedException e) {}
						}
					}
					System.out.println("Thread1=>"+i);
				}
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {
				for(int i=101;i<=110;i++) {
					if(i == 105) {
						synchronized(obj) {
							try { obj.wait();}catch(InterruptedException e) {}
						}
					}
					System.out.println("Thread2=>"+i);
				}
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				for(int i=201;i<=210;i++) {
					System.out.println("Thread2=>"+i);
					if(i == 205) {
						synchronized(obj) {
							obj.notifyAll();
						}
					}
				}
			}
		}).start();
	}
}
