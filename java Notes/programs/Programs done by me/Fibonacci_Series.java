//package prgms.done;

import java.util.*;
class Fibonacci_Series
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Nubmer");

		int n=sc.nextInt();
		int n1=0,n2=1;
		int[] arr=new int[n];
		arr[0]=0;
		arr[1]=1;
		System.out.print(n1+" "+n2+" ");
		
			for(int i=2;i<n;i++)
			{
				arr[i]=arr[i-2]+arr[i-1];
			System.out.print(arr[i]+" ");
		
		}
		sc.close();
		





	}
}