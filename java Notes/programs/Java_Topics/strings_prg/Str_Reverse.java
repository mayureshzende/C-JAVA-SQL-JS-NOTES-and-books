package strings_prg;
import java.util.*;
public class Str_Reverse {
public static void main(String[] args) {
	String s="mayur is good";// is edud";
	System.out.println(strReverse(s));
	
}
static String strReverse(String s)
{
	char[] c=s.toCharArray();
	for(int i=0,j=c.length-1;i<j;i++,j--)
	{
		char t=c[i];
		c[i]=c[j];
		c[j]=t;
	}
	
	//String s1=new String(c);
	return new String(c);//.trim();
}
}
