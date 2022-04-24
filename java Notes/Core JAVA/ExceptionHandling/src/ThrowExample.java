
public class ThrowExample {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Invalid number of arugments: need 3");
			throw new IllegalArgumentException();
		} else {
			System.out.println("correct argumetns are passed");
		}
		System.out.println("END....");
	}
}
