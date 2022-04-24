class One {
	One() { System.out.println("1");}
	One(int a) { 
		this();
		System.out.println("11");
	}
}
class Two extends One {
	Two() { System.out.println("2");}
	Two(int a, int b) {
		super(a);
		System.out.println("22");
	}
}
class Three extends Two {
	Three() { System.out.println("3");}
	Three(int a, int b, int c) {
		super(a,b);
		System.out.println("33");
	}
}
public class ThisSuperExample {
	public static void main(String[] args) {
		new Three();  System.out.println("******");
		new Three(1,2,4);  System.out.println("******");
		new Two(1,2); System.out.println("******");
		new One(4);System.out.println("******");
	}
}





