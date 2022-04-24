package Basics;
import java.util.*;

public class cmd_args {
public static void main(String[] args) {
	int a;
	String s;
	float f;
	
	if(args.length < 3)
	{
		System.out.println("pass 3 arguments number,string and float");
	
	}
	
	a=Integer.parseInt(args[0]);
	s=args[1];
	f=Float.parseFloat(args[2]);
	
	emp e=new emp(a,s,f);
	System.out.println(e);
	
}
}

class emp
{
	private int a;
	private String s;
	private float f;
	
	emp()
	{
		
	}

	public emp(int a, String s, float f) {
		super();
		this.a = a;
		this.s = s;
		this.f = f;
	}

	@Override
	public String toString() {
		return "emp [a=" + a + ", s=" + s + ", f=" + f + "]";
	}


}
