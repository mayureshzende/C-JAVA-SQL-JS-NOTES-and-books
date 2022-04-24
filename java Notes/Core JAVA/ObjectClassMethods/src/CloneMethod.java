public class CloneMethod {
	public static void main(String[] args) {
		Emp e1 = new Emp(12,"john",19000);
		Emp e2 = null;
		try {
			e2 = (Emp)e1.clone();//Object
		}catch(CloneNotSupportedException e) {
			System.out.println("Cloning not supported!!!");
			System.exit(0);
		}
		e2.salary = 30000;
		System.out.println(e1);//12 john 19000
		System.out.println(e2);//12 john 30000
	}
}



