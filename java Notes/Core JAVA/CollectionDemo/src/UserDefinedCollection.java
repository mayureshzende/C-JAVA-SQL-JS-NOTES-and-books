import java.util.*;
class Emp {
 int id; String name; float salary;
 Emp() {}
 Emp(int id, String name, float salary) {
	 this.id = id ; this.name = name; this.salary = salary;
 }
 public String toString() {
	return "[ID="+id+",name="+name+",salary="+salary+"]\n";
 }
 public int hashCode() {
	return (this.id * this.name.length()) + (int)this.salary; 
 }
 public boolean equals(Object obj) {
	 System.out.println("In equals");
	 if(this == obj) { return true; }
	 if(obj instanceof Emp) {
	  Emp e1 = this;
	  Emp e2 = (Emp)obj;
	  return e1.id == e2.id && e1.name.equals(e2.name) && e1.salary==e2.salary;
	 }
	 return false;
 }
}
public class UserDefinedCollection {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(15,"Fred",18000));
		list.add(new Emp(11,"Geoff",8000));
		list.add(new Emp(16,"Jason",9000));
		list.add(new Emp(1,"John",10000));
		list.add(new Emp(5,"Fred",7000));
		Set<Emp> set = new HashSet<Emp>(list);
		Emp e = new Emp(1,"John",10000);
		System.out.println("List contains: " + list.contains(e));//true
		set.add(e);
		System.out.println(set);//e should not get added
	}
}






