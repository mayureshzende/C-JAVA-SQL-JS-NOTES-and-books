class Number {
	int num;
	Number() {}
	Number(int num) { this.num = num;}
}

class PassByForObjects {
	public static void main(String[] args) {
		Number n1 = new Number(5);
		System.out.println("Before change:" + n1.num);
		change(n1);
		System.out.println("After change:" + n1.num);
	}

	static void change(Number n2) {
		n2.num = n2.num * n2.num;
	}
}