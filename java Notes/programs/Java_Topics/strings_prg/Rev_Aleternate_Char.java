package strings_prg;
import java.util.*;
public class Rev_Aleternate_Char {
public static void main(String... args)
{
	String s="macbok";
	char[] a=s.toCharArray();
	for(int i=0,j=1;j<a.length;j+=2,i+=2)
	{
		char t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
String s1=new String(a);
System.out.println(s1);
}
}
