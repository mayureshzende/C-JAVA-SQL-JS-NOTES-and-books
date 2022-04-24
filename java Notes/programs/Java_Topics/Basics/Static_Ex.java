package Basics;

public class Static_Ex {
static int count=0;
	static void display()
	{
		count=7;
		
	}
	public Static_Ex() {
		count++;
	System.out.println(count);
	// TODO Auto-generated constructor stub
}
	
	public static void main(String[] args) {
		
	Static_Ex.display();
		Static_Ex s1=new Static_Ex();
		Static_Ex s2=new Static_Ex();
		Static_Ex s3=new Static_Ex();
	}
}
