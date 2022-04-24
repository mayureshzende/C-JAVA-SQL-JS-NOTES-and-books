public class AdditionDemo {
	public static void main(String[] args) {
		System.out.println("start:Division");
		int n1=0,n2=0, ans=0;
		try {
			 n1 = Integer.parseInt(args[0]);
			 n2 = Integer.parseInt(args[1]);
			 ans = n1 / n2;
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Please pass arguments...");
		}catch(NumberFormatException e2) {
			System.out.println("Please pass numbers");
			System.exit(0);
		}catch(Exception e3) {
			System.out.println("Some exception occurred");
			e3.printStackTrace();
		}
		System.out.println(ans);
		System.out.println("end:division");
	}
}

//When we write multiple catch blocks, the sequence of catch block must be from child 
//to parent classes

















