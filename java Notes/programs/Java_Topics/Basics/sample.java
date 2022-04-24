package Basics;
import java.util.*;
public class sample 
{

	
	public static void main(String[] args) 
	{
		int a=10,b=20;
		float f=10.5f;
		int c=(int)f;
		
		
		System.out.println(10>>1);
		
		sample s=new sample();
		int res=s.add(a,b);

		System.out.println(" addition is "+res);
		System.out.printf(" %d + %d = %d %% \n",a,b,res);
		
for(int i=1;i<=3;i++)
{
	for(int j=1;j<=3;j++)
	{
		if(i==2 && j== 2)
		continue;
		System.out.println(i + " " +j);
	}
	//System.out.println();
}

	}
public int add(int l,int m )
{
	return l+m;
}
	
}


