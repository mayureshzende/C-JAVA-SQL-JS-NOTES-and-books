class Electronics {
	static {
		System.out.println("Electronic:static");
	}
	Electronics() {
		System.out.println("Electronic:constructor");
	}
	{ 
		System.out.println("Electronic:instance");
	}
}
class TV extends Electronics {
	{ 
		System.out.println("TV:instance");
	}
	TV() {
		System.out.println("TV:constructor");
	}
	static {
		System.out.println("TV:static");
	}
}
public class InstanceBlock {
	static { System.out.println("main:static");}
	{ System.out.println("main:instance");}
	InstanceBlock() {}
	public static void main(String[] args) {
		new TV();
		new Electronics();
	}
}




