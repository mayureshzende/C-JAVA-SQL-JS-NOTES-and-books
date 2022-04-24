

abstract class Shape{

	abstract float area();
	abstract String getName();
}


class Square extends Shape
{
	int r;
	//float pi= 3.14f;

	Square(int r)
	{
		this.r = r; 
	}

	 float area()
	{
		return r*r;
	}

 String  getName()
	{
		return " square " ; 
	}

}



class AbstractClass
{

	static void  calculateArea(Shape s)
	{
		System.out.println(" area of"+ s.getName() + "is " + s.area());
	}
	public static void main(String[] args)
	{
	
		calculateArea(new Square(5));
		new Square(6).area();



	} 
}