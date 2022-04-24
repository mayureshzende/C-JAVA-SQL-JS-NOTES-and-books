import java.util.*;

class GreatestOfThreeNo
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the 3 numbers" );

		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int no3=sc.nextInt();

		if(no1 > no2 & no1 > no3)
		{
			System.out.println( " no 1 is greated ");

		}else if( no2 > no1 & no2 > no3)
		{
			System.out.println(" no 2 is greater ");
		}
		else 
		{
			System.out.println(" no 3  is greater ");
		}
	}
}