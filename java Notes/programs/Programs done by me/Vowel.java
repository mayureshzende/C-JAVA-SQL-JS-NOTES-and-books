import java.util.*;


class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		char c=sc.next().charAt(0);

		String s=c+"";
		System.out.println(s.length());

		if( (c >='a' & c <= 'z') | (c >='A' & c <='Z') )
		{
			if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c=='u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c=='U' )
			{
				System.out.println(" is vowel ");
			}
			else 
			{
				System.out.println(" is constant ");
			}
		}
		else
		{
			System.out.println(" enter the valid character ");
		}
	}
}