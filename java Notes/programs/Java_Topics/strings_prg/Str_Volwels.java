package strings_prg;
import java.util.*;
public class Str_Volwels {
public static void main(String[] args) {
	String s="mayuresh Zende";
	s=s.toLowerCase();
	int i=0;
	while(i<s.length())
	{
		if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
		{
			System.out.println("vowvels are="+s.charAt(i));
			
		}
//		else
//		{
//			System.out.println("constant are="+s.charAt(i));
//		}
		i++;
	}
	System.out.println();
	
constant(s);

	
}
static void constant(String s)
{
	int  i=0;
	System.out.println("constant are=");
	while(i<s.length())
	{
		if(s.charAt(i)!='a'|| s.charAt(i)!='e' || s.charAt(i)!='i' || s.charAt(i)!='o' || s.charAt(i)!='u')
		{
			System.out.println(s.charAt(i));
			
		}
	i++;
	}
}
}
