// Runtime polymorphism does NOT exist for properties
// Object slicing: When we assign object of child class to parent reference, only
// parent side properties are assigned since object is sliced/breaked into two parts
// (parent+child)
package runtimepoly;
class Color {
	String name = "COLOR";
	public String getColor() {
		return this.name;
	}
}
class Green extends Color {
	String name = "GREEN";
	public String getColor() {
		return this.name;
	}
}
public class ObjectSlicing {
	public static void main(String[] args) {
		Color obj = new Green();
		System.out.println(obj.name);
		System.out.println(obj.getColor());//GREEN
	}
}

