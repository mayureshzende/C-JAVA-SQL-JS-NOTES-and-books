package strings_prg;
import java.util.*;
public class Rev_Str_Wbw {
public static void main(String[] args) {
	String s="Best of Luck";
	String rev=revString(s);
System.out.println(rev);

}
static String revString(String s)
{
	String[] s1=s.split(" ");
	String output=" ";
	for(int i=0;i<s1.length;i++)
	{
		output +=rev(s1[i])+" ";
		System.out.println("out at "+i+output);
	}
	return output.trim();
	
}

static String rev(String s)
{
	char[] c=s.toCharArray();
	for(int i=0,j=c.length-1;i<j;i++,j--) 
	{
		char t=c[i];
		c[i]=c[j];
		c[j]=t;
				
	}
	return new String(c);

}

}
