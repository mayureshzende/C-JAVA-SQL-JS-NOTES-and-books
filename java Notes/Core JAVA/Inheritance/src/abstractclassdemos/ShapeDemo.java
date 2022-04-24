package abstractclassdemos;

abstract class Shape {
	abstract float area();
	abstract String getName();
}
class Circle extends Shape {
	float radius;
	Circle(float r) { this.radius = r; }
	float area() {
		return (float)Math.PI *radius*radius;
	}
	String getName() { return "Circle" ; }
}
class Square extends Shape {
	float side;
	Square(float s) { this.side = s; }
	float area() { return side*side;}
	String getName() { return "Square" ; }
}
class Rectangle extends Shape {
	float b,l;
	Rectangle(float b, float l) { this.b = b; this.l = l; }
	float area() { return l*b; }
	String getName() { return "Rectangle" ; }

}
public class ShapeDemo {
	static void calculateArea(Shape s) {
		System.out.println(s.getName() + "=>" + s.area());
	}
	public static void main(String[] args) {
		calculateArea(new Circle(5));
		calculateArea(new Rectangle(5,8));
		calculateArea(new Square(5));
	}
}



















