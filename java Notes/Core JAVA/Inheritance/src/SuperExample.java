class OS {
	String name = "OS";
	OS(String name) { this.name = name; System.out.println("OS:Para"); }
	OS() { System.out.println("OS:defualt");}
	void print()  {
		System.out.println("OS Name=" + this.name);
	}
	
}
class Linux extends OS {
	String name = "Linux";
	Linux(String a, String b) { 
		super(a);
		this.name = b;
		System.out.println("Linux para");
	}
	Linux() { System.out.println("Linux:default");}
	void print() {
		super.print();
		System.out.println("Linux OS: " + this.name);
	}
	void display() { System.out.println(this.name + "=> " + super.name); }
}

public class SuperExample {
	public static void main(String[] args) {
		Linux obj1 = new Linux();
		Linux obj2 = new Linux("Unix","Ubuntu");
		obj1.print();
		obj2.display();
	}
}


