package StringExm;

import java.util.*;
import java.lang.*;
public class StringFun {

	public static void main(String[] args) {
		String s1="Mayuresh is a good PRogrammer";
		
		
		System.out.println(" kenth"+s1.length());
		System.out.println(s1.charAt(0));
		
		for(int i=0;i<s1.length();i++)
		{		char ch=s1.charAt(i);
			System.out.println("index  aT  "+i +" char "+ch);
	
		}
		
		System.out.println("char array "+Arrays.toString(s1.toCharArray()));
		
		int count=getCount(s1);
		System.out.println(count);
		System.out.println("split at"+Arrays.toString(s1.split("s")));
	}
	
	static int getCount(String s1)
	{
		String [] w=s1.split("s");
		
		return w.length;
	}
}
