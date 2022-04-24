class X {
	X() { System.out.println("X:1");}
	static {
		System.out.println("static-X");
	}
}
class Y extends X {
	static {
		System.out.println("static-Y");
	}
	Y() { System.out.println("Y:1"); }
} 
class Z extends Y {
	Z() { System.out.println("Z:1"); }
	static {
		System.out.println("static-Z");
	}
}
public class StaticBlockExample {
	StaticBlockExample() { System.out.println("1");}
	static {
		System.out.println("static-0");
	}
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("****");
		new Y();
		System.out.println("****");
		new Z();
	}
}








