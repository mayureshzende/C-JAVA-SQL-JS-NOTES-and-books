//instanceof operator: It checkes that given reference is an object/instance of sepecific class/
//interface. It checks for all classes starting from given class to topmost class(in up direction) 
class X {}
class Y extends X {}
class Z extends Y {}

public class InstanceOfOperator {
	public static void main(String[] args) {
		Y obj = new Y();
		System.out.println(obj instanceof Z);//false
		System.out.println(obj instanceof Y);//true
		System.out.println(obj instanceof X);//true
		System.out.println(obj instanceof Object);//true

	}
}
