class Account {
 int balance; int actNo;
 Account(int actNo, int balance) { 
	 this.balance= balance; this.actNo = actNo;
 }
 synchronized public void withdrawl(int amt) {
  System.out.println("Your balance before withdrawl:" + this.balance);
  try { Thread.sleep(100); }catch(InterruptedException e) {}
  this.balance -= amt;
  System.out.println("Your balance after withdrawl:" + this.balance);
 }
 synchronized public void deposit(int amt) {
	  System.out.println("Your balance before deposit:" + this.balance);
	  try { Thread.sleep(50); }catch(InterruptedException e) {}
	  this.balance += amt;
	  System.out.println("Your balance after deposit:" + this.balance);
 }
}

public class BankingExample {
	public static void main(String[] args) {
		Account act1 = new Account(101,10000);
		//Two thread performing critical operations on same account objecct
		new Thread(new Runnable() {
			public void run() {
				act1.withdrawl(2000);
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				act1.deposit(5000);
			}
		}).start();
	}
}


