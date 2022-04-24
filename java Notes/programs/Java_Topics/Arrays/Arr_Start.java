package Arrays;

import java.util.Arrays;
import java.util.*;

public class Arr_Start {

	public static void main(String[] args) 
	{

	Scanner sc=new Scanner(System.in);
	
	int[] arr=new int[5];
	int[] br= {1,2,4};
	String sr[]=new String[5];
	

	for(int i=0;i<arr.length;i++)
	{
		System.out.printf("\n enter the element for a[%d]= ",i);
		arr[i]=sc.nextInt();
	}
	
	for(int b:arr)
	{
		System.out.print( "["+ b + "]" );
	}
	sc.close();
}
}
