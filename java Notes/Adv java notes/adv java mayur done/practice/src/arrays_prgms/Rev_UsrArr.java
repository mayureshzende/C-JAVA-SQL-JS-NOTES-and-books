package arrays_prgms;
import java.util.*;

public class Rev_UsrArr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("\n enter the limit");
	int n=sc.nextInt();
	
	int[] arr=new int[n];
	
	System.out.println("enter the array=");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("original array is="+Arrays.toString(arr));
	rev(arr);
	
}
public static void rev(int[] a)
{
	//int temp=0;
	System.out.println("reverse array is=");

	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(" "+a[i]);	
	}
//	return a;
}
	
	
}
