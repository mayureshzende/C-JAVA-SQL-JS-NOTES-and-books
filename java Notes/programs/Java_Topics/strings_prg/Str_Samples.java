package strings_prg;
import java.util.*;
public class Str_Samples {
public static void main(String[] args) {
	String s="mayur";
	//System.out.println();
	strOp(s);
	strBuff();
	strBuilder();
}


static void strOp(String s)
{
	long starttime=System.currentTimeMillis();
	//System.out.println("current time is "+starttime);
	for(int i=0;i<100000;i++)
	s=s+"esh";
//	System.out.println(s);
	System.out.println("time afeter opreation="+(System.currentTimeMillis()-starttime));
	//return s;
}

static void strBuff()
{
	long starttime=System.currentTimeMillis();
	StringBuffer sb=new StringBuffer("mayur");
	for(int i=0;i<100000;i++)
	{
		sb.append("esh");
	}
		System.out.println("time taken by string budffer is "+(System.currentTimeMillis()-starttime  ));
}
static void strBuilder()
{
	long starttime=System.currentTimeMillis();
	StringBuilder sb1=new StringBuilder("mayur");
	for(int i=0;i<10000;i++)
	{	sb1.append("esh"); }
	System.out.println("time taken by string builder is "+(System.currentTimeMillis()-starttime  ));
	
}
}
