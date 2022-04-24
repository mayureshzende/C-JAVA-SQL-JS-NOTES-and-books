package Basics;
import java.util.*;
public class Sort_Optimize {
public static void main(String[] args) {
	int[] a= {1,2,4,3,5,10,7,6,8};
	
	System.out.println(Arrays.toString(a));
	int[] a1=Arrays.copyOf(a, a.length);
	for(int i=0;i<a1.length-1;i++)
	{
		if(a[i]>a1[i+1]) 
		{
			int t=a[i];
			a[i]=a1[i];
			a1[i]=t;
		}
	}
	for(int as:a)
	{
		System.out.println(as);
	}
 }
}
