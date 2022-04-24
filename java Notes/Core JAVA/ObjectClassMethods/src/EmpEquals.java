//Cloneable is one of the interface
class Emp implements Cloneable {
	int id;
	String name;
	float salary;
	Emp() {}
	Emp(int id, String name, float salary) {
	 this.id = id; this.name = name; this.salary = salary;
	}
	//How to override equals() method of Object class
	public boolean equals(Object obj) {
		//check if both objects are pointing to same location
		if(this == obj) { return true; }
		//check if second object is of correct type
		if(obj instanceof Emp) {
			Emp e1 = this;
			Emp e2 = (Emp)obj;//type-casting
			//do data comparison
			return e1.id==e2.id && e1.name.equals(e2.name) && 
				   e1.salary == e2.salary;
		}
		return false;
	}
	public String toString() {
		return "[id="+this.id+",name="+this.name+",salary="+this.salary+"]";
	}
    protected Object clone() throws CloneNotSupportedException {
    		return super.clone();
    }
}
public class EmpEquals {
	public static void main(String[] args) {
		Emp e1 = new Emp(11,"Fred",80000);
		Emp e2 = new Emp(11,"Fred",80000);
		System.out.println(e1==e2);//false
		System.out.println(e1.equals(e2));//true
	}
}










