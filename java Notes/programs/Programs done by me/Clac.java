import java.util.*;
class Clac
{

	void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact *=i;
		}
System.out.println(fact);

	}
	public static void main(String[] args) {
		new Clac().fact(5);
	}
}