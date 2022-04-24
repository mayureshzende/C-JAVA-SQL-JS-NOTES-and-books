package Arrays;
//import java.util.Arrays;
import java.util.Scanner;;
public class arr_Rev_InCopy {

	static int[] arr_Rev(int[] arr)
	{
		int b[]=new int[arr.length];
		for(int i=0,j=arr.length-1;j>=0;j--,i++) 
		{
			b[j]=arr[i];
		}
		return b;
	}
	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("enter the element for location "+i);
		arr[i]=sc.nextInt();
	}
	System.out.println("Original array is");
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("the reverse array is");
	
	int[] rev=arr_Rev(arr);
	for(int r:rev)
		System.out.print(r+" ");
	
	sc.close();
	
	}
	
}
