package strings_prg;
import java.util.*;
public class Str_Vs_StringBuffer_Milli {
static String StringConcate()
{
	String s1="java";
	for(int i=0;i<1000;i++)
	{
		s1=s1+" test";
	}
	return s1;
}

static String StringBuffConcate()
{
	StringBuffer s=new StringBuffer("Best");
	for(int i=0;i<1000;i++)
	{
		s=s.append("test");
	}
	return s.toString();
}
	
	public static void main(String[] args) {
	
	long sysTime=System.currentTimeMillis();
	
	StringConcate();
	
	System.out.println("time tAKEN BY String="+(System.currentTimeMillis()-sysTime)+"ms");
	
	sysTime=System.currentTimeMillis();
	StringBuffConcate();
	System.out.println("time tAKEN BY String Buffer="+(System.currentTimeMillis()-sysTime)+"ms");
}
}
