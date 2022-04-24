package Inhertiance_Example;
class Opreation 
{
	int square(int n)
	{
		return n*n;
	}
}
class circle
{
	Opreation op;//aggregation
	double pi=3.14;
    double area(int radius)
    {
    op=new Opreation();
    int rsq=op.square(radius);
    return pi*rsq;
    }
}
public class Aggregation_Ex {
public static void main(String[] args) {
	circle c=new circle();
	double area=c.area(5);
	System.out.println(area);
}
}
