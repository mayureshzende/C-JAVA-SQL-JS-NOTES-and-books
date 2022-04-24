class Pen {
	static { System.out.println("pen:static");}
	Pen() { System.out.println("PEN");}
}
class BallPen extends Pen {
	static { System.out.println("ball:static");}
	BallPen() { System.out.println("BALL");}
}
class InkPen extends Pen {
	static { System.out.println("ink: static");}
	InkPen() { System.out.println("INK");}
}
public class StaticBlockPuzzle {
	static {
		System.out.println("1");
		fun();
		System.out.println("2");
	}
	static void fun() {
		new InkPen();
		System.out.println("***");
		new BallPen();
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
}
