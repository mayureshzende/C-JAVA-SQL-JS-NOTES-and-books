import java.util.*;

class DecimalCompare
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		double d1=sc.nextDouble();
		double d2=sc.nextDouble();

		d1 = d1 * 1000;
		System.out.println(d1);
		d1 = d1 /  1000;

		System.out.println(d1);

		sc.close();
	}
}