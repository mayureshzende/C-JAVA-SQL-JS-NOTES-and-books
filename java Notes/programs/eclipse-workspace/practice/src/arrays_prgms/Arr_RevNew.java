package arrays_prgms;
import java.util.Arrays;
import java.util.*;
public class Arr_RevNew {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[3];
	
	System.out.println("enter the array elements");
	for(int i=0;i<arr.length;i++) 
	{
	arr[i]=sc.nextInt();	
	}
	
	System.out.println("original array is="+Arrays.toString(arr));
	
	int[] res=rev(arr);
	System.out.println("revrse array is="+Arrays.toString(res));
}


public static int[] rev(int[] arr) 
{
	int b[]=new int[arr.length];//i=arr.length-1;j=0;i>=0;j<arr.length;i--,j++
	/*for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
	{	
	 b[j]=arr[i];
	}*/
	for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
	{
		b[i]=arr[j];
	}	
return b;
}
}