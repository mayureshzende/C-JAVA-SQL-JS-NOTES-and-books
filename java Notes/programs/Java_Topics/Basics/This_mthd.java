package Basics;

public class This_mthd {
	public This_mthd() {
	
		System.out.println("con using new class_name()");
		// TODO Auto-generated constructor stub
	}
void m()
{
	System.out.println("this is m");
	
	
}
void n()
{
	System.out.println("this is n");
	m();
}

public static void main(String[] args) {
	This_mthd t=new This_mthd();
	t.n();
	new This_mthd();
	}
}
