package Basics;

public class Static_cnt {
int cube=0;
static
{
	System.out.println("in static" );
	//System.exit(0);
}
static int cube(int x)
{
	return x*x*x;
}

public static void main(String[] args) 
{
int res=Static_cnt.cube(5);
System.out.println(res);
Static_cnt s=new Static_cnt();

System.out.println(s.cube(3));
}

}
